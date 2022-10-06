/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.server;

import com.example.demo.modelo.profesor;
import com.example.demo.repositpry.profesorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author ISTA
 */
@Service
public class profesorServelmpl  implements profesorServe {
  
    
    @Autowired
    profesorRepository repository;

    @Override
    public profesor crear(profesor p) {
        return repository.save(p);
    }

    @Override
    public profesor findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<profesor> findByAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
     

}
