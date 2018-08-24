package com.agustibm.javalin.jigsaw.pet.repository.entity;

import com.agustibm.javalin.jigsaw.pet.entity.Pet;
import com.agustibm.javalin.jigsaw.repository.Entity;

public class PetDB implements Entity<Pet> {
    private final Pet entity;

    public PetDB(Pet entity) {
        this.entity = entity;
    }

    @Override
    public String getID() {
        return entity.type;
    }

    @Override
    public Pet getEntity() {
        return entity;
    }
}
