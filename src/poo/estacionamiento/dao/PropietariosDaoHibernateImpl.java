/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estacionamiento.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.estacionamiento.Propietario;

/**
 *
 * @author joaquinleonelrobles
 */
public class PropietariosDaoHibernateImpl implements PropietariosDao {
    
    private final SessionFactory sessionFactory;

    public PropietariosDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Propietario buscarPorDni(int dni) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Propietario> query = builder.createQuery(Propietario.class);
        Root<Propietario> root = query.from(Propietario.class);
        query.select(root);
        query.where(builder.equal(root.get("dni"), dni));
        
        Propietario prop = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return prop;
    }

    @Override
    public void guardar(Propietario propietario) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(propietario);
        session.getTransaction().commit();
        session.close();
    }
    
    
}
