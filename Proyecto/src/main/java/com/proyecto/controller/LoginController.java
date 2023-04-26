package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        // Aquí iría la lógica de validación de usuario y contraseña
        // Si el usuario es válido, se redirige a la página de inicio
        // Si el usuario es inválido, se muestra un mensaje de error en la página de login
        return "redirect:/home";
    }
}