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
    private String educationRequirements; //Highest required (ex, high school, elementary, none)
    private double educationLength;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    public String getEducationRequirements() {
        return educationRequirements;
    }

    public void setEducationRequirements(String educationRequirements) {
        this.educationRequirements = educationRequirements;
    }

    public double getEducationLength() {
        return educationLength;
    }

    public void setEducationLength(double educationLength) {
        this.educationLength = educationLength;
    }
}
