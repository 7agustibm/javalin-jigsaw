package com.agustibm.javalin.jigsaw.repository;

public interface Entity<T> {
    String getID();
    T getEntity();
}
