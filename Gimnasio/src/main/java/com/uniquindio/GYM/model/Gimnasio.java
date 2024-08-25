package com.uniquindio.GYM.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import com.uniquindio.GYM.model.person.*;


public class Gimnasio {
    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Instructor> listaEntrenadores;
    private ArrayList<Clase> listaClases;
    private ArrayList<RegistroEntrenamiento> listaEntrenamientos;
    public Gimnasio(String nombre, ArrayList<Cliente> listaClientes, ArrayList<Instructor> listaEntrenadores,
            ArrayList<Clase> listaClases, ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaEntrenadores = listaEntrenadores;
        this.listaClases = listaClases;
        this.listaEntrenamientos = listaEntrenamientos;
    }
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaEntrenadores = new ArrayList<>();
        this.listaClases = new ArrayList<>();
        this.listaEntrenamientos = new ArrayList<>();
    }
    public void quemarDatos(){
        //sección para quemar entrenadores;
        listaEntrenadores.add(new Instructor("1183369233", "brando Steven", EspecialidadEnum.AEROBICO));
        listaEntrenadores.add(new Instructor("1183928733", "Juan Sebastian", EspecialidadEnum.CIRCUITO));
        listaEntrenadores.add(new Instructor("3798399233", "Richard Stallman", EspecialidadEnum.PESAS));
        listaEntrenadores.add(new Instructor("3983049484", "jose heriberto", EspecialidadEnum.AEROBICO));
        //sección para quemar sesiones
        Sesion sesion1 = new Sesion(DiaSemana.lunes, LocalTime.of(7, 0),LocalTime.of(9, 0));
        Sesion sesion2 = new Sesion(DiaSemana.martes, LocalTime.of(7, 0),LocalTime.of(9, 0));
        Sesion sesion3 = new Sesion(DiaSemana.miercoles, LocalTime.of(7, 0),LocalTime.of(9, 0));
        Sesion sesion4 = new Sesion(DiaSemana.jueves, LocalTime.of(7, 0),LocalTime.of(9, 0));
        Sesion sesion5 = new Sesion(DiaSemana.lunes, LocalTime.of(14, 0),LocalTime.of(16, 0));

        //sección para quemar clases
        Clase clase1 = new Clase(1, "zumba básica", new ArrayList<>(Arrays.asList(sesion1,sesion2,sesion5)), 10, LocalDate.of(2024, 8,20 ),LocalDate.of(2024,8,30) ,true, TipoClase.ZUMBA, listaEntrenadores.get(0));
        Clase clase2 = new Clase(2, "crossfit avanzado", new ArrayList<>(Arrays.asList(sesion1,sesion3)), 10, LocalDate.of(2024, 8,20 ),LocalDate.of(2024,8,30) ,true, TipoClase.CROSSFIT, listaEntrenadores.get(1));
        Clase clase3 = new Clase(3, "yoga", new ArrayList<>(Arrays.asList(sesion1,sesion2,sesion4)), 10, LocalDate.of(2024, 8,20 ),LocalDate.of(2024,8,30) ,true, TipoClase.YOGA, listaEntrenadores.get(2));
        listaClases.add(clase1);listaClases.add(clase2);listaClases.add(clase3);
        //clientes quemados 
        Cliente cliente1 = new Cliente("10273773", "Julian casas", "br 23 armenia", "323333451", "jul@gmail.com", "asdf");
        listaClientes.add(cliente1);

        //revision de los datos quemados
        System.out.println("revisión de clases quemadas");
        for (Clase clase : listaClases) {
            System.out.println(clase.toString());
        }
        System.out.println("revisión instructores quemados");
        for (Instructor instructor : listaEntrenadores) {
            System.out.println(instructor.toString());
        }
        System.out.println("revisión clientes quemados");
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public ArrayList<Instructor> getListaEntrenadores() {
        return listaEntrenadores;
    }
    public void setListaEntrenadores(ArrayList<Instructor> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }
    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }
    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }
    public ArrayList<RegistroEntrenamiento> getListaEntrenamientos() {
        return listaEntrenamientos;
    }
    public void setListaEntrenamientos(ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
        this.listaEntrenamientos = listaEntrenamientos;
    }
    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", listaClientes=" + listaClientes + ", listaEntrenadores="
                + listaEntrenadores + ", listaClases=" + listaClases + ", listaEntrenamientos=" + listaEntrenamientos
                + "]";
    }
    
    
}
