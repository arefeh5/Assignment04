package com.A4.Assignment04;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animalId;

    @Column(nullable = false)
    private String scientificName;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String habitat;

    private String description;

    public int getAnimalId() {
        return animalId;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDescription() {
        return description;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
