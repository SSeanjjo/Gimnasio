package com.uniquindio.GYM;

import com.uniquindio.GYM.model.*;
import com.uniquindio.GYM.model.Sesion;
import com.uniquindio.GYM.model.person.*;
import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
//        System.out.println("iniciando");
//        Gimnasio gimnasio = new Gimnasio("gym");
//        gimnasio.quemarDatos();
//        System.out.println("terminado");
        Gimnasio gimnasio = new Gimnasio("gym");
        gimnasio.getListaClientes().add(new Cliente("10273773", "Julian casas", "br 23 armenia", "323333451", "jul@gmail.com", "asdf"));

        gimnasio.getListaEntrenadores().add(new Instructor("1183369233", "brando Steven", EspecialidadEnum.AEROBICO));
        gimnasio.getListaEntrenadores().add(new Instructor("1183369234", "brando Steven", EspecialidadEnum.PESAS));

        gimnasio.getListaClases().add(new Clase(1, "zumba básica", new ArrayList<>(Arrays.asList(sesion1,sesion2,sesion5)), 10, LocalDate.of(2024, 8,20 ),LocalDate.of(2024,8,30) ,true, TipoClase.ZUMBA, listaEntrenadores.get(0)));
        gimnasio.getListaClases().add(new Clase(2, "crossfit avanzado", new ArrayList<>(Arrays.asList(sesion1,sesion3)), 10, LocalDate.of(2024, 8,20 ),LocalDate.of(2024,8,30) ,true, TipoClase.CROSSFIT, listaEntrenadores.get(1));


    }

}
