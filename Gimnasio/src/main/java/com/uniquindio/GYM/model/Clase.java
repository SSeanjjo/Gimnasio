package com.uniquindio.GYM.model;

import java.time.LocalDate;
import java.util.ArrayList;
import com.uniquindio.GYM.model.person.Instructor;

public class Clase {
    private int id;
    private String nombre;
    private ArrayList<Sesion> horario ;
    private int capacidad ;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean disponible ;
    private TipoClase tipoClase;
    private Instructor instructor;
    public Clase(int id, String nombre, ArrayList<Sesion> horario, int capacidad, LocalDate fechaInicio,
            LocalDate fechaFin, boolean disponible, TipoClase tipoClase, Instructor instructor) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.capacidad = capacidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.disponible = disponible;
        this.tipoClase = tipoClase;
        this.instructor = instructor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Sesion> getHorario() {
        return horario;
    }
    public void setHorario(ArrayList<Sesion> horario) {
        this.horario = horario;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public TipoClase getTipoClase() {
        return tipoClase;
    }
    public void setTipoClase(TipoClase tipoClase) {
        this.tipoClase = tipoClase;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    @Override
    public String toString() {
        return "Clase [id=" + id + ", nombre=" + nombre + ", horario=" + horario + ", capacidad=" + capacidad
                + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", disponible=" + disponible
                + ", tipoClase=" + tipoClase + ", instructor=" + instructor + "]";
    }


}
