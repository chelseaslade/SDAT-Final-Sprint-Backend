package org.keyin.Career;

import org.keyin.Person.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Career {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String careerTitle;
    private String salary;
    private String educationRequirements;
    private String careerEffect; //ex. -10 health due to stress

    @OneToMany(mappedBy = "career")
    private List<Person> employees = new ArrayList<>();

    public Long getId() {
        return id;
    }
}
