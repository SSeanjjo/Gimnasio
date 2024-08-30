package com.uniquindio.GYM.model;

import com.uniquindio.GYM.model.person.Cliente;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;

@Data

public class RegistroEntrenamiento {
    private Cliente cliente;
    private TipoEntrenamiento tipoEntrenamiento;
    private int duracion;
    private double caloriasQuemadas;
    private LocalDate fechaEntrenamiento;

    public RegistroEntrenamiento(Cliente cliente, TipoEntrenamiento tipoEntrenamiento, int duracion, double caloriasQuemadas, LocalDate fechaEntrenamiento) {
        this.cliente = cliente;
        this.tipoEntrenamiento = tipoEntrenamiento;
        this.duracion = duracion;
        this.caloriasQuemadas = caloriasQuemadas;
        this.fechaEntrenamiento = fechaEntrenamiento;
    }

    public void historialEntrenamientos(ArrayList<RegistroEntrenamiento> listaEntrenamientos, String cedula) {
        for (RegistroEntrenamiento registroEntrenamiento : listaEntrenamientos) {
            if (registroEntrenamiento.cliente.getCedula().equals(cedula)) {
                registroEntrenamiento.getFechaEntrenamiento();
                registroEntrenamiento.getTipoEntrenamiento();
                registroEntrenamiento.getDuracion();
                registroEntrenamiento.getCaloriasQuemadas();
                System.out.println("Historial de entrenamientos de " + registroEntrenamiento.cliente.getNombre() + "\n Fecha Entrenamientos: " + registroEntrenamiento.getFechaEntrenamiento() + "\n Tipo de Entrenamiento: " + registroEntrenamiento.getTipoEntrenamiento() + "\n Duración: " + registroEntrenamiento.getDuracion() + "\n Calorías quemadas: " + registroEntrenamiento.getCaloriasQuemadas());
            }
        }
    }
}
