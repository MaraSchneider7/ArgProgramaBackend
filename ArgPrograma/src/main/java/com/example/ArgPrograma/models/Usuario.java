package com.example.ArgPrograma.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String apellido;
    private String tituloProfesional;
    
    @Column(length = 1000)
    private String descripcionTituloProfesional;
    
    private String linkedin;
    private String github;
    
    @Column(length = 1000)
    private String infoSobreUsuario;
    
    @Column(length = 1000)
    private String experienciaLaboral;
    
    @Column(length = 1000)
    private String educacion;
    
    private String email;
    private String password;
    private Boolean sesion;

    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTituloProfesional() {
        return tituloProfesional;
    }
    public String getDescripcionTituloProfesional() {
        return descripcionTituloProfesional;
    }
    public String getLinkedin() {
        return linkedin;
    }
    public String getGithub() {
        return github;
    }
    public String getInfoSobreUsuario() {
        return infoSobreUsuario;
    }
    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }
    public String getEducacion() {
        return educacion;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Boolean getSesion() {
        return sesion;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }
    public void setDescripcionTituloProfesional(String descripcionTituloProfesional) {
        this.descripcionTituloProfesional = descripcionTituloProfesional;
    }
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    public void setGithub(String github) {
        this.github = github;
    }
    public void setInfoSobreUsuario(String infoSobreUsuario) {
        this.infoSobreUsuario = infoSobreUsuario;
    }
    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }
    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSesion(Boolean sesion) {
        this.sesion = sesion;
    }

}

 


