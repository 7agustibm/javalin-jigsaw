package com.agustibm.javalin.jigsaw.pet;

import com.agustibm.javalin.jigsaw.loadmodules.Routing;
import com.agustibm.javalin.jigsaw.pet.repository.PetRepositoryModule;
import com.agustibm.javalin.jigsaw.pet.services.PetServiceModule;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class PetModule extends AbstractModule {
    @Override
    protected void configure() {
        bind( PetController.class );
        install( new PetServiceModule() );
        install( new PetRepositoryModule() );
        Multibinder.newSetBinder( binder(), Routing.class ).addBinding().to( PetRouting.class );
    }
}
