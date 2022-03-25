package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
    
    @GetMapping("/friend")
    public String helloMyFriends() {
        return "Hello my friends";
    }
    
    @GetMapping("/love")
    public String helloMyLove() {
        return "Hello my love";
    }
}
