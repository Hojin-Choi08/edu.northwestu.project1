package edu.northwestu.project1.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("weather_alerts")
public class WeatherAlert {

    @Id
    private String id;

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
