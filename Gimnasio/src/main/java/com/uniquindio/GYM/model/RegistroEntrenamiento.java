package com.uniquindio.GYM.model;

import java.time.LocalDate;

public class RegistroEntrenamiento {
    private TipoEntrenamiento tipoEntrenamiento;
    private int duracion;
    private double caloriasQuemadas;
    private LocalDate fechaEntrenamiento;
    public RegistroEntrenamiento(TipoEntrenamiento tipoEntrenamiento, int duracion, double caloriasQuemadas,
            LocalDate fechaEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
        this.duracion = duracion;
        this.caloriasQuemadas = caloriasQuemadas;
        this.fechaEntrenamiento = fechaEntrenamiento;
    }
    public TipoEntrenamiento getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }
    public void setTipoEntrenamiento(TipoEntrenamiento tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public double getCaloriasQuemadas() {
        return caloriasQuemadas;
    }
    public void setCaloriasQuemadas(double caloriasQuemadas) {
        this.caloriasQuemadas = caloriasQuemadas;
    }
    public LocalDate getFechaEntrenamiento() {
        return fechaEntrenamiento;
    }
    public void setFechaEntrenamiento(LocalDate fechaEntrenamiento) {
        this.fechaEntrenamiento = fechaEntrenamiento;
    }
    @Override
    public String toString() {
        return "RegistroEntrenamiento [tipoEntrenamiento=" + tipoEntrenamiento + ", duracion=" + duracion
                + ", caloriasQuemadas=" + caloriasQuemadas + ", fechaEntrenamiento=" + fechaEntrenamiento + "]";
    }
}
