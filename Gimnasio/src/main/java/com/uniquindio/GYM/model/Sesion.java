package com.uniquindio.GYM.model;

import lombok.Data;

import java.time.LocalTime;

import java.util.Objects;

@Data
public class Sesion {
    private DiaSemana day;
    private LocalTime startHour;
    private LocalTime endHour;

    public Sesion(DiaSemana day, LocalTime startHour, LocalTime endHour) {
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sesion sesion = (Sesion) o;
        return day == sesion.day &&
                startHour.equals(sesion.startHour) &&
                endHour.equals(sesion.endHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, startHour, endHour);
    }
}


