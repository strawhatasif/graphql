package com.fun.graphql.controller;

import com.fun.graphql.model.Review;
import com.fun.graphql.model.User;
import com.fun.graphql.service.UserService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @SchemaMapping(typeName = "Query",value = "allUsers")
    public List<User> retrieveAllUsers() {
        return userService.retrieveAllUsers();
    }
}
