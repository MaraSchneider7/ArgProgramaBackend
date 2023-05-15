package com.example.ArgPrograma.models;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "proyecto")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    
    @Column(length = 1000)
    private String descripcion;
    
    private String link;
    private Date fechaInicio;
    
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getLink() {
        return link;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    } 
    



}
