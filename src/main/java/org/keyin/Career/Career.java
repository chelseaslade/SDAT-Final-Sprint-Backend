package org.keyin.Career;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Career {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String careerTitle;
    private String salary;
    private String educationRequirements;
    private String careerEffect; //ex. -10 health due to stress

    public Long getId() {
        return id;
    }
}
