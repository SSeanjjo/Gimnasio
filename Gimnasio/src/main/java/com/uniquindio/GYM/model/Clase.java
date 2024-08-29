package com.uniquindio.GYM.model;

import java.time.LocalDate;
import java.util.ArrayList;
import com.uniquindio.GYM.model.Gimnasio;
import com.uniquindio.GYM.model.person.Instructor;
import lombok.*;

@Data
public class Clase {
    private String  id;
    private String nombre;
    private ArrayList<Sesion> horario ;
    private int capacidadPlazas;
    private final int CAPACIDADMAXIMA = 30;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean disponible ;
    private TipoClase tipoClase;
    private Instructor instructor;

    Gimnasio gimnasio = new Gimnasio();

    public Clase(String id, String nombre, ArrayList<Sesion> horario, int capacidadPlazas, LocalDate fechaInicio,
            LocalDate fechaFin, boolean disponible, TipoClase tipoClase, Instructor instructor) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.capacidadPlazas = getCapacidadPlazas();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.disponible = disponible;
        this.tipoClase = tipoClase;
        this.instructor = instructor;
        gimnasio.getListaClases().add(this);
    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getNombre() {
//        return nombre;
//    }
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//    public ArrayList<Sesion> getHorario() {
//        return horario;
//    }
//    public void setHorario(ArrayList<Sesion> horario) {
//        this.horario = horario;
//    }
//    public int getCapacidad() {
//        return capacidad;
//    }
//    public void setCapacidad(int capacidad) {
//        this.capacidad = capacidad;
//    }
//    public LocalDate getFechaInicio() {
//        return fechaInicio;
//    }
//    public void setFechaInicio(LocalDate fechaInicio) {
//        this.fechaInicio = fechaInicio;
//    }
//    public LocalDate getFechaFin() {
//        return fechaFin;
//    }
//    public void setFechaFin(LocalDate fechaFin) {
//        this.fechaFin = fechaFin;
//    }
//    public boolean isDisponible() {
//        return disponible;
//    }
//    public void setDisponible(boolean disponible) {
//        this.disponible = disponible;
//    }
//    public TipoClase getTipoClase() {
//        return tipoClase;
//    }
//    public void setTipoClase(TipoClase tipoClase) {
//        this.tipoClase = tipoClase;
//    }
//    public Instructor getInstructor() {
//        return instructor;
//    }
//    public void setInstructor(Instructor instructor) {
//        this.instructor = instructor;
//    }

    public <T>T busquedaCLase(TipoClase tipoClase, Enum EspecialidadEnum, Sesion horario, ArrayList<T> listaClases){
        for(T clase : listaClases){
            if(clase.equals(tipoClase)){
                return clase;
            } else if ( clase.equals(EspecialidadEnum)) {
                return clase;
            } else if ( clase.equals(horario)){
                return clase;
            }
        }
            throw new RuntimeException("No existe ningún registro asociado a esta cédula");
        }



}
