package org.keyin.Event;

import org.keyin.Person.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private String eventType;
    private String eventDescription;
    private boolean requireUserResponse;
    private String eventEffect;
    private double eventFrequency;

    @ManyToMany(mappedBy = "lifeEvents")
    private List<Person> persons = new ArrayList<>();

    //Default Constructor
    public Event() {}

    public Event(String eventName, String eventType, String eventDescription, boolean requireUserResponse, String eventEffect, double eventFrequency) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.requireUserResponse = requireUserResponse;
        this.eventEffect = eventEffect;
        this.eventFrequency = eventFrequency;
    }

    //Setters and Getters
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setRequireUserResponse(boolean requireUserResponse) {
        this.requireUserResponse = requireUserResponse;
    }

    public boolean getRequireUserResponse() {
        return requireUserResponse;
    }

    public void setEventEffect(String eventEffect) {
        this.eventEffect = eventEffect;
    }

    public String getEventEffect() {
        return eventEffect;
    }

    public void setEventFrequency(double eventFrequency) {
        this.eventFrequency = eventFrequency;
    }

    public double getEventFrequency() {
        return eventFrequency;
    }
}
