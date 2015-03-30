/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.dao;

import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Cliente;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Local
public interface ClienteDAO {

    public Cliente guardar(Cliente i);
    public void editar(Cliente i);
    public void borrar(Cliente i);
    public Cliente buscarPorId(int id);
    public List<Cliente> buscarTodos();
}
