/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PLN.servicelmpl;

import com.example.PLN.entity.Alumnos;
import com.example.PLN.repository.AlumnosRepository;
import com.example.PLN.service.ServiceAlumnos;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author reviv
 */
@Service
@Transactional
public class ServiceImpAlumnos implements ServiceAlumnos {
@Autowired
private AlumnosRepository alumnosRepository;
    @Override
    public List<Alumnos> listaAlumnos() {
    return alumnosRepository.findAll();
    }
    
}
