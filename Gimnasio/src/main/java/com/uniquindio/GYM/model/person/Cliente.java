package com.uniquindio.GYM.model.person;

import com.uniquindio.GYM.model.Usuario;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasena;
    ArrayList <String> listaUsuarios = new ArrayList<>();


    //Crear
    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo, String contrasena) {
        super(cedula, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    
}
