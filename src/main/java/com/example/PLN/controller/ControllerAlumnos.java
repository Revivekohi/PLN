/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PLN.controller;

import com.example.PLN.entity.Alumnos;
import com.example.PLN.service.ServiceAlumnos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author reviv
 */
@RestController
@RequestMapping("/alumnos")
public class ControllerAlumnos {
@Autowired
private ServiceAlumnos alumnosService;

@GetMapping("/listarAlumnos")
public ResponseEntity<List<Alumnos>> getAllUsuarios() {
    try {
        List<Alumnos> alumnos = alumnosService.listaAlumnos();
        return new ResponseEntity<>(alumnos, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

        
                
                
                
}
