package com.agustibm.javalin.jigsaw.pet.repository;

import com.agustibm.javalin.jigsaw.pet.entity.Pet;
import com.agustibm.javalin.jigsaw.pet.repository.entity.PetDB;
import com.agustibm.javalin.jigsaw.repository.Entity;
import com.agustibm.javalin.jigsaw.repository.RepositoryInMemory;

import java.util.Arrays;
import java.util.List;

public class InMemoryRepository extends RepositoryInMemory<Pet> implements PetRepository{

    public InMemoryRepository() {
        save( new Pet( "Dog" ) );
        save( new Pet( "Cat" ) );
    }

    public List<Pet> getAllPets() {
        return find();
    }

    @Override
    protected Entity<Pet> transformEntity(Pet entity) {
        return new PetDB(entity);
    }
}
