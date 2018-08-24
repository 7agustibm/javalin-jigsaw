package com.agustibm.javalin.jigsaw.pet;

import com.agustibm.javalin.jigsaw.loadmodules.Routing;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;

@Singleton
public class PetRouting extends Routing<PetController> {
    private Javalin javalin;
    @Inject
    public PetRouting(Javalin javalin) {
        this.javalin = javalin;
    }

    @Override
    public void bindRoutes() {
        javalin.routes(() -> {
            path("api/pets", () -> {
                get(ctx -> getController().run(ctx));
            });
        });
    }
}
