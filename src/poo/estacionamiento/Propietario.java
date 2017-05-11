/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Propietario {
    
    private Integer id;
    private List<Vehiculo> vehiculos;
    private String apellido;
    private int dni;
    private String nombre;

    /**
    * Constructor por Defecto
    */
    public Propietario() {
        this.vehiculos = new ArrayList<>();
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
        
        this.vehiculos = new ArrayList<>();
    }

    /**
    * Constructor con todos los parámetros de la clase Propietario.
     * @param vehiculos
     * @param apellido;
     * @param dni;
     * @param nombre;
    */
    public Propietario(List<Vehiculo> vehiculos, String apellido, int dni, String nombre) {
        this.vehiculos = vehiculos;
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    /**
     * Calculamos el saldo actual del Propietario en base a los Abonos que tiene
     * registrados. En caso de no tener abonos su saldo actual es cero, de lo
     * contrario obtenemos el último abono y le consultamos su saldo.
     * 
     * @param abonosPropietario
     * @return 
     */
    public BigDecimal calcularSaldoActual(List<AbonoPropietario> abonosPropietario) {
        BigDecimal saldoActual;
        
        if (abonosPropietario.size() < 1) {
            saldoActual = BigDecimal.ZERO;
        }
        else {
            saldoActual = abonosPropietario.get(abonosPropietario.size() - 1).getSaldoActual();
        } 
        
        return saldoActual;
    }

    public BigDecimal acreditarMonto(BigDecimal importe, List<AbonoPropietario> abonos) {
        return calcularSaldoActual(abonos).add(importe);
    }
}
