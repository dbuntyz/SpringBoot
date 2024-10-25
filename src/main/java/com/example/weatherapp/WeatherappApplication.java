package com.example.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherappApplication.class, args);
    }

    // Define RestTemplate as a bean to make it available for dependency injection
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
