package com.example.demo.baitap2.controller;

import com.example.demo.baitap2.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Autowired
    private WelcomeService welcomeMessage;

    @GetMapping
    public String welcome(){
        return welcomeMessage.getWelcomeMessage();
    }

}
