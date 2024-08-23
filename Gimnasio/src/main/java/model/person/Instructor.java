package model.person;

import model.Persona;

import java.util.ArrayList;

public class Instructor extends Persona {
    ArrayList<String> listaInstructores = new ArrayList<>();

//    public Instructor(String cedula) {
//        super(cedula);
//    }

    public Instructor(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public void consultaExistencia(String cedula) {
        var existe = listaInstructores.contains(cedula);
        if (existe) {
            System.out.println("Ya existe un Instructor asosciado a esta cedula");
        } else {
            System.out.println("No existe ningun Instructor asosciado a esta cedula");
        }
    }
}
