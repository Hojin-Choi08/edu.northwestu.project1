package edu.northwestu.project1.response;

import lombok.Data;

@Data
public class WeatherAlertProperties {
    private String sent;
    private String effective;
    private String expires;
    private String status;
    private String messageType;
    private String severity;
    private String certainty;
    private String urgency;
    private String sender;
    private String description;
    private String instruction;

}
