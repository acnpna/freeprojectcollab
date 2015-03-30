/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Mi-PC
 */
@Entity
public class RolAsignado {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @Enumerated(EnumType.STRING)
    private Rol rol;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAceptado;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaPropuesto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRechazado;
    @OneToOne
    private Empleado empleado;
    @ManyToOne
    private Proyecto proyecto;


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
     * @return the rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * @return the fechaAceptado
     */
    public Date getFechaAceptado() {
        return fechaAceptado;
    }

    /**
     * @param fechaAceptado the fechaAceptado to set
     */
    public void setFechaAceptado(Date fechaAceptado) {
        this.fechaAceptado = fechaAceptado;
    }

    /**
     * @return the fechaPropuesto
     */
    public Date getFechaPropuesto() {
        return fechaPropuesto;
    }

    /**
     * @param fechaPropuesto the fechaPropuesto to set
     */
    public void setFechaPropuesto(Date fechaPropuesto) {
        this.fechaPropuesto = fechaPropuesto;
    }

    /**
     * @return the fechaRechazado
     */
    public Date getFechaRechazado() {
        return fechaRechazado;
    }

    /**
     * @param fechaRechazado the fechaRechazado to set
     */
    public void setFechaRechazado(Date fechaRechazado) {
        this.fechaRechazado = fechaRechazado;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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

}
