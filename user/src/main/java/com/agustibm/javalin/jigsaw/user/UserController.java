package com.agustibm.javalin.jigsaw.user;

import com.agustibm.javalin.jigsaw.user.services.UserService;
import com.google.inject.Inject;
import io.javalin.Context;

public class UserController {
    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void run(Context ctx) {
        ctx.json(userService.getAllUsersUppercase());
    }
}
