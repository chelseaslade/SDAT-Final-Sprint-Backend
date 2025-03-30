package org.keyin.Person;

import org.keyin.Career.Career;
import org.keyin.Education.Education;
import org.keyin.Event.Event;
import org.keyin.Trait.Trait;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String surname;
    private String gender;
    private int age;

    //Stats
    private int happiness = 100;
    private int health = 100;
    private int intelligence;
    private int appearance;
    private double funds = 0.00;

    @ManyToMany
    @JoinTable(
            name = "person_traits",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id")
    )
    private List<Trait> traits = new ArrayList<>();

    @OneToMany
    private List<Event> lifeEvents;
    @OneToMany
    private List<Person> familyMembers;

    @ManyToMany
    private List<Education> education;

    @ManyToOne
    private Career career;

    //Default Constructor
    public Person() {}

    public Person(String firstName, String surname, String gender, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    //Setters and Getters
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }
}
