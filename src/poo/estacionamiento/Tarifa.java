/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Candelaria
 */
public class Tarifa {
    private int cantidadIngresosSinSaldo;
    private boolean esDeAbono;
    private Date fecha;
    private BigDecimal montoIngreso;
    
    /**
    * Constructor por Defecto
    */
    public Tarifa() {
    }

    /**
    * Constructor con parámetros.
    * @param cantidadIngresosSinSaldo
    * @param esDeAbono;
    * @param fecha;
    * @param montoIngreso;
    */
    public Tarifa(int cantidadIngresosSinSaldo, boolean esDeAbono, Date fecha, BigDecimal montoIngreso) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
        this.esDeAbono = esDeAbono;
        this.fecha = fecha;
        this.montoIngreso = montoIngreso;
    }

    public int getCantidadIngresosSinSaldo() {
        return cantidadIngresosSinSaldo;
    }

    public void setCantidadIngresosSinSaldo(int cantidadIngresosSinSaldo) {
        this.cantidadIngresosSinSaldo = cantidadIngresosSinSaldo;
    }

    public boolean isEsDeAbono() {
        return esDeAbono;
    }

    public void setEsDeAbono(boolean esDeAbono) {
        this.esDeAbono = esDeAbono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMontoIngreso() {
        return montoIngreso;
    }

    public void setMontoIngreso(BigDecimal montoIngreso) {
        this.montoIngreso = montoIngreso;
    }
    
    
}
