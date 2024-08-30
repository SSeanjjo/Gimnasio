package com.uniquindio.GYM;

import com.uniquindio.GYM.model.*;
import com.uniquindio.GYM.model.person.*;

import java.time.*;
import java.util.*;

import static com.uniquindio.GYM.model.Clase.busquedaClase;
import static com.uniquindio.GYM.model.ReservaClase.cancelarReserva;
import static com.uniquindio.GYM.model.person.Cliente.actualizarCliente;

public class Main {
    public static void main(String[] args) {
        Gimnasio gimnasio = new Gimnasio("Gym Pro");
        System.out.println("\t \t \t \t \t \t \t \t" + gimnasio.getNombre() + "\n");
        System.out.println(" --------------------------------------- CLiente -----------------------------------------");

        Cliente cliente1 = new Cliente("10273773", "Julian Casas", "Br 23 Armenia", "323333451", "jul@gmail.com", "asdf");
        Cliente cliente2 = new Cliente("10273774", "Maria Lopez", "Cl 45 Bogota", "300123456", "maria@gmail.com", "password1");
        Cliente cliente3 = new Cliente("10273775", "Andres Gomez", "Av 12 Medellin", "301654789", "andres@gmail.com", "password2");
        Cliente cliente4 = new Cliente("10273776", "Sofia Torres", "Br 9 Cali", "302987654", "sofia@gmail.com", "password3");
        Cliente cliente5 = new Cliente("10273777", "Carlos Ruiz", "Cl 20 Barranquilla", "303456789", "carlos@gmail.com", "password4");
        Cliente cliente6 = new Cliente("10273778", "Laura Martinez", "Av 34 Pereira", "304123987", "laura@gmail.com", "password5");
        Cliente cliente7 = new Cliente("10273779", "Luis Diaz", "Cl 15 Manizales", "305654321", "luis@gmail.com", "password6");
        Cliente cliente8 = new Cliente("10273780", "Ana Sanchez", "Br 8 Bucaramanga", "306789123", "ana@gmail.com", "password7");
        Cliente cliente9 = new Cliente("10273781", "Ricardo Romero", "Av 56 Cartagena", "307456123", "ricardo@gmail.com", "password8");
        Cliente cliente10 = new Cliente("10273782", "Valentina Moreno", "Cl 33 Pasto", "308987321", "valentina@gmail.com", "password9");

        gimnasio.getListaClientes().addAll(Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5, cliente6, cliente7, cliente8, cliente9, cliente10));

        System.out.println("Clientes registrados:");
        for (Cliente cliente : gimnasio.getListaClientes()) {
            System.out.println(cliente.getNombre() + " - " + cliente.getCedula());
        }
        System.out.println('\n');
        System.out.println("Cliente a actualizar: " + cliente3.getCedula() + " - " + cliente3.getNombre());
        actualizarCliente("10273775", gimnasio.getListaClientes(), new Cliente("10273773", "Julian Casas", "Br 23 Armenia", "323333451", "jul@gmail.com", "asdf"));
        System.out.println("Cliente Actualizado: " + cliente3.getCedula() + " - " + cliente3.getNombre());

        cliente10.removerCliente("10273782", gimnasio.getListaClientes());
        System.out.println("Cliente: " + cliente10.getCedula() + " - " + cliente10.getNombre());
        cliente1.removerCliente("0000", gimnasio.getListaClientes());
        ;
        System.out.println(" --------------------------------- Instructor -----------------------------------------------");


        // Add instructors
        Instructor instructor1 = new Instructor("1183369233", "Brando Steven", EspecialidadEnum.AEROBICO);
        Instructor instructor2 = new Instructor("1183369234", "Carlos Perez", EspecialidadEnum.PESAS);
        Instructor instructor3 = new Instructor("1183369235", "Lucia Fernandez", EspecialidadEnum.YOGA);
        Instructor instructor4 = new Instructor("1183369236", "Miguel Garcia", EspecialidadEnum.CROSSFIT);
        Instructor instructor5 = new Instructor("1183369237", "Daniela Rojas", EspecialidadEnum.PILATES);

