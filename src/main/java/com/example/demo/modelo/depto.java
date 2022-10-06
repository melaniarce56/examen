/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modelo;

/**
 *
 * @author ISTA
 */
public class depto {

private long d_id;
private String nombre;
private String director;
private String descripcion;

    public depto() {
    }

    public depto(long d_id, String nombre, String director, String descripcion) {
        this.d_id = d_id;
        this.nombre = nombre;
        this.director = director;
        this.descripcion = descripcion;
    }

    public long getD_id() {
        return d_id;
    }

    public void setD_id(long d_id) {
        this.d_id = d_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
