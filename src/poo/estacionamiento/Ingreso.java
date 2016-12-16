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
public class Ingreso {
    private long codigoBarra;
    private Date fechaHoraEgreso;
    private Date fechaHoraIngreso;
    private BigDecimal monto;
    private int nroTicket;
    private String observacion;
    private Porton porton;
    private Usuario usuario;
    private Vehiculo vehiculo;
    private Tarifa tarifa;

    /**
    * Constructor por Defecto
    */
    public Ingreso() {
    }

    /**
    * Constructor con parámetros, sin incluir atributos referenciales.
    * @param codigoBarra;
    * @param fechaHoraEgreso;
    * @param fechaHoraIngreso;
    * @param monto;
    * @param nroTicket;
    * @param observacion;
    */
    public Ingreso(long codigoBarra, Date fechaHoraEgreso, Date fechaHoraIngreso, BigDecimal monto, int nroTicket, String observacion) {
        this.codigoBarra = codigoBarra;
        this.fechaHoraEgreso = fechaHoraEgreso;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
    }
    
    /**
    * Constructor con parámetros, con todos los atributos de la clase Ingreso.
     * @param codigoBarra;
     * @param fechaHoraEgreso;
     * @param fechaHoraIngreso;
     * @param monto;
     * @param nroTicket;
     * @param observacion;
     * @param porton
     * @param usuario
     * @param vehiculo
     * @param tarifa
    */
    public Ingreso(long codigoBarra, Date fechaHoraEgreso, Date fechaHoraIngreso, BigDecimal monto, int nroTicket, String observacion, Porton porton, Usuario usuario, Vehiculo vehiculo, Tarifa tarifa) {
        this.codigoBarra = codigoBarra;
        this.fechaHoraEgreso = fechaHoraEgreso;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.monto = monto;
        this.nroTicket = nroTicket;
        this.observacion = observacion;
        this.porton = porton;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
    }
    
    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public Date getFechaHoraEgreso() {
        return fechaHoraEgreso;
    }

    public void setFechaHoraEgreso(Date fechaHoraEgreso) {
        this.fechaHoraEgreso = fechaHoraEgreso;
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(Date fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public int getNroTicket() {
        return nroTicket;
    }

    public void setNroTicket(int nroTicket) {
        this.nroTicket = nroTicket;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Porton getPorton() {
        return porton;
    }

    public void setPorton(Porton porton) {
        this.porton = porton;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    
    
}
