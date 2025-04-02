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

    @OneToMany(mappedBy = "career")
    private List<Person> employees = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCareerTitle() {
        return careerTitle;
    }

    public void setCareerTitle(String careerTitle) {
        this.careerTitle = careerTitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEducationRequirements() {
        return educationRequirements;
    }

    public void setEducationRequirements(String educationRequirements) {
        this.educationRequirements = educationRequirements;
    }
}
