/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import poo.estacionamiento.AbonoPropietario;
import poo.estacionamiento.Propietario;

/**
 *
 * @author joaquinleonelrobles
 */
public class AbonosPropietarioDaoImpl implements AbonosPropietarioDao {
    
    private final List<AbonoPropietario> abonos;

    public AbonosPropietarioDaoImpl () {
        this.abonos = new ArrayList<>();
    }

    @Override
    public int obtenerUltimoNumeroDeComprobante() {
        int max = 0;
        
        List<AbonoPropietario> retorno = new ArrayList<>();
        Iterator<AbonoPropietario> iter = this.abonos.iterator();
        
        while (iter.hasNext()) {
            AbonoPropietario actual = iter.next();
            if (actual.getNroComprobante() > max) {
                max = actual.getNroComprobante();
            }
        }
        
        return max;
    }

    @Override
    public List<AbonoPropietario> buscarPorPropietario(Propietario propietario) {
        List<AbonoPropietario> retorno = new ArrayList<>();
        Iterator<AbonoPropietario> iter = this.abonos.iterator();
        
        while (iter.hasNext()) {
            AbonoPropietario actual = iter.next();
            if (actual.getPropietario().equals(propietario)) {
                retorno.add(actual);
            }
        }
        
        return retorno;
    }

    @Override
    public void guardar(AbonoPropietario abonoPropietario) {
        this.abonos.add(abonoPropietario);
    }

}
