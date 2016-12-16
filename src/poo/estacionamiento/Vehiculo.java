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


public class Vehiculo {
    private String dominio;
    private Modelo modelo;
    private TipoVehiculo tipoVehiculo;

    /**
    * Constructor por Defecto
    */
    public Vehiculo() {
        }

    /**
    * Constructor con parámetros.
     * @param dominio 
     * @param modelo 
     * @param tipoVehiculo 
    */    
    public Vehiculo(String dominio, Modelo modelo, TipoVehiculo tipoVehiculo) {
        this.dominio = dominio;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
}
