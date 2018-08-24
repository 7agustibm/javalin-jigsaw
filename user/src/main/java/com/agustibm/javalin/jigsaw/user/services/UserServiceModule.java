package com.agustibm.javalin.jigsaw.user.services;


import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class UserServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind( UserService.class ).to( DefaultUserService.class ).in( Singleton.class );
    }
}
