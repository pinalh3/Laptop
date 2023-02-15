package com.example.springLaptop2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hola(){
        return "Saludos desde Venezuela";
    }
}
