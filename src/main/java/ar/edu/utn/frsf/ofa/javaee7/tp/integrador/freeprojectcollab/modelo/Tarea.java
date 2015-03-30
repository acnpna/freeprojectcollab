/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Mi-PC
 */
@Entity
public class Tarea {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private String descripcion;
    @ManyToOne
    private Requerimiento requerimiento; 
    private int duracionPresuestada;
    private int duracionReal;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    private List<Empleado> empleados;
    @OneToMany
    private List<Tarea> tareasPredececesoras;
    
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the duracionPresuestada
     */
    public int getDuracionPresuestada() {
        return duracionPresuestada;
    }

    /**
     * @param duracionPresuestada the duracionPresuestada to set
     */
    public void setDuracionPresuestada(int duracionPresuestada) {
        this.duracionPresuestada = duracionPresuestada;
    }

    /**
     * @return the duracionReal
     */
    public int getDuracionReal() {
        return duracionReal;
    }

    /**
     * @param duracionReal the duracionReal to set
     */
    public void setDuracionReal(int duracionReal) {
        this.duracionReal = duracionReal;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the tareasPredececesoras
     */
    public List<Tarea> getTareasPredececesoras() {
        return tareasPredececesoras;
    }

    /**
     * @param tareasPredececesoras the tareasPredececesoras to set
     */
    public void setTareasPredececesoras(List<Tarea> tareasPredececesoras) {
        this.tareasPredececesoras = tareasPredececesoras;
    }

    /**
     * @return the empleado
     */
    public List<Empleado> getEmpleado() {
        return empleados;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * @return the requerimiento
     */
    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    /**
     * @param requerimiento the requerimiento to set
     */
    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }
    
    
}
