package com.agustibm.javalin.jigsaw.user.repository;

import com.google.inject.AbstractModule;

public class UserRepositoryModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserRepository.class).to(InMemoryRepository.class);
    }
}
