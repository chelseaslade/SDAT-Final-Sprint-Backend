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

    @ManyToMany(mappedBy = "healthConditions")
    private List<Person> affectedPersons = new ArrayList<>();

    //Setters and Getters
    public Long getId() {
        return id;
    }
}
