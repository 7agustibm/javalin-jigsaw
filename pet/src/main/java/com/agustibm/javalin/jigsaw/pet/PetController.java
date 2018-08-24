package com.agustibm.javalin.jigsaw.pet;

import com.agustibm.javalin.jigsaw.pet.services.PetService;
import com.google.inject.Inject;
import io.javalin.Context;

public class PetController {
    private PetService petService;

    @Inject
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public void run(Context ctx) {
        ctx.json(petService.getAllPet());
    }
}
