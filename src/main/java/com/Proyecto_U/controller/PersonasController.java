/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto_U.controller;

import com.Proyecto_U.entity.Persona;
import com.Proyecto_U.service.IPersonaService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
      @GetMapping("/personasN")
    public String crearPersona(Model model){
     model.addAttribute("persona", new  Persona());
      return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
    personaService.savePerson(persona);
    return "redirect:/persona";
    }
    
    
    @GetMapping("/delte/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona){
    personaService.delete(idPersona);
    return"redirect:/persona";
    }
    }
