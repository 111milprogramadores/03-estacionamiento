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
public class TipoVehiculo {
    private String nombre;
    private String descripcion;
    private List<Tarifa> tarifas;
    
    /**
    * Constructor por Defecto
    */
    public TipoVehiculo() {
        tarifas = new ArrayList<>();
    }
    
    /**
    * Constructor con parámetros, sin incluir atributo referencial.
     * @param nombre
     * @param descripcion
    */
    public TipoVehiculo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    /**
    * Constructor con parámetros, incluyendo todos los atributos de la clase TipoVehiculo.
     * @param nombre
     * @param descripcion
     * @param tarifas
    */
    public TipoVehiculo(String nombre, String descripcion, List<Tarifa> tarifas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarifas = tarifas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
    
}
