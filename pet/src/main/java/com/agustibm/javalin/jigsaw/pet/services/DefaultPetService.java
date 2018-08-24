package com.agustibm.javalin.jigsaw.pet.services;

import com.agustibm.javalin.jigsaw.pet.entity.Pet;
import com.agustibm.javalin.jigsaw.pet.repository.PetRepository;
import com.google.inject.Inject;

import java.util.List;

public class DefaultPetService implements PetService {
    private PetRepository petRepository;

    @Inject
    public DefaultPetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> getAllPet() {
        var pets = petRepository.getAllPets();
        return pets;
    }
}
