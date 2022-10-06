/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repositpry;

import com.example.demo.modelo.depto;
import com.example.demo.modelo.profesor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ISTA
 */
public interface profesorRepository  extends JpaRepository<depto, Long>{
    
}
