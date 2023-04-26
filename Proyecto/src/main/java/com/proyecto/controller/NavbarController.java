package com.proyecto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavbarController {

    @GetMapping("/historiales")
    public String index(Model model) {
        // List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        // model.addAttribute("titulo", "Tabla Concierto");
        //model.addAttribute("conciertodataset", listaConcierto);
        return "historial";
    }

    @GetMapping("/home")
    public String index3(Model model) {
        // List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        // model.addAttribute("titulo", "Tabla Concierto");
        //model.addAttribute("conciertodataset", listaConcierto);
        return "home";
    }
    
    @GetMapping("/inicio")
    public String index4(Model model) {
        // List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        // model.addAttribute("titulo", "Tabla Concierto");
        //model.addAttribute("conciertodataset", listaConcierto);
        return "inicio";
    }
    
    @GetMapping("/resCompra")
    public String index6(Model model) {
        // List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        // model.addAttribute("titulo", "Tabla Concierto");
        //model.addAttribute("conciertodataset", listaConcierto);
        return "resultadocompra";
    }

    @GetMapping("/admin")
    public String index7(Model model) {
        // List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        // model.addAttribute("titulo", "Tabla Concierto");
        //model.addAttribute("conciertodataset", listaConcierto);
        return "admin";
    }
}
