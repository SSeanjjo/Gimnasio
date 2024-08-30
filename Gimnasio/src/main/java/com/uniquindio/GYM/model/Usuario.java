package com.uniquindio.GYM.model;

public abstract class Usuario {
    protected String cedula;
    protected String nombre;

    public Usuario() {

    }

    public Usuario(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;

    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario [cedula=" + cedula + ", nombre=" + nombre + "]";
    }

}
