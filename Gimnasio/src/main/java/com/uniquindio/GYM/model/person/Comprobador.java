package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.Usuario;

import java.util.ArrayList;

public class Comprobador{
//     Metodo generico para comprobar existencia de cedula
    public <T extends Usuario > T comprobarExistencia(String cedula, ArrayList<T> lista){
        for (T usuario : lista){
            if (usuario.getCedula().equals(cedula)) {  // Verifica si la cédula coincide
                return usuario;
            }
        }
        // Si no se encuentra la cédula después de recorrer toda la lista
        System.out.println("No existe ningún registro asociado a esta cédula");
//        throw new RuntimeException("No existe ningún registro asociado a esta cédula");
        return null;
    }
}

