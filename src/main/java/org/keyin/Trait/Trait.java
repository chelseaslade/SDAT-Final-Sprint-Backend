package org.keyin.Trait;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trait {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String traitName;
    private String traitDescription;
    private String traitType;
    private String traitEffect;

    //Default Constructor
    public Trait() {
    }

    public Trait(String traitName, String traitDescription, String traitType, String traitEffect) {
        this.traitName = traitName;
        this.traitDescription = traitDescription;
        this.traitType = traitType;
        this.traitEffect = traitEffect;
    }

    //Setters and Getters

    public Long getId() {
        return id;
    }

    public String getTraitName() {
        return traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public String getTraitDescription() {
        return traitDescription;
    }

    public void setTraitDescription(String traitDescription) {
        this.traitDescription = traitDescription;
    }

    public String getTraitType() {
        return traitType;
    }

    public void setTraitType(String traitType) {
        this.traitType = traitType;
    }

    public String getTraitEffect() {
        return traitEffect;
    }

    public void setTraitEffect(String traitEffect) {
        this.traitEffect = traitEffect;
    }
}
