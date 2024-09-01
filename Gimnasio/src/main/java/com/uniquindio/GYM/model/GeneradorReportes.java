package com.uniquindio.GYM.model;

import com.uniquindio.GYM.model.person.Cliente;

import java.util.ArrayList;

public class GeneradorReportes {
    public Clase clasePopular(ArrayList<Clase> listaClases) {
        if (listaClases == null || listaClases.isEmpty()) {
            return null;
        }

        int max = listaClases.get(0).getCapacidadPlazas();
        int index = 0;

        for (int i = 1; i < listaClases.size(); i++) {
            if (listaClases.get(i).getCapacidadPlazas() < max) {
                max = listaClases.get(i).getCapacidadPlazas();
                index = i;
            }
        }
        return listaClases.get(index);
    }
    public ArrayList<Cliente> toptresUsuariosMasActivos(ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
        RegistroEntrenamiento primeroEntrenamiento = null, segundoEntrenamiento = null, terceroEntrenamiento = null;

        double primero = 0, segundo = 0, tercero = 0;

        for (RegistroEntrenamiento entrenamiento : listaEntrenamientos) {
            double caloriasQuemadas = entrenamiento.getCaloriasQuemadas();

            if (caloriasQuemadas > primero) {
                tercero = segundo;
                terceroEntrenamiento = segundoEntrenamiento;
                segundo = primero;
                segundoEntrenamiento = primeroEntrenamiento;
                primero = caloriasQuemadas;
                primeroEntrenamiento = entrenamiento;
            } else if (caloriasQuemadas > segundo) {
                tercero = segundo;
                terceroEntrenamiento = segundoEntrenamiento;
                segundo = caloriasQuemadas;
                segundoEntrenamiento = entrenamiento;
            } else if (caloriasQuemadas > tercero) {
                tercero = caloriasQuemadas;
                terceroEntrenamiento = entrenamiento;
            }
        }

        ArrayList<RegistroEntrenamiento> topTresEntrenamientos = new ArrayList<>();
        if (primeroEntrenamiento != null) topTresEntrenamientos.add(primeroEntrenamiento);
        if (segundoEntrenamiento != null) topTresEntrenamientos.add(segundoEntrenamiento);
        if (terceroEntrenamiento != null) topTresEntrenamientos.add(terceroEntrenamiento);

        ArrayList<Cliente> topClientes= new ArrayList<>();
        topClientes.add(primeroEntrenamiento.getCliente());
        topClientes.add(segundoEntrenamiento.getCliente());
        topClientes.add(terceroEntrenamiento.getCliente());

        return topClientes;
    }


    public String ejercicioMasPracticado(ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
        ArrayList<TipoEntrenamiento> tiposEntrenamiento = new ArrayList<>();
        ArrayList<Integer> tiemposTotales = new ArrayList<>();

        // Recorrer la lista de entrenamientos para sumar los tiempos
        for (RegistroEntrenamiento entrenamiento : listaEntrenamientos) {
            TipoEntrenamiento tipoEntrenamiento = entrenamiento.getTipoEntrenamiento();
            int duracion = entrenamiento.getDuracion();  // Duración en minutos

            if (tiposEntrenamiento.contains(tipoEntrenamiento)) {
                // Si ya existe, sumar la duración al tiempo total correspondiente
                int index = tiposEntrenamiento.indexOf(tipoEntrenamiento);
                tiemposTotales.set(index, tiemposTotales.get(index) + duracion);
            } else {
                // Si no existe, añadir el tipo de entrenamiento y la duración
                tiposEntrenamiento.add(tipoEntrenamiento);
                tiemposTotales.add(duracion);
            }
        }

        // Encontrar el tipo de ejercicio más practicado
        TipoEntrenamiento ejercicioMasPracticado = null;
        int maxTiempo = 0;
        for (int i = 0; i < tiemposTotales.size(); i++) {
            if (tiemposTotales.get(i) > maxTiempo) {
                maxTiempo = tiemposTotales.get(i);
                ejercicioMasPracticado = tiposEntrenamiento.get(i);
            }
        }

        // Crear el mensaje de salida
        String mensaje;
        if (ejercicioMasPracticado != null) {
            mensaje = "El tipo de ejercicio más practicado es: " + ejercicioMasPracticado
                    + " con un tiempo registrado de " + maxTiempo + " minutos.";
        } else {
            mensaje = "No hay datos de ejercicios registrados.";
        }

        return mensaje;
    }
    }

