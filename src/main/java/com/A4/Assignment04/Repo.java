package com.A4.Assignment04;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repo extends JpaRepository<Animal, Integer> {
    List<Animal> findByName(String name);
    List<Animal> findByScientificName(String scientificName);
    List<Animal> findBySpecies(String species);



}
