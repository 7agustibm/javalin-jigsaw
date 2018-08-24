package com.agustibm.javalin.jigsaw.repository;

import java.util.List;

public interface Repository<T> {
    void save(T entity);
    List<T> find();
    T find(String entity);
}
