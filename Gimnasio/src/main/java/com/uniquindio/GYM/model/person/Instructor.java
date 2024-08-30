package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.EspecialidadEnum;
import com.uniquindio.GYM.model.Usuario;
import com.uniquindio.GYM.model.Gimnasio;
import com.uniquindio.GYM.model.person.Comprobador;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Instructor extends Usuario {
    private EspecialidadEnum especialidad;
    Gimnasio gimnasio = new Gimnasio();
    Comprobador comprobador = new Comprobador();

    public Instructor(String cedula, String nombre, EspecialidadEnum especialidad) {
        super(cedula, nombre);
        this.especialidad = especialidad;
    }

//    public EspecialidadEnum getEspecialidad() {
//        return especialidad;
//    }
//
//    public void setEspecialidad(EspecialidadEnum especialidad) {
//        this.especialidad = especialidad;
//    }

//    public boolean comprobarExistencia(String cedula, ArrayList<Instructor> listaC){
//        try{
//            comprobador.comprobarExistencia(this.getCedula(), gimnasio.getListaEntrenadores());
//            comprobador.comprobarExistencia(cedula, );
//            return true;
//        } catch (RuntimeException e) {
//            return false;
//        }
//    }
    
}
