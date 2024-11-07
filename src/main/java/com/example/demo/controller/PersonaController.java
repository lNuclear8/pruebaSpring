package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class PersonaController {
    @GetMapping("/crearPersona")
    public PersonaDTO crearDavid(){
       return PersonaDTO.builder().nombre("David").edad(21).build();
    }
}
