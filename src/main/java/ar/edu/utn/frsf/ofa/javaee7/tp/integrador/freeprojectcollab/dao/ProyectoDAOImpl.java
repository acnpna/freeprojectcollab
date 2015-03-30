/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.dao;

import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Cliente;
import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Proyecto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mi-PC
 */
@Stateless
public class ProyectoDAOImpl implements ProyectoDAO{
    @PersistenceContext(unitName = "freeprojectcollab_PU")
    private EntityManager em;
    
     @Inject
    transient Logger miLogger;
    
     @Override
    public Proyecto guardar(Proyecto i, Integer clienteSeleccionado) {
        Proyecto retorno = null;
        if(i.getId()<=0 ) {
            Cliente clienteSel = em.find(Cliente.class, clienteSeleccionado);
            i.setCliente(clienteSel);
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
    public void borrar(Proyecto i) {
          em.remove(em.merge(i));      
          i = null;
    }

    @Override
    public Proyecto buscarPorId(int id) {
        return em.find(Proyecto.class, id);
    }

    @Override
    public List<Proyecto> buscarTodos() {
        return em.createQuery("SELECT i FROM Proyecto i").getResultList();
    }
    
     @Override
    public void borrarTodos() {
         miLogger.log(Level.INFO," VA a BORRAR TODOS");
        em.createNativeQuery("DELETE FROM Proyecto").executeUpdate();
    }

}
