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
import poo.estacionamiento.Usuario;

/**
 *
 * @author joaquinleonelrobles
 */
public class UsuariosDaoHibernateImpl implements UsuariosDao {
    
    private final SessionFactory sessionFactory;

    public UsuariosDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void guardar(Usuario usuario) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Usuario buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Usuario> query = builder.createQuery(Usuario.class);
        Root<Usuario> root = query.from(Usuario.class);
        query.select(root);
        query.where(builder.equal(root.get("nombreUsuario"), nombre));
        
        Usuario usuario = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return usuario;
    }
    
}
