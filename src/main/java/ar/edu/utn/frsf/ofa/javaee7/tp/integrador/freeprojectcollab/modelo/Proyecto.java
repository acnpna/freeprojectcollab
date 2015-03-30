/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.utn.frsf.ofa.javaee7.tp.integrador.freeprojectcollab.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Administrador
 */

@Entity
public class Proyecto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @OneToMany(mappedBy = "proyecto")
    private List<RolAsignado> roles;
    @Column(name = "FECHA_FIN_ESTIMADA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinEstimada;
    private int horasPresupuestadas;
    @OneToMany(mappedBy = "proyecto")
    private List<Requerimiento> requerimientos;

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
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * @return the lider
     */
    /*public RolAsignado getLider() {
        return lider;
    }*/

    /**
     * @param lider the lider to set
     */
   /* public void setLider(RolAsignado lider) {
        this.lider = lider;
    }

    /**
     * @return the fechaFinEstimada
     */
   /* public Date getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    /**
     * @param fechaFinEstimada the fechaFinEstimada to set
     */
    /*public void setFechaFinEstimada(Date fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    /**
     * @return the horasPresupuestadas
     */
    public int getHorasPresupuestadas() {
        return horasPresupuestadas;
    }

    /**
     * @param horasPresupuestadas the horasPresupuestadas to set
     */
    public void setHorasPresupuestadas(int horasPresupuestadas) {
        this.horasPresupuestadas = horasPresupuestadas;
    }

    /**
     * @return the roles
     */
    public List<RolAsignado> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<RolAsignado> roles) {
        this.roles = roles;
    }

    /**
     * @return the fechaFinEstimada
     */
    public Date getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    /**
     * @param fechaFinEstimada the fechaFinEstimada to set
     */
    public void setFechaFinEstimada(Date fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    /**
     * @return the requerimientos
     */
    public List<Requerimiento> getRequerimientos() {
        return requerimientos;
    }

    /**
     * @param requerimientos the requerimientos to set
     */
    public void setRequerimientos(List<Requerimiento> requerimientos) {
        this.requerimientos = requerimientos;
    }

    /**
     * @return the requerimientos
     */
  /*  public List<Requerimiento> getRequerimientos() {
        return requerimientos;
    }

    /**
     * @param requerimientos the requerimientos to set
     */
    /*public void setRequerimientos(List<Requerimiento> requerimientos) {
        this.requerimientos = requerimientos;
    }*/
    
    
}
