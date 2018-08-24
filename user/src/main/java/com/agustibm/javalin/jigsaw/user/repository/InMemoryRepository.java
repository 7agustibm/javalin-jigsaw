package com.agustibm.javalin.jigsaw.user.repository;

import com.google.inject.Singleton;

import java.util.Arrays;
import java.util.List;

@Singleton
class InMemoryRepository implements UserRepository  {
    private List<String> users = Arrays.asList("Bob", "Kate", "John");

    public List<String> getAllUsers() {
        return users;
    }
}
