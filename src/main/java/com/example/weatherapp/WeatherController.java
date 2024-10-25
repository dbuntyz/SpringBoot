package com.example.weatherapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    private final RestTemplate restTemplate;  // Use RestTemplate as a bean

    // Constructor injection for RestTemplate
    public WeatherController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String home() {
        return "index"; // returns index.html
    }

    @GetMapping("/weather")  // This should match the URL you are trying to access
    public String getWeather(@RequestParam("city") String city, Model model) {  // Specify parameter name
        if (city == null || city.trim().isEmpty()) {
            model.addAttribute("error", "City name is required.");
            return "index";  // Return the template with an error message
        }

        try {
            String apiUrl = "https://wttr.in/" + city + "?format=j1";
            WeatherResponse weatherResponse = restTemplate.getForObject(apiUrl, WeatherResponse.class);

            if (weatherResponse != null) {
                model.addAttribute("weatherResponse", weatherResponse);
            } else {
                model.addAttribute("error", "No weather data found for " + city);
            }
        } catch (Exception e) {
            model.addAttribute("error", "Unable to fetch weather data for " + city + ": " + e.getMessage());
        }
        return "index";  // Make sure this returns a valid template name
    }
}
