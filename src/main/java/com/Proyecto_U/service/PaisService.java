/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto_U.service;

import com.Proyecto_U.entity.Pais;
import com.Proyecto_U.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maria
 */
@Service
public class PaisService implements IPaisService {
    
    //Inyeccion de dependecias
    @Autowired
    private PaisRepository  paisRepository;

    
    @Override
    public List<Pais> listCountry(){
        return (List<Pais>) paisRepository.findAll();
    }
}
