/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.controller;

import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.dao.ClienteDAO;
import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Cliente;
import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Proyecto;
import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Usuario;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Administrador
 */

@Named(value = "clienteCtrl")
@SessionScoped
public class ClienteController implements Serializable {
    
   @Inject
    ClienteDAO clienteDao;
    
    @Inject
    transient Logger miLogger;
    
    private Cliente cliente;

    private List<Cliente> listaCliente;

    @PostConstruct
    public void init(){
        this.cliente = new Cliente();
        miLogger.log(Level.INFO," INICIO BEAN CLIENTE CONTROLLER ");
       
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
     //@Inject
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
     /**
     * @return the listaCliente
     */
    public List<Cliente> getListaCliente() {
       // if (this.listaCliente == null) {
            this.listaCliente = this.clienteDao.buscarTodos();
        //}
        return this.listaCliente;
    }
    
    public String nuevo(){
        miLogger.log(Level.INFO," CREAR NUEVO CLIENTE");
        this.cliente = new Cliente();
        return null;
    }

    public String guardar(){
         miLogger.log(Level.INFO," GUARDAR CLIENTE");
        this.clienteDao.guardar(this.cliente);
     //   this.listaCliente = this.clienteDao.buscarTodos();
     //   this.cliente = null;
        return null;
    }

    public String borrar(){
        this.clienteDao.borrar(this.cliente);
       // this.listaCliente = this.clienteDao.buscarTodos();
       // this.cliente = null;
        return null;
    }
    
    public String editar() {
        this.clienteDao.editar(this.cliente);
        return null;
    }


}
