package com.agustibm.javalin.jigsaw.user.repository;

import com.agustibm.javalin.jigsaw.repository.Entity;
import com.agustibm.javalin.jigsaw.repository.RepositoryInMemory;
import com.agustibm.javalin.jigsaw.user.entity.User;
import com.google.inject.Singleton;

import java.util.List;
import java.util.stream.Collectors;

@Singleton
class InMemoryRepository extends RepositoryInMemory<User> implements UserRepository  {

    public InMemoryRepository() {
        save( new User( "Bob" ) );
        save( new User( "Kate" ) );
        save( new User( "John" ) );
    }

    public List<String> getAllUsers() {
        return super.find().stream().map( user -> user.name ).collect( Collectors.toList());
    }

    @Override
    protected Entity<User> transformEntity(User entity) {
        return new UserDB(entity);
    }

    private class UserDB implements Entity<User> {
        private User entity;

        public UserDB(User entity) {
            this.entity = entity;
        }


        @Override
        public String getID() {
            return entity.name;
        }

        @Override
        public User getEntity() {
            return entity;
        }
    }
}
