package com.agustibm.javalin.jigsaw.main;

import com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import io.javalin.Javalin;

import java.util.ServiceLoader;


public class ServerModule extends AbstractModule {
    private ServiceLoader<JavalinServerModule> modules;
    private Javalin app;


    public static ServerModule create(ServiceLoader<JavalinServerModule> modules) {
        return new ServerModule( modules, Javalin.create() );
    }

    public ServerModule(ServiceLoader<JavalinServerModule> modules, Javalin app) {
        this.modules = modules;
        this.app = app;
    }

    protected void configure() {
        modules.forEach( module -> install( module.getModule() ) );
        bind( Javalin.class ).toInstance( app );
        bind( Startup.class ).in( Singleton.class );
    }
}
