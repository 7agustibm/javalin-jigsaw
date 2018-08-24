package com.agustibm.javalin.jigsaw.user.services;

import com.agustibm.javalin.jigsaw.user.repository.UserRepository;
import com.google.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

class DefaultUserService implements UserService {
    private UserRepository userRepository;

    @Inject
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getAllUsersUppercase() {
        var users = userRepository.getAllUsers();
        return users.parallelStream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
}
