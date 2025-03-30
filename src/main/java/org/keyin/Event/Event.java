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

    @ManyToMany(mappedBy = "lifeEvents")
    private List<Person> persons = new ArrayList<>();

    //Default Constructor
    public Event() {}


}
