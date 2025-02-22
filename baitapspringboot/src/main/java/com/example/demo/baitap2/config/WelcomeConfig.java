package com.example.demo.baitap2.config;

import com.example.demo.baitap1.Welcome;
import com.example.demo.baitap2.WelcomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeConfig {
    @Bean
    public WelcomeService welcomeMessage(){
        return new WelcomeService();
    }
}
