/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class AbonoPropietario {
    private Date fechaHora;
    private BigDecimal montoCobrado;
    private int nroComprobante;
    private BigDecimal saldoActual;
    private Usuario usuario;
    private List<Ingreso> ingresos;
    private Propietario propietario;

    /**
    * Constructor por Defecto
    */
    public AbonoPropietario() {
        ingresos= new ArrayList<>();
    }

    /**
    * Constructor sin incluir parámetros referenciales.
    * @param fechaHora;
    * @param montoCobrado;
    * @param nroComprobante;
    * @param saldoActual;
    */
    public AbonoPropietario(Date fechaHora, BigDecimal montoCobrado, int nroComprobante, BigDecimal saldoActual, Propietario propietario) {
        this.fechaHora = fechaHora;
        this.montoCobrado = montoCobrado;
        this.nroComprobante = nroComprobante;
        this.saldoActual = saldoActual;
        this.propietario = propietario;
    }

    /**
    * Constructor con todos los parámetros de la clase AbonoPropietario.
    * @param fechaHora;
    * @param montoCobrado;
    * @param nroComprobante;
    * @param saldoActual;
    * @param usuario;
    * @param ingresos;
    */
    public AbonoPropietario(Date fechaHora, BigDecimal montoCobrado, int nroComprobante, BigDecimal saldoActual, Usuario usuario, List<Ingreso> ingresos) {
        this.fechaHora = fechaHora;
        this.montoCobrado = montoCobrado;
        this.nroComprobante = nroComprobante;
        this.saldoActual = saldoActual;
        this.usuario = usuario;
        this.ingresos = ingresos;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public BigDecimal getMontoCobrado() {
        return montoCobrado;
    }

    public void setMontoCobrado(BigDecimal montoCobrado) {
        this.montoCobrado = montoCobrado;
    }

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
