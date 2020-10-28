/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagen.base.demo.entidad;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Arturo
 */
@Setter
@Getter
@Entity

@Table(name="persona")
public class Persona  {
    
    @Id
    private int id;
    @Column(name="nombre")
    private String nombre;
    
}
