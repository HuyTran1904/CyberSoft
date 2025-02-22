package com.example.demo.baitap3.controller;

import com.example.demo.baitap3.entity.User;
import com.example.demo.baitap3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUser(){
        return userService.getAllUser();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
