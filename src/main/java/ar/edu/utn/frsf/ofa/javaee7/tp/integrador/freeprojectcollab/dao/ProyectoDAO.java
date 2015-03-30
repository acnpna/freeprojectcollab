/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.dao;
import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Proyecto;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mi-PC
 */
@Local
public interface ProyectoDAO {
    
    public Proyecto guardar(Proyecto i, Integer s);
    public void borrar(Proyecto i);
    public void borrarTodos();
    public Proyecto buscarPorId(int id);
    public List<Proyecto> buscarTodos();
   
}
