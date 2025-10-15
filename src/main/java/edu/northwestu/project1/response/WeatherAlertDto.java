package edu.northwestu.project1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherAlertDto {
    private String Id;

    @JsonProperty("properties")
    private WeatherAlertProperties properties;
}

