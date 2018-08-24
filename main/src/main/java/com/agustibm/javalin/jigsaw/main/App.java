package com.agustibm.javalin.jigsaw.main;

import com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;
import com.google.inject.Guice;

import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        ServiceLoader<JavalinServerModule> modules = ServiceLoader.load( JavalinServerModule.class );
        if (!modules.iterator().hasNext()) {
            System.out.println( "Hey, I have no services for mount!" );
        } else {
            System.out.println("Loading next modules:");
            modules.forEach( module -> System.out.println("-> " + module.getClass().getSimpleName()) );
        }

        final ServerModule serverModule = ServerModule.create( modules );
        var injector = Guice.createInjector( serverModule );
        injector.getInstance( Startup.class ).boot();
    }
}
