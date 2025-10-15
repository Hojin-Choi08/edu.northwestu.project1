package edu.northwestu.project1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherAlertResponse {

    @JsonProperty("features")
    List<WeatherAlertDto> alerts;
}
