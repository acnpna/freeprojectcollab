/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Administrador
 */
@Entity
public class Cliente {
   
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private String nombre;
    @OneToOne
    private Usuario usuario;    
    @OneToMany(mappedBy = "cliente")
    private List<Proyecto> proyectos;

public Cliente(){

	}
   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the usuario
     */
  /*  public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
   /* public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the proyectos
     */
   public List<Proyecto> getProyectos() {
        return proyectos;
    }

    /**
     * @param proyectos the proyectos to set
     */
    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    } 

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
