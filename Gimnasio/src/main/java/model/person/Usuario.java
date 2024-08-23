package model.person;

import model.Persona;

import java.util.ArrayList;

public class Usuario extends Persona {
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasena;
    ArrayList <String> listaUsuarios = new ArrayList<>();


    //Crear
    public Usuario(String cedula, String nombre, String direccion, String telefono, String correo, String contrasena) {
        super(cedula, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    
}
