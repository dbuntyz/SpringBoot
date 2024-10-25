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

# Copy the JAR file to the image
COPY --from=build /app/target/*.jar app.jar

# Create a non-privileged user
RUN adduser --disabled-password --gecos "" appuser
USER appuser

# Expose the application port
EXPOSE 8080

# Set the entry point for the application
ENTRYPOINT ["java", "-jar", "app.jar"]
