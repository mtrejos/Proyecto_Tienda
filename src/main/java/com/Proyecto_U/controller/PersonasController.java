/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto_U.controller;

import com.Proyecto_U.entity.Persona;
import com.Proyecto_U.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author maria
 */
@Controller
public class PersonasController {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/personas")
    public String index(Model model){
      List<Persona> listaPersonas=personaService.getAllPerson();
      model.addAttribute("titulo","Personas");
      return "personas";
    }
    
}
