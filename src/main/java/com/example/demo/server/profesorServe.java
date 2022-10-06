/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.server;

import com.example.demo.modelo.profesor;
import java.util.List;

/**
 *
 * @author ISTA
 */
public interface profesorServe<profesor, Long> {
 public profesor crear(profesor p);

    public profesor findById(Long id);

    public List<profesor> findByAll();

    public void delete(Long id);
}
