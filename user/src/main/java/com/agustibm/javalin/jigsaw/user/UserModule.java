package com.agustibm.javalin.jigsaw.user;

import com.agustibm.javalin.jigsaw.loadmodules.Routing;
import com.agustibm.javalin.jigsaw.user.repository.UserRepositoryModule;
import com.agustibm.javalin.jigsaw.user.services.UserServiceModule;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class UserModule extends AbstractModule {

    @Override
    protected void configure() {
        bind( UserController.class );
        install( new UserServiceModule() );
        install( new UserRepositoryModule() );
        Multibinder.newSetBinder( binder(), Routing.class ).addBinding().to( UserRouting.class );
    }
}