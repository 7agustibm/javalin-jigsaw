module com.agustibm.javalin.jigsaw.main {
    requires com.agustibm.javalin.jigsaw.loadmodules;
    requires com.google.guice;
    requires javalin;

    uses com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;

    exports com.agustibm.javalin.jigsaw.main;
}