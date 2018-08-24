package com.agustibm.javalin.jigsaw.pet.services;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class PetServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind( PetService.class ).to( DefaultPetService.class ).in( Singleton.class );
    }
}
