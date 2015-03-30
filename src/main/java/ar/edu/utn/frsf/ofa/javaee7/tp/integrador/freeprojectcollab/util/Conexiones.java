/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@ApplicationScoped
public class Conexiones {

    @PersistenceContext(unitName = "freeprojectcollab_PU")
    private EntityManager em;

    @Produces
    @BaseProduccion
    public EntityManager create() {
        return em;
    }

    public void close(@Disposes @BaseProduccion EntityManager em) {
        em.close();
    }

}