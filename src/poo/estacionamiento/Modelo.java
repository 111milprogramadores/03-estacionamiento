/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

/**
 *
 * @author Candelaria
 */
public class Modelo {
    private String nombre;

    /**
    * Constructor por Defecto
    */
    public Modelo() {
    }

    /**
    * Constructor con parámetro.
    * @param nombre
    */
    public Modelo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
