package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public Map<String, String> welcome() {
        return Collections.singletonMap("mensaje", "Soy SpringBoot, saludos desde el backend.");
    }
}
