/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.ui;

import java.math.BigDecimal;
import java.util.Calendar;
import poo.estacionamiento.AbonoPropietario;
import poo.estacionamiento.Propietario;
import poo.estacionamiento.dao.AbonosPropietarioDao;
import poo.estacionamiento.dao.AbonosPropietarioDaoImpl;
import poo.estacionamiento.dao.PropietariosDao;
import poo.estacionamiento.dao.PropietariosDaoImpl;

/**
 *
 * @author joaquinleonelrobles
 */
public class Main {
    
    public static void main (String[] args) {
        Calendar cal = Calendar.getInstance();
        PropietariosDao propietariosDao = new PropietariosDaoImpl();
        AbonosPropietarioDao abonosPropietarioDao = new AbonosPropietarioDaoImpl();
        
        // insertamos algunos valores iniciales de propietarios
        Propietario joaquin = new Propietario("Robles", 34315671, "Mario");
        Propietario mario   = new Propietario("Luiggi", 34315672, "Mario");
        
        propietariosDao.guardar(mario);
        propietariosDao.guardar(joaquin);
        
        // y de abonos
        AbonoPropietario abonoJoaquin1 = new AbonoPropietario(cal.getTime(), new BigDecimal(123), 1, new BigDecimal(123), joaquin);
        AbonoPropietario abonoMario1   = new AbonoPropietario(cal.getTime(), new BigDecimal(321), 2, new BigDecimal(321), joaquin);
        
        abonosPropietarioDao.guardar(abonoMario1);
        abonosPropietarioDao.guardar(abonoJoaquin1);
        
        new GestorCobroAbono(propietariosDao, abonosPropietarioDao).run();
    }
}
