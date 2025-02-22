package com.example.demo.baitap1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Welcome {
    @GetMapping
    public String welcome(){
        return "Hello cac ban ";
    }
}
