package com.agustibm.javalin.jigsaw.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class RepositoryInMemory<T> implements Repository<T> {
    private List<Entity<T>> repository = new ArrayList<Entity<T>>(  );

    @Override
    public void save(T entity) {
        repository.add(  transformEntity(entity) );
    }

    protected abstract Entity<T> transformEntity(T entity);

    @Override
    public List<T> find() {
        return repository.stream().map( Entity::getEntity ).collect( Collectors.toList());
    }

    @Override
    public T find(String id) {
        return repository.stream().filter( entity -> id.equals( entity.getID() ) )
                .map( Entity::getEntity )
                .findFirst()
                .orElse(null);
    }

}
