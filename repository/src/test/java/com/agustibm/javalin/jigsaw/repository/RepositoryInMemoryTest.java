package com.agustibm.javalin.jigsaw.repository;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryInMemoryTest {
    final Dummy entity = new Dummy();
    final String id = entity.getID();
    Repository<Dummy> repository;

    @Before
    public void setUp() {
        repository = new RepositoryInMemory<Dummy>() {
            @Override
            protected Entity<Dummy> transformEntity(Dummy entity) {
                return new DummyDB(entity);
            }
        };
    }

    @Test
    public void saveAndGetAll() {
        repository.save( entity );
        assertEquals( 1, repository.find().size() );
    }

    @Test
    public void saveAndGetOne() {
        repository.save( entity );
        assertEquals( id, repository.find( id ).getID() );
    }

    private class Dummy {

        public String getID() {
            return "id";
        }

    }

    private class DummyDB  implements Entity<Dummy>{
        private Dummy entity;

        public DummyDB(Dummy entity) {
            this.entity = entity;
        }

        @Override
        public String getID() {
            return entity.getID();
        }

        @Override
        public Dummy getEntity() {
            return entity;
        }
    }
}