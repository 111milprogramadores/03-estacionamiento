/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.estacionamiento.AbonoPropietario;
import poo.estacionamiento.Propietario;

/**
 *
 * @author joaquinleonelrobles
 */
public class AbonosPropietarioDaoHibernateImpl implements AbonosPropietarioDao {
    
    private final SessionFactory sessionFactory;

    public AbonosPropietarioDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public int obtenerUltimoNumeroDeComprobante() {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Integer> query = builder.createQuery(Integer.class);
        Root<AbonoPropietario> root = query.from(AbonoPropietario.class);
        query.select(builder.max(root.get("nroComprobante")));
        
        Integer ultimo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return ultimo;
    }

    @Override
    public List<AbonoPropietario> buscarPorPropietario(Propietario propietario) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<AbonoPropietario> query = builder.createQuery(AbonoPropietario.class);
        Root<AbonoPropietario> root = query.from(AbonoPropietario.class);
        query.select(root);
        query.where(builder.equal(root.get("propietario"), propietario));
        
        List<AbonoPropietario> abonos = session.createQuery(query).list();
        
        session.close();
        
        return abonos;
    }

    @Override
    public void guardar(AbonoPropietario abonoPropietario) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(abonoPropietario);
        session.getTransaction().commit();
        session.close();
    }
    
}
