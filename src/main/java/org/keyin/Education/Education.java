package org.keyin.Education;

import org.keyin.Person.Person;

import javax.persistence.*;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String educationLevel; //ex. College, University
    private String educationType; //ex. Chemistry, English, Trades, etc
    private String educationRequirements;
    private int educationLength;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Long getId() {
        return id;
    }
}
