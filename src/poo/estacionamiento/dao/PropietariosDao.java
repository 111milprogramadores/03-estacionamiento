/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import poo.estacionamiento.Propietario;

/**
 *
 * @author joaquinleonelrobles
 */
public interface PropietariosDao {
    
    public Propietario buscarPorDni (int dni);
    
    public void guardar (Propietario propietario);
    
}
