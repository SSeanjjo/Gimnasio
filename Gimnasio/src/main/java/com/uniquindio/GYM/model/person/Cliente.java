package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.Gimnasio;
import com.uniquindio.GYM.model.person.Comprobador;
import com.uniquindio.GYM.model.Usuario;
import java.util.ArrayList;

public class Cliente extends Usuario {
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasena;
    ArrayList<String> listaUsuarios = new ArrayList<>();

    Comprobador comprobador = new Comprobador();
    Gimnasio gimnasio = new Gimnasio();


    //Consultar
    public boolean comprobar() {
        try {
            comprobador.comprobarExistencia(this.getCedula(), gimnasio.getListaClientes());
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }


    //Crear
    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo, String contrasena) {
        super(cedula, nombre);
        if (!comprobar()) {
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
            this.contrasena = contrasena;
//        } else {
//            System.out.println("Ya existe un Cliente asociado a esta Cedula");
        }
    }

    //    //update
    public void actualizarCliente(String cedula, String nuevoNombre, String nuevaDireccion, String nuevoTelefono, String nuevoCorreo, String nuevaContrasena) {
        Cliente clienteExistente = (Cliente) comprobador.comprobarExistencia((this.getCedula()), gimnasio.getListaClientes());{if (clienteExistente != null) {
            clienteExistente.setNombre(nuevoNombre);
            clienteExistente.setDireccion(nuevaDireccion);
            clienteExistente.setTelefono(nuevoTelefono);
            clienteExistente.setCorreo(nuevoCorreo);
            clienteExistente.setContrasena(nuevaContrasena);
            System.out.println("Cliente actualizado correctamente.");

        } else {
            System.out.println("No se encontró un cliente con la cédula especificada.");
        }
        }
    }

    public void removerCLiente(){
        Cliente clienteExistente = (Cliente) comprobador.comprobarExistencia(this.getCedula(), gimnasio.getListaClientes());{
            if (clienteExistente != null) {
                gimnasio.getListaClientes().remove(clienteExistente);
                System.out.println("Cliente eliminado correctamente.");
            } else {
                System.out.println("No se encontró un cliente con la cédula especificada.");
            }
        }
    }

    // Métodos setter para actualizar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
