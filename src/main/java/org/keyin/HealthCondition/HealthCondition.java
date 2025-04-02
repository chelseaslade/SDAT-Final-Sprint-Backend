package org.keyin.HealthCondition;

import org.keyin.Person.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class HealthCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String conditionName;
    private String conditionDescription;
    private String conditionType; //ex. Chronic, temporary.
    private int conditionEffect; //ex. -10 Health
    private boolean isCurable;
    private int duration; //in "game years"
    private double frequency; // 0 - 0.9 chance (percent)

    @ManyToMany(mappedBy = "healthConditions")
    private List<Person> affectedPersons = new ArrayList<>();

    public HealthCondition() {
    }

    public HealthCondition(String conditionName, String conditionDescription, String conditionType, int conditionEffect, boolean isCurable, int duration, double frequency) {
        this.conditionName = conditionName;
        this.conditionDescription = conditionDescription;
        this.conditionType = conditionType;
        this.conditionEffect = conditionEffect;
        this.isCurable = isCurable;
        this.duration = duration;
        this.frequency = frequency;
    }

    //Setters and Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getConditionDescription() {
        return conditionDescription;
    }

    public void setConditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public int getConditionEffect() {
        return conditionEffect;
    }

    public void setConditionEffect(int conditionEffect) {
        this.conditionEffect = conditionEffect;
    }

    public boolean isCurable() {
        return isCurable;
    }

    public void setCurable(boolean curable) {
        isCurable = curable;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
