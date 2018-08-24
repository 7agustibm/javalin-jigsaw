module com.agustibm.javalin.jigsaw.pet {
    exports com.agustibm.javalin.jigsaw.pet;
    exports com.agustibm.javalin.jigsaw.pet.services;
    exports com.agustibm.javalin.jigsaw.pet.repository;
    exports com.agustibm.javalin.jigsaw.pet.entity;

    requires com.agustibm.javalin.jigsaw.loadmodules;
    requires com.google.guice;
    requires javalin;
    requires com.agustibm.javalin.jigsaw.repository;

    uses com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;

    provides com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule
            with com.agustibm.javalin.jigsaw.pet.PetJavalinServerModule;

}