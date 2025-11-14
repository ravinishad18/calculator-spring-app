package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/")
    public String home() {
        return "Hello from Calculator Spring Boot App!";
    }
}
