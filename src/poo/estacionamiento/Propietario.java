/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Propietario {
    private List<AbonoPropietario> abonosPropietario;
    private List<Vehiculo> vehiculos;
    private String apellido;
    private int dni;
    private String nombre;

    /**
    * Constructor por Defecto
    */
    public Propietario() {
    }

    /**
    * Constructor sin incluir parámetros referenciales.
    * @param apellido;
    * @param dni;
    * @param nombre;
    */    
    public Propietario(String apellido, int dni, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }

    /**
    * Constructor con todos los parámetros de la clase Propietario.
     * @param abonosPropietario;
     * @param vehiculos
     * @param apellido;
     * @param dni;
     * @param nombre;
    */
    public Propietario(List<AbonoPropietario> abonosPropietario, List<Vehiculo> vehiculos, String apellido, int dni, String nombre) {
        this.abonosPropietario = abonosPropietario;
        this.vehiculos = vehiculos;
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }

    public List<AbonoPropietario> getAbonosPropietario() {
        return abonosPropietario;
    }

    public void setAbonosPropietario(List<AbonoPropietario> abonosPropietario) {
        this.abonosPropietario = abonosPropietario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
