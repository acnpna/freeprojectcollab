/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Mi-PC
 */
@Entity
public class Empleado {
    
       
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String nombre;
    @OneToOne
    private Usuario usuario;
    @OneToOne (mappedBy = "empleado")
    private RolAsignado rolAsignado;
    private double costoHora;
    private double hsDisponibles;   
    @OneToMany(mappedBy = "empleado")
    private List<Honorarios> honorarios;
    @ManyToMany(mappedBy = "empleados")
    private List<Tarea> tareas;
   
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
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the rolAsignado
     */
    public RolAsignado getRolAsignado() {
        return rolAsignado;
    }

    /**
     * @param rolAsignado the rolAsignado to set
     */
    public void setRolAsignado(RolAsignado rolAsignado) {
        this.rolAsignado = rolAsignado;
    }

    /**
     * @return the costoHora
     */
    public double getCostoHora() {
        return costoHora;
    }

    /**
     * @param costoHora the costoHora to set
     */
    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    /**
     * @return the hsDisponibles
     */
    public double getHsDisponibles() {
        return hsDisponibles;
    }

    /**
     * @param hsDisponibles the hsDisponibles to set
     */
    public void setHsDisponibles(double hsDisponibles) {
        this.hsDisponibles = hsDisponibles;
    }

    /**
     * @return the honorarios
     */
    public List<Honorarios> getHonorarios() {
        return honorarios;
    }

    /**
     * @param honorarios the honorarios to set
     */
    public void setHonorarios(List<Honorarios> honorarios) {
        this.honorarios = honorarios;
    }

    /**
     * @return the tareas
     */
    public List<Tarea> getTareas() {
        return tareas;
    }

    /**
     * @param tareas the tareas to set
     */
    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    
}
