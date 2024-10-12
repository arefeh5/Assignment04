package com.A4.Assignment04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/animals")
public class Controller {
    @Autowired(required = false)
    private AnimService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllEntities();
    }

    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable int id) {
        return animalService.getEntityById(id);
    }

    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        animal.setAnimalId(id);
        return animalService.updateAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animalService.deleteAnimal(id);
    }

    @GetMapping("/species/{species}")
    public List<Animal> getAnimalsBySpecies(@PathVariable String species) {
        return animalService.getAnimalsBySpecies(species);
    }

    @GetMapping("/search/{name}")
    public List<Animal> searchAnimalsByName(@PathVariable String name) {
        return animalService.searchAnimalsByName(name);
    }

    @GetMapping("/search/scientific-name/{scientificName}")
    public List<Animal> searchAnimalsByScientificName(@PathVariable String scientificName) {
        return animalService.searchAnimalsByScientificName(scientificName);
    }

}
