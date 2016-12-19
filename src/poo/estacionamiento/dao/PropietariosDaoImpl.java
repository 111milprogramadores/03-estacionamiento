/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import poo.estacionamiento.Propietario;

/**
 *
 * @author joaquinleonelrobles
 */
public class PropietariosDaoImpl implements PropietariosDao {
    
    private final List<Propietario> propietarios;
    
    public PropietariosDaoImpl() {
        propietarios = new ArrayList<>();
    }

    @Override
    public void guardar(Propietario propietario) {
        this.propietarios.add(propietario);
    }

    @Override
    public Propietario buscarPorDni(int dni) {
        Propietario retorno = null;
        
        Iterator<Propietario> iter = propietarios.iterator();
        while (iter.hasNext()) {
            Propietario actual = iter.next();
            
            if (actual.getDni() == dni) {
                retorno = actual;
                break;
            }
        }
        
        return retorno;
    }

}
