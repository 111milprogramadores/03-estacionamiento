/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import poo.estacionamiento.Usuario;

/**
 *
 * @author joaquinleonelrobles
 */
public interface UsuariosDao {
    
    public void guardar (Usuario usuario);
    
    public Usuario buscarPorNombre (String nombre);
    
}
