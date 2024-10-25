package com.example.weatherapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

public class WeatherResponse {

    @JsonProperty("current_condition")
    private List<CurrentCondition> currentCondition;

    @JsonProperty("nearest_area")
    private List<NearestArea> nearestArea;

    @JsonProperty("request")
    private List<Request> request;

    @JsonProperty("weather")
    private List<Weather> weather;

    // Getters and Setters

    public List<CurrentCondition> getCurrentCondition() {
        return currentCondition != null ? currentCondition : Collections.emptyList();
    }

    public void setCurrentCondition(List<CurrentCondition> currentCondition) {
        this.currentCondition = currentCondition;
    }

    public List<NearestArea> getNearestArea() {
        return nearestArea != null ? nearestArea : Collections.emptyList();
    }

    public void setNearestArea(List<NearestArea> nearestArea) {
        this.nearestArea = nearestArea;
    }

    public List<Request> getRequest() {
        return request != null ? request : Collections.emptyList();
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }

    public List<Weather> getWeather() {
        return weather != null ? weather : Collections.emptyList();
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    // Inner classes...

    public static class CurrentCondition {
        @JsonProperty("FeelsLikeC")
        private String feelsLikeC;

        @JsonProperty("cloudcover")
        private String cloudCover;

        @JsonProperty("humidity")
        private String humidity;

        @JsonProperty("localObsDateTime")
        private String localObsDateTime;

        @JsonProperty("observation_time")
        private String observationTime;

        @JsonProperty("precipInches")
        private String precipInches;

        @JsonProperty("pressure")
        private String pressure;

        @JsonProperty("temp_C")
        private String tempC;

        @JsonProperty("weatherDesc")
        private List<WeatherDesc> weatherDesc;

        @JsonProperty("windspeedKmph")
        private String windspeedKmph;

        // Getters and Setters

        public String getFeelsLikeC() {
            return feelsLikeC;
        }

        public void setFeelsLikeC(String feelsLikeC) {
            this.feelsLikeC = feelsLikeC;
        }

        public String getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(String cloudCover) {
            this.cloudCover = cloudCover;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getLocalObsDateTime() {
            return localObsDateTime;
        }

        public void setLocalObsDateTime(String localObsDateTime) {
            this.localObsDateTime = localObsDateTime;
        }

        public String getObservationTime() {
            return observationTime;
        }

        public void setObservationTime(String observationTime) {
            this.observationTime = observationTime;
        }

        public String getPrecipInches() {
            return precipInches;
        }

        public void setPrecipInches(String precipInches) {
            this.precipInches = precipInches;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getTempC() {
            return tempC;
        }

        public void setTempC(String tempC) {
            this.tempC = tempC;
        }

        public List<WeatherDesc> getWeatherDesc() {
            return weatherDesc != null ? weatherDesc : Collections.emptyList();
        }

        public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
            this.weatherDesc = weatherDesc;
        }

        public String getWindspeedKmph() {
            return windspeedKmph;
        }

        public void setWindspeedKmph(String windspeedKmph) {
            this.windspeedKmph = windspeedKmph;
        }
    }

    public static class NearestArea {
        @JsonProperty("areaName")
        private List<AreaName> areaName;

        @JsonProperty("country")
        private List<Country> country;

        @JsonProperty("latitude")
        private String latitude;

        @JsonProperty("longitude")
        private String longitude;

        @JsonProperty("population")
        private String population;

        @JsonProperty("region")
        private List<Region> region;

        // Getters and Setters

        public List<AreaName> getAreaName() {
            return areaName != null ? areaName : Collections.emptyList();
        }

        public void setAreaName(List<AreaName> areaName) {
            this.areaName = areaName;
        }

        public List<Country> getCountry() {
            return country != null ? country : Collections.emptyList();
        }

        public void setCountry(List<Country> country) {
            this.country = country;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }

        public List<Region> getRegion() {
            return region != null ? region : Collections.emptyList();
        }

        public void setRegion(List<Region> region) {
            this.region = region;
        }
    }

    public static class AreaName {
        @JsonProperty("value")
        private String value;

        // Getter and Setter
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Country {
        @JsonProperty("value")
        private String value;

        // Getter and Setter
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Region {
        @JsonProperty("value")
        private String value;

        // Getter and Setter
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Request {
        @JsonProperty("query")
        private String query;

        @JsonProperty("type")
        private String type;

        // Getters and Setters

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Weather {
        @JsonProperty("date")
        private String date;

        @JsonProperty("avgtempC")
        private String avgTempC;

        @JsonProperty("astronomy")
        private List<Astronomy> astronomy;

        @JsonProperty("hourly")
        private List<Hourly> hourly;

        // Getters and Setters

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAvgTempC() {
            return avgTempC;
        }

        public void setAvgTempC(String avgTempC) {
            this.avgTempC = avgTempC;
        }

        public List<Astronomy> getAstronomy() {
            return astronomy != null ? astronomy : Collections.emptyList();
        }

        public void setAstronomy(List<Astronomy> astronomy) {
            this.astronomy = astronomy;
        }

        public List<Hourly> getHourly() {
            return hourly != null ? hourly : Collections.emptyList();
        }

        public void setHourly(List<Hourly> hourly) {
            this.hourly = hourly;
        }
    }

    public static class Astronomy {
        @JsonProperty("moon_illumination")
        private String moonIllumination;

        @JsonProperty("moon_phase")
        private String moonPhase;

        @JsonProperty("moonrise")
        private String moonrise;

        @JsonProperty("moonset")
        private String moonset;

        @JsonProperty("sunrise")
        private String sunrise;

        @JsonProperty("sunset")
        private String sunset;

        // Getters and Setters

        public String getMoonIllumination() {
            return moonIllumination;
        }

        public void setMoonIllumination(String moonIllumination) {
            this.moonIllumination = moonIllumination;
        }

        public String getMoonPhase() {
            return moonPhase;
        }

        public void setMoonPhase(String moonPhase) {
            this.moonPhase = moonPhase;
        }

        public String getMoonrise() {
            return moonrise;
        }

        public void setMoonrise(String moonrise) {
            this.moonrise = moonrise;
        }

        public String getMoonset() {
            return moonset;
        }

        public void setMoonset(String moonset) {
            this.moonset = moonset;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }
    }

    public static class Hourly {
        @JsonProperty("FeelsLikeC")
        private String feelsLikeC;

        @JsonProperty("cloudcover")
        private String cloudCover;

        @JsonProperty("humidity")
        private String humidity;

        @JsonProperty("temp_C")
        private String tempC;

        @JsonProperty("time")
        private String time;

        @JsonProperty("weatherDesc")
        private List<WeatherDesc> weatherDesc;

        @JsonProperty("windspeedKmph")
        private String windspeedKmph;

        // Getters and Setters

        public String getFeelsLikeC() {
            return feelsLikeC;
        }

        public void setFeelsLikeC(String feelsLikeC) {
            this.feelsLikeC = feelsLikeC;
        }

        public String getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(String cloudCover) {
            this.cloudCover = cloudCover;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getTempC() {
            return tempC;
        }

        public void setTempC(String tempC) {
            this.tempC = tempC;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public List<WeatherDesc> getWeatherDesc() {
            return weatherDesc != null ? weatherDesc : Collections.emptyList();
        }

        public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
            this.weatherDesc = weatherDesc;
        }

        public String getWindspeedKmph() {
            return windspeedKmph;
        }

        public void setWindspeedKmph(String windspeedKmph) {
            this.windspeedKmph = windspeedKmph;
        }
    }

    public static class WeatherDesc {
        @JsonProperty("value")
        private String value;

        // Getter and Setter
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
