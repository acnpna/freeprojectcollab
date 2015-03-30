/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.controller;

import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.dao.ProyectoDAO;
import ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo.Proyecto;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIData;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Administrador
 */
@Named(value = "proyectoController")
@SessionScoped
public class ProyectoController implements Serializable {
    
    @Inject
    ProyectoDAO proyectoDao;
    
    @Inject
    transient Logger miLogger;
    
    private Proyecto proyecto;
    private Integer clienteSeleccionado;

    private List<Proyecto> listaProyecto;

    @PostConstruct
    public void init(){
        miLogger.log(Level.INFO," INICIO BEAN INSUMO CONTROLLER ");
       // this.proyecto = new Proyecto();
         this.listaProyecto = this.proyectoDao.buscarTodos();
    }
    
     /**
     * @return the proyecto
     */
    public Proyecto getProyecto() {
        return proyecto;
    }

    /**
     * @param proyecto the proyecto to set
     */
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * @return the listaInsumio
     */
    public List<Proyecto> getListaProyecto() {
        if (this.listaProyecto == null) {
            this.listaProyecto = this.proyectoDao.buscarTodos();
        }
        return this.listaProyecto;
    }
    
    public String nuevo(){
        miLogger.log(Level.INFO," CREAR NUEVO INSUMO");
        this.proyecto = new Proyecto();
       return "cargarProyecto";
    }

    public String guardar(){
        this.proyectoDao.guardar(this.proyecto, this.clienteSeleccionado);
        this.listaProyecto = this.proyectoDao.buscarTodos();
        this.proyecto = null;
        return "listarProyectos";
    }

    public String borrar(){
        miLogger.log(Level.INFO," VA A BORRAR ");
        
        this.proyectoDao.borrar(this.proyecto);
         miLogger.log(Level.INFO," VA A BUSCAR TODOS ");
        this.listaProyecto = this.proyectoDao.buscarTodos();
        this.proyecto = null;
        return null;
    }
    
    public String editar(){
        return "cargarProyecto";
    }
    
     public String cancelar(){
        this.proyecto = null;
        return null;
    }

    /**
     * @return the clienteSeleccionado
     */
    public Integer getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    /**
     * @param clienteSeleccionado the clienteSeleccionado to set
     */
    public void setClienteSeleccionado(Integer clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }


    public String borrarTodos() {
        this.proyectoDao.borrarTodos();
        this.listaProyecto = null;
        return "listarProyectos";
       
    }
    
}
