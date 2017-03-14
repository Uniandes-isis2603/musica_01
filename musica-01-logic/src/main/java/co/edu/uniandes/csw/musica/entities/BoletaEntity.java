/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.musica.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author la.herrera11
 */
@Entity
public class BoletaEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer precio;
        @ManyToOne
    private ClienteEntity cliente;
        @ManyToOne
    private FuncionEntity funcion;
    

    public BoletaEntity() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    public ClienteEntity getCliente(){
    return cliente;
    }
    public void setCliente(ClienteEntity cliente){
    this.cliente= cliente;
    }
    
    public FuncionEntity getFuncion(){
    return funcion;
    }
    public void setFuncion(FuncionEntity funcion){
    this.funcion= funcion;
    }
}
