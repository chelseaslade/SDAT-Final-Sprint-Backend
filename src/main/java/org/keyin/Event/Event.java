package org.keyin.Event;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    //Default Constructor
    public Event() {}


}
