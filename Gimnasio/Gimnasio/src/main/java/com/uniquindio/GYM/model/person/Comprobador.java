package com.uniquindio.GYM.model.person;
import com.uniquindio.GYM.model.Usuario;

import java.util.ArrayList;
public class Comprobador {
    // Metodo generico para comprobar existencia de cedula
    public <T extends Usuario> T comprobarExistencia(String cedula, ArrayList<T> lista) {
        if (lista != null) {  // Null check added here
            for (T usuario : lista) {
                if (usuario.getCedula().equals(cedula)) {  // Verifica si la cédula coincide
                    return usuario;
                }
            }
        } else {
            throw new NullPointerException("The list of users is not initialized.");  // Informative exception
        }
        // If no match is found after iterating the list
        return null;
    }
}