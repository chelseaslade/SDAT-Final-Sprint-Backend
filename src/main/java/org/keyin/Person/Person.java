package org.keyin.Person;

import org.keyin.Event.Event;
import org.keyin.Trait.Trait;

import javax.persistence.*;
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

    @OneToMany
    private List<Trait> traits;

    @OneToMany
    private List<Event> lifeEvents;

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
}
