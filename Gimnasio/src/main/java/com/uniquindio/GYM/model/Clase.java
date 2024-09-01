package com.uniquindio.GYM.model;

import java.time.LocalDate;
import java.util.ArrayList;

import com.uniquindio.GYM.model.Gimnasio;
import com.uniquindio.GYM.model.person.Instructor;
import lombok.*;

@Data
public class Clase {
    private final int CAPACIDADMAXIMA = 30;
    Gimnasio gimnasio = new Gimnasio();
    private String id;
    private String nombre;
    private ArrayList<Sesion> horario;
    private int capacidadPlazas;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean disponible;
    private TipoClase tipoClase;
    private Instructor instructor;


    public Clase(int id, String nombre, ArrayList<Sesion> horario, int capacidadPlazas, LocalDate fechaInicio,
                 LocalDate fechaFin, boolean disponible, TipoClase tipoClase, Instructor instructor) {
        this.id = String.valueOf(id);
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


    public static ArrayList<Clase> busquedaClase(TipoClase tipoClase, Instructor instructor, Sesion horario, ArrayList<Clase> listaClases) {
        ArrayList<Clase> clasesEncontradas = new ArrayList<>();
        for (Clase clase : listaClases) {
            if (clase.getTipoClase().equals(tipoClase)) {
                clasesEncontradas.add(clase);
                return clasesEncontradas;
            } else if (clase.getInstructor().getNombre().equals(instructor.getNombre())) {
                clasesEncontradas.add(clase);
                return clasesEncontradas;
            } else if (clase.getHorario().equals(horario)) {
                clasesEncontradas.add(clase);
                return clasesEncontradas;
            }
        }
        System.out.println("No existe ningún registro asociado a la búsqueda");
        return null;
    }

}
