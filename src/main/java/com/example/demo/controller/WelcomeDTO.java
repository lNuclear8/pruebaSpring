package com.example.demo.controller;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WelcomeDTO {
    private String mensaje;
}
