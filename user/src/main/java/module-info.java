module com.agustibm.javalin.jigsaw.user {
    exports com.agustibm.javalin.jigsaw.user;
    exports com.agustibm.javalin.jigsaw.user.services;
    exports com.agustibm.javalin.jigsaw.user.repository;

    requires com.agustibm.javalin.jigsaw.loadmodules;
    requires com.google.guice;
    requires javalin;
    requires com.agustibm.javalin.jigsaw.repository;

    uses com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;

    provides com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule
            with com.agustibm.javalin.jigsaw.user.UserJavalinServerModule;

}