        gimnasio.getListaEntrenadores().addAll(Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5));

        // Print instructors
        System.out.println("\nEntrenadores registrados:");
        for (Instructor instructor : gimnasio.getListaEntrenadores()) {
            System.out.println(instructor.getNombre() + " - " + instructor.getCedula());
        }

        boolean exists = instructor3.comprobarExistencia("1183369235", gimnasio.getListaEntrenadores());
        System.out.println("\nInstructor con cédula 1183369235 existe: " + exists);


        // Add sessions
        Sesion sesion1 = new Sesion(DiaSemana.lunes, LocalTime.of(7, 0), LocalTime.of(9, 0));
        Sesion sesion2 = new Sesion(DiaSemana.martes, LocalTime.of(7, 0), LocalTime.of(9, 0));
        Sesion sesion3 = new Sesion(DiaSemana.miercoles, LocalTime.of(7, 0), LocalTime.of(9, 0));
        Sesion sesion4 = new Sesion(DiaSemana.jueves, LocalTime.of(14, 0), LocalTime.of(16, 0));
        Sesion sesion5 = new Sesion(DiaSemana.viernes, LocalTime.of(7, 0), LocalTime.of(9, 0));

        // Add classes
        gimnasio.getListaClases().add(new Clase(1, "Zumba Básica", new ArrayList<>(Arrays.asList(sesion1, sesion2, sesion5)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.ZUMBA, instructor1));
        gimnasio.getListaClases().add(new Clase(2, "Crossfit Avanzado", new ArrayList<>(Arrays.asList(sesion1, sesion4)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.CROSSFIT, instructor2));
        gimnasio.getListaClases().add(new Clase(3, "Yoga", new ArrayList<>(Arrays.asList(sesion3, sesion5)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.YOGA, instructor3));
        gimnasio.getListaClases().add(new Clase(4, "Pilates", new ArrayList<>(Arrays.asList(sesion1, sesion3, sesion5)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.PILATES, instructor4));
        gimnasio.getListaClases().add(new Clase(5, "Aerobics", new ArrayList<>(Arrays.asList(sesion2, sesion4)), 10, LocalDate.of(2024, 8, 20), LocalDate.of(2024, 8, 30), true, TipoClase.AEROBICOS, instructor5));


        System.out.println("\n--------------------------------Clases ------------------------------------------------");

        ArrayList<Clase> clase = busquedaClase(TipoClase.ZUMBA, instructor1, sesion1, gimnasio.getListaClases());
        System.out.println("\nClases encontradas:");
        for (Clase c : clase) {
            System.out.println(c.getTipoClase() + " - " + c.getInstructor().getNombre() + " - " + c.getHorario());
        }
        System.out.println("\nLista de reservas");
        ReservaClase reserva1 = new ReservaClase(gimnasio.getListaClases().get(0), cliente1, LocalDate.of(2024, 8, 22));
        ReservaClase reserva2 = new ReservaClase(gimnasio.getListaClases().get(1), cliente2, LocalDate.of(2024, 8, 22));
        ReservaClase.reservarClase(reserva1, gimnasio.getListaReservas());
        ArrayList<ReservaClase> listaReservas = ReservaClase.reservarClase(reserva2, gimnasio.getListaReservas());
        for (ReservaClase r : listaReservas) {
            System.out.println(r.getCliente().getNombre() + " - " + r.getClase().getNombre() + " - " + r.getFechaReserva());
            System.out.println("Reserva exitosa");
        }

        System.out.println("\nreservas de usario a cancelar: ");
        System.out.println(cliente1.getNombre() + " - " + cliente1.getCedula() + " - " + LocalDate.of(2024, 8, 22));
        ArrayList<ReservaClase> listaReservasCancel = cancelarReserva(gimnasio.getListaReservas(), cliente1.getCedula(), LocalDate.of(2024, 8, 22));
        System.out.println("\nLista de reservas");
        for (ReservaClase r : listaReservasCancel) {
            System.out.println(r.getCliente().getNombre() + " - " + r.getClase().getNombre() + " - " + r.getFechaReserva());
        }


        System.out.println(" ------------------------------------ Registro Entrenamientos--------------------------------------------");

        RegistroEntrenamiento entrenamiento1 = new RegistroEntrenamiento(cliente1, TipoEntrenamiento.CARDIO, 60, 500, LocalDate.of(2024, 8, 21));
        RegistroEntrenamiento entrenamiento2 = new RegistroEntrenamiento(cliente2, TipoEntrenamiento.PESAS, 45, 300, LocalDate.of(2024, 8, 22));
        RegistroEntrenamiento entrenamiento3 = new RegistroEntrenamiento(cliente3, TipoEntrenamiento.YOGA, 90, 400, LocalDate.of(2024, 8, 23));
        RegistroEntrenamiento entrenamiento4 = new RegistroEntrenamiento(cliente4, TipoEntrenamiento.CROSSFIT, 70, 600, LocalDate.of(2024, 8, 24));
        RegistroEntrenamiento entrenamiento5 = new RegistroEntrenamiento(cliente5, TipoEntrenamiento.PILATES, 80, 550, LocalDate.of(2024, 8, 25));
        gimnasio.getListaEntrenamientos().addAll(Arrays.asList(entrenamiento1, entrenamiento2, entrenamiento3, entrenamiento4, entrenamiento5));

        System.out.println("\nRegistros de entrenamiento:");
        for (RegistroEntrenamiento entrenamiento : gimnasio.getListaEntrenamientos()) {
            System.out.println(entrenamiento.getCliente().getNombre() + " - " + entrenamiento.getTipoEntrenamiento() + " - " + entrenamiento.getDuracion() + " minutos - " + entrenamiento.getCaloriasQuemadas() + " calorías quemadas - " + entrenamiento.getFechaEntrenamiento());
        }
        System.out.println('\n');
        entrenamiento1.historialEntrenamientos(gimnasio.getListaEntrenamientos(), "10273773");
        System.out.println("\n");
        entrenamiento1.historialEntrenamientos(gimnasio.getListaEntrenamientos(), "10273774");
        System.out.println("\n");
        entrenamiento1.historialEntrenamientos(gimnasio.getListaEntrenamientos(), "10273775");
        System.out.println("\n");
        entrenamiento1.historialEntrenamientos(gimnasio.getListaEntrenamientos(), "10273776");
        System.out.println("\n");

        System.out.println("\n\t  ------------------------------------- Generador Reportes -------------------------------------------");
        GeneradorReportes reportes = new GeneradorReportes();
        reportes.clasePopular(gimnasio.getListaClases());

        ArrayList<RegistroEntrenamiento> topTresEntrenamientos = reportes.toptresUsuariosMasActivos(gimnasio.getListaEntrenamientos());
        reportes.ejercicioMasPracticado(gimnasio.getListaEntrenamientos());


        System.out.println("\n\t ----------------------------- Top 3 clientes más activos -------------------------------------------------");
        System.out.println("\n");
        for (RegistroEntrenamiento entrenamiento : topTresEntrenamientos) {
            Cliente cliente = entrenamiento.getCliente();
            System.out.println(cliente.getNombre() + " - " +
                    entrenamiento.getTipoEntrenamiento() + " - " +
                    entrenamiento.getDuracion() + " minutos - " +
                    entrenamiento.getCaloriasQuemadas() + " calorías quemadas");
        }
    }
}
