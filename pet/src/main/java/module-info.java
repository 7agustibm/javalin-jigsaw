module com.agustibm.javalin.jigsaw.pet {
    exports com.agustibm.javalin.jigsaw.pet;
    exports com.agustibm.javalin.jigsaw.pet.services;
    exports com.agustibm.javalin.jigsaw.pet.repository;

    requires com.agustibm.javalin.jigsaw.loadmodules;
    requires com.google.guice;
    requires javalin;

    uses com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;

    provides com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule
            with com.agustibm.javalin.jigsaw.pet.PetJavalinServerModule;

}