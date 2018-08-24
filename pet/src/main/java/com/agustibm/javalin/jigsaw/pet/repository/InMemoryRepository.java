package com.agustibm.javalin.jigsaw.pet.repository;

import java.util.Arrays;
import java.util.List;

public class InMemoryRepository implements PetRepository{
    private List<String> pets = Arrays.asList("Dog", "Cat");

    public List<String> getAllPets() {
        return pets;
    }
}
