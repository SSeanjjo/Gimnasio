package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.Gimnasio;
import com.uniquindio.GYM.model.person.Comprobador;
import com.uniquindio.GYM.model.Usuario;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;

@Data

public class Cliente extends Usuario {
    ArrayList<String> listaUsuarios = new ArrayList<>();
    Comprobador comprobador = new Comprobador();
    Gimnasio gimnasio = new Gimnasio();
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasena;


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
    public static void actualizarCliente(String cedula, ArrayList<Cliente> listaClientes, Cliente clienteUpdate) {
        boolean encontrado = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                cliente.setNombre(clienteUpdate.getNombre());
                cliente.setDireccion(clienteUpdate.getDireccion());
                cliente.setTelefono(clienteUpdate.getTelefono());
                cliente.setCorreo(clienteUpdate.getCorreo());
                cliente.setContrasena(clienteUpdate.getContrasena());
                System.out.print("Cliente actualizado correctamente: ");
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontró un cliente con la cédula especificada.");
    }

    //Consultar
    public boolean comprobar() {
        try {
            comprobador.comprobarExistencia(this.getCedula(), gimnasio.getListaClientes());
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

//    public void removerCLiente() {
//        Cliente clienteExistente = (Cliente) comprobador.comprobarExistencia(this.getCedula(), gimnasio.getListaClientes());
//        {
//            if (clienteExistente != null) {
//                gimnasio.getListaClientes().remove(clienteExistente);
//                System.out.println("Cliente eliminado correctamente.");
//            } else {
//                System.out.println("No se encontró un cliente con la cédula especificada.");
//            }
//        }
//    }

    public void removerCliente(String cedula, ArrayList<Cliente> listaClientes) {
        Cliente clienteExistente = comprobador.comprobarExistencia(cedula, listaClientes);
        if (clienteExistente != null) {
            listaClientes.remove(clienteExistente);
            System.out.println("\nCliente eliminado correctamente.");
        } else {
            System.out.println("\nNo se encontró un cliente con la cédula especificada.");
        }
    }

}

