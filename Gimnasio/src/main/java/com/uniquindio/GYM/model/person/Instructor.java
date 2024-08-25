package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.EspecialidadEnum;
import com.uniquindio.GYM.model.Usuario;

public class Instructor extends Usuario {
    private EspecialidadEnum especialidad;

    public Instructor(String cedula, String nombre, EspecialidadEnum especialidad) {
        super(cedula, nombre);
        this.especialidad = especialidad;
    }

    public EspecialidadEnum getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadEnum especialidad) {
        this.especialidad = especialidad;
    }
    
}
