package com.agustibm.javalin.jigsaw.pet.services;

import com.agustibm.javalin.jigsaw.pet.repository.PetRepository;
import com.google.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultPetService implements PetService {
    private PetRepository petRepository;

    @Inject
    public DefaultPetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<String> getAllPetUppercase() {
        var pets = petRepository.getAllPets();
        return pets.parallelStream().map(s -> s.toUpperCase()).collect( Collectors.toList());
    }
}
