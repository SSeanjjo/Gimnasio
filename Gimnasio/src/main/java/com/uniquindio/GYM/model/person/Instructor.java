package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.EspecialidadEnum;
import com.uniquindio.GYM.model.Usuario;
import com.uniquindio.GYM.model.Gimnasio;
import com.uniquindio.GYM.model.person.Comprobador;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Instructor extends Usuario {
    Gimnasio gimnasio = new Gimnasio();
    Comprobador comprobador = new Comprobador();
    private EspecialidadEnum especialidad;

    public Instructor(String cedula, String nombre, EspecialidadEnum especialidad) {
        super(cedula, nombre);
        this.especialidad = especialidad;
    }

    public boolean comprobarExistencia(String cedula, ArrayList<Instructor> listaInstructores) {
        Instructor instructorExistente = comprobador.comprobarExistencia(cedula, listaInstructores);
        return instructorExistente != null;
    }
}

