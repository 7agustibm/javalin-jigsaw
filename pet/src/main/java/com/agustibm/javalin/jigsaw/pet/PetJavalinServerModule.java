package com.agustibm.javalin.jigsaw.pet;

import com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;
import com.google.inject.AbstractModule;

public class PetJavalinServerModule  implements JavalinServerModule {
    @Override
    public AbstractModule getModule() {
        return new PetModule();
    }
}
