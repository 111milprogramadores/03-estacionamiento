/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import java.util.List;
import poo.estacionamiento.AbonoPropietario;
import poo.estacionamiento.Propietario;

/**
 *
 * @author joaquinleonelrobles
 */
public interface AbonosPropietarioDao {
    
    public int obtenerUltimoNumeroDeComprobante ();

    public List<AbonoPropietario> buscarPorPropietario(Propietario propietario);
    
    public void guardar (AbonoPropietario abonoPropietario);
    
}
