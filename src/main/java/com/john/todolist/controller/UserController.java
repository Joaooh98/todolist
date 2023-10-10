package com.john.todolist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller // utiliza quando temos paginas e templetes
@RestController // utilizada para construcao de uma API
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getName());
    }
}
