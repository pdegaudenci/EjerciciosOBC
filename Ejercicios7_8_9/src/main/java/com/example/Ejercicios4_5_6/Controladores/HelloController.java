package com.example.Ejercicios4_5_6.Controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludar")
    public String saludo() {
    return "Hola a todos";
    }
}
