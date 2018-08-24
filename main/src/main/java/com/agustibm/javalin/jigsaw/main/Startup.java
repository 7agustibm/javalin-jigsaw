package com.agustibm.javalin.jigsaw.main;

import com.agustibm.javalin.jigsaw.loadmodules.Routing;
import com.google.inject.Inject;
import io.javalin.Javalin;

import java.util.Collections;
import java.util.Set;

public class Startup {
    private Javalin app;

    @Inject(optional = true)
    private Set<Routing> routes = Collections.emptySet();

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
        routes.forEach(r -> r.bindRoutes());
    }
}
