package com.agustibm.javalin.jigsaw.user;

import com.agustibm.javalin.jigsaw.loadmodules.JavalinServerModule;
import com.google.inject.AbstractModule;

public class UserJavalinServerModule implements JavalinServerModule {
    @Override
    public AbstractModule getModule() {
        return new UserModule();
    }
}
