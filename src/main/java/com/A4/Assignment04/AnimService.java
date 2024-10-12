package com.A4.Assignment04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AnimService {
    @Autowired
    private Repo repo;

    public List<Animal> getAllEntities() {
        return repo.findAll();
    }

    public Optional<Animal> getEntityById(int id) {
        return repo.findById(id);
    }

    public Animal addAnimal(Animal animal) {
        return repo.save(animal);
    }

    public Animal updateAnimal(Animal animal) {
        return repo.save(animal);
    }

    public void deleteAnimal(int id) {
        repo.deleteById(id);
    }

    public List<Animal> getAnimalsBySpecies(String species) {
        return repo.findBySpecies(species);
    }

    public List<Animal> searchAnimalsByScientificName(String scientificName) {
        return repo.findByScientificName(scientificName); // Use the new method for partial match
    }

    public List<Animal> searchAnimalsByName(String name) {
        return repo.findByName(name); // Method for searching by name
    }
}
