package com.agustibm.javalin.jigsaw.main;

import com.google.inject.Inject;
import io.javalin.Javalin;

public class Startup {
    private Javalin app;

    @Inject
    public Startup(Javalin app) {
        this.app = app;
    }

    public void boot() {
        bindRoutes();
        app.get( "/", ctx -> ctx.result( "Hello World" ) );
        app.port( 7000 );
        app.start();
    }

    private void bindRoutes() {

    }
}
