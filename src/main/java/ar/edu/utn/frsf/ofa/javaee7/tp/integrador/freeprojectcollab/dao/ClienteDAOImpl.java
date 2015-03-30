/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.dao;

import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Martin
 */
@Stateless
public class ClienteDAOImpl implements ClienteDAO {
    @PersistenceContext(unitName = "freeprojectcollab_PU")
    private EntityManager em;

    @Override
    public Cliente guardar(Cliente i) {
        Cliente retorno = null;
        if(i.getId()<=0 ) {
            retorno = i;
            em.persist(retorno);
            em.flush();
            em.refresh(retorno);
        }
        else {
            retorno = em.merge(i);
        }
        return retorno;
    }

    @Override
    public void borrar(Cliente i) {
        em.remove(i);
    }
    
    @Override
    public void editar(Cliente i) {
        em.merge(i);
    }

    @Override
    public Cliente buscarPorId(int id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return em.createQuery("SELECT i FROM Cliente i").getResultList();
    }
    
    
}
