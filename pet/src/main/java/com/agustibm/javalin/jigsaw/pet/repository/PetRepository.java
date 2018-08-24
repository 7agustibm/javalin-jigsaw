package com.agustibm.javalin.jigsaw.pet.repository;

import com.agustibm.javalin.jigsaw.pet.entity.Pet;

import java.util.List;

public interface PetRepository {
    List<Pet> getAllPets();
}
