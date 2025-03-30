package org.keyin.Education;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String educationLevel; //ex. College, University
    private String educationType; //ex. Chemistry, English, Trades, etc
    private String educationRequirements;
    private int educationLength;


    public Long getId() {
        return id;
    }
}
