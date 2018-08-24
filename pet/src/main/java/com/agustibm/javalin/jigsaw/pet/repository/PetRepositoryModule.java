package com.agustibm.javalin.jigsaw.pet.repository;

import com.google.inject.AbstractModule;

public class PetRepositoryModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PetRepository.class).to(InMemoryRepository.class);
    }
}
