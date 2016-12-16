/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Marca {
    private String nombre;
    private List<Modelo> modelos;
    
    /**
    * Constructor por Defecto
    */
    public Marca() {
        modelos = new ArrayList<>();
    }
    
    /**
    * Constructor con parámetro, sin incluir atributo referencial.
     * @param nombre
    */
    public Marca(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Constructor con parámetro, con todos los atributos de la clase Marca.
     * @param nombre
     * @param modelos
    */
    public Marca(String nombre, List<Modelo> modelos) {
        this.nombre = nombre;
        this.modelos = modelos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
    
}
