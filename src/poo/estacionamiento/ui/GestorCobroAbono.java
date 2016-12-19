/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.ui;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import poo.estacionamiento.AbonoPropietario;
import poo.estacionamiento.Propietario;
import poo.estacionamiento.dao.AbonosPropietarioDao;
import poo.estacionamiento.dao.PropietariosDao;

/**
 *
 * @author joaquinleonelrobles
 */
public class GestorCobroAbono {
    
    private PantallaCobroAbono pantallaCobroAbono;
    
    private final PropietariosDao propietariosDao;
    private final AbonosPropietarioDao abonosPropietarioDao;
    
    private Propietario propietario;
    private BigDecimal importe;

    public GestorCobroAbono(PropietariosDao propietariosDao, AbonosPropietarioDao abonosPropietarioDao) {
        this.propietariosDao = propietariosDao;
        this.abonosPropietarioDao = abonosPropietarioDao;
    }

    public void run() {
        pantallaCobroAbono = new PantallaCobroAbono(this);
        pantallaCobroAbono.setVisible(true);
    }
    
    public Propietario buscarPorDni (String dni) {
        return propietariosDao.buscarPorDni(Integer.parseInt(dni));
    }
    
    public void tomarConfirmacionAcreditacion () {
        // calculamos el saldo actualizado
        List<AbonoPropietario> abonos = abonosPropietarioDao.buscarPorPropietario(propietario);
        BigDecimal saldoActualizado = propietario.acreditarMonto(importe, abonos);
        
        // obtenemos los valores para crear el nuevo abono
        Calendar cal = Calendar.getInstance();
        Date fechaHoraActual = cal.getTime();
        int nroComprobante = obtenerUltimoNroComprobante() + 1;
        
        // creamos un nuevo abono del propietario
        AbonoPropietario abono = new AbonoPropietario(fechaHoraActual, importe, nroComprobante, saldoActualizado, propietario);
        
        // y lo guardamos en nuestro acceso a datos
        abonosPropietarioDao.guardar(abono);

        // mostramos la pantalla con el saldo actualizado
        JOptionPane.showMessageDialog(pantallaCobroAbono, "El saldo actualizado es $ " + saldoActualizado);
        
        // limpiamos los campos en la pantalla
        pantallaCobroAbono.limpiarCampos();
    }

    public void tomarMontoIngresado(BigDecimal importe) {
        this.importe = importe;
        
        pantallaCobroAbono.pedirConfirmacionAcreditacion();
    }

    public void tomarDni(String text) {
        propietario = buscarPorDni(text);
            
        // en caso de encontrarlo mostramos los datos en la pantalla
        if (propietario != null) {
            List<AbonoPropietario> abonos = abonosPropietarioDao.buscarPorPropietario(propietario);
            
            pantallaCobroAbono.mostrarPropietarioYSaldoActual(propietario, propietario.calcularSaldoActual(abonos));
        }
    }
    
    private int obtenerUltimoNroComprobante () {
        return abonosPropietarioDao.obtenerUltimoNumeroDeComprobante();
    }
}
