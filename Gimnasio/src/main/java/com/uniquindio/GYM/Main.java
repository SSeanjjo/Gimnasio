package com.uniquindio.GYM;

import com.uniquindio.GYM.model.*;
import com.uniquindio.GYM.model.person.*;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Gimnasio gimnasio = new Gimnasio("gym");
        gimnasio.getListaClientes().add(new Cliente("10273773", "Julian casas", "br 23 armenia", "323333451", "jul@gmail.com", "asdf"));

        gimnasio.getListaEntrenadores().add(new Instructor("1183369233", "brando Steven", EspecialidadEnum.AEROBICO));
        gimnasio.getListaEntrenadores().add(new Instructor("1183369234", "Carlos Perez", EspecialidadEnum.PESAS));

        Sesion sesion1 = new Sesion(DiaSemana.lunes, LocalTime.of(7, 0), LocalTime.of(9, 0));
        Sesion sesion2 = new Sesion(DiaSemana.martes, LocalTime.of(7, 0), LocalTime.of(9, 0));
        Sesion sesion3 = new Sesion(DiaSemana.miercoles, LocalTime.of(7, 0), LocalTime.of(9, 0));
        Sesion sesion4 = new Sesion(DiaSemana.jueves, LocalTime.of(14, 0), LocalTime.of(16, 0));
        Sesion sesion5 = new Sesion(DiaSemana.viernes, LocalTime.of(7, 0), LocalTime.of(9, 0));
        List<Instructor> listaEntrenadores = gimnasio.getListaEntrenadores();

        gimnasio.getListaClases().add(new Clase(1, "zumba básica", new ArrayList<>(Arrays.asList(sesion1, sesion2, sesion5)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.ZUMBA, listaEntrenadores.get(0)));
        gimnasio.getListaClases().add(new Clase(2, "crossfit avanzado", new ArrayList<>(Arrays.asList(sesion1, sesion4)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.CROSSFIT, listaEntrenadores.get(1)));
        gimnasio.getListaClases().add(new Clase(3, "yoga", new ArrayList<>(Arrays.asList(sesion3, sesion5)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.YOGA, gimnasio.getListaEntrenadores().get(0)));
        gimnasio.getListaClases().add(new Clase(5, "yoga", new ArrayList<>(Arrays.asList(sesion1, sesion3, sesion5)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.PILATES, gimnasio.getListaEntrenadores().get(1)));
    }
}