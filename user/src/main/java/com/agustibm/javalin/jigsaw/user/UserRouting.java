package com.agustibm.javalin.jigsaw.user;

import com.agustibm.javalin.jigsaw.loadmodules.Routing;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.javalin.Javalin;


import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;

@Singleton
class UserRouting extends Routing<UserController> {
    private Javalin javalin;
    @Inject
    public UserRouting(Javalin javalin) {
        this.javalin = javalin;
    }

    @Override
    public void bindRoutes() {
        javalin.routes(() -> {
            path("api/users", () -> {
                get(ctx -> getController().run(ctx));
            });
        });
    }
}
