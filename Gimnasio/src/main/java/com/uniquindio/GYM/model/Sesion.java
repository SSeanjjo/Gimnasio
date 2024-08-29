package com.uniquindio.GYM.model;

import java.time.LocalTime;

public class Sesion {
    private DiaSemana day;
    private LocalTime startHour;
    private LocalTime endHour;
    public Sesion(DiaSemana day, LocalTime startHour, LocalTime endHour) {
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
    }
    public DiaSemana getDay() {
        return day;
    }
    public void setDay(DiaSemana day) {
        this.day = day;
    }
    public LocalTime getStartHour() {
        return startHour;
    }
    public void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }
    public LocalTime getEndHour() {
        return endHour;
    }
    public void setEndHour(LocalTime endHour) {
        this.endHour = endHour;
    }

}
