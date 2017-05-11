/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Usuario {
    
    private Integer id;
    private String apellido;
    private String nombre;
    private String nombreUsuario;
    private String password;
    private List<Permiso> permisos;

    /**
    * Constructor por Defecto
    */
    public Usuario() {
        permisos = new ArrayList<>();
    }
    
    /**
    * Constructor con todos los atributos de la clase Usuario.
    * @param apellido;
    * @param nombre;
    * @param nombreUsuario;
    * @param password;
    * @param permisos;
    */
    public Usuario(String apellido, String nombre, String nombreUsuario, String password, List<Permiso> permisos) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = permisos;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }
    
}
