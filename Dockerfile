# Use the official Eclipse Temurin image for Java 17
FROM eclipse-temurin:17-jdk-jammy AS build

# Set the working directory
WORKDIR /app

# Copy Maven wrapper and configuration files
COPY --chmod=0755 mvnw ./
COPY .mvn/ .mvn/
COPY pom.xml ./

# Download dependencies (use cache)
RUN ./mvnw dependency:go-offline -DskipTests

# Copy source code
COPY src ./src

# Build the application and create the JAR
RUN ./mvnw package -DskipTests

# Use the JRE image for the final stage
FROM eclipse-temurin:17-jre-jammy

# Set the working directory
WORKDIR /app

# Copy the JAR file and extract layers
COPY --from=build /app/target/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract --destination ./extracted

# Create a non-privileged user
RUN adduser --disabled-password --gecos "" appuser
USER appuser

# Copy the extracted files
COPY --from=build /app/extracted/dependencies/ ./dependencies/
COPY --from=build /app/extracted/spring-boot-loader/ ./spring-boot-loader/
COPY --from=build /app/extracted/snapshot-dependencies/ ./snapshot-dependencies/
COPY --from=build /app/extracted/application/ ./application/

# Expose the application port
EXPOSE 8080

# Set the entry point for the application
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]
