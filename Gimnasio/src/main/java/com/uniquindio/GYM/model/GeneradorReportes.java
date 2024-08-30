package com.uniquindio.GYM.model;

import com.uniquindio.GYM.model.person.Cliente;

import java.util.ArrayList;

public class GeneradorReportes {
    public void clasePopular(ArrayList<Clase> listaClases) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < listaClases.size(); i++) {
            if (listaClases.get(i).getCapacidadPlazas() > max) {
                max = listaClases.get(i).getCapacidadPlazas();
                index = i;
            }
        }
        System.out.println("La clase más popular es: " + listaClases.get(index).getNombre());
    }

//    public ArrayList<Cliente> toptresUsuariosMasActivos(ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
//        Cliente primeroCliente = null, segundoCliente = null, terceroCliente = null;
//        double primero = 0, segundo = 0, tercero = 0;
//
//        for (RegistroEntrenamiento entrenamiento : listaEntrenamientos) {
//            double caloriasQuemadas = entrenamiento.getCaloriasQuemadas();
//            Cliente cliente = entrenamiento.getCliente();
//
//            if (caloriasQuemadas > primero) {
//                tercero = segundo;
//                terceroCliente = segundoCliente;
//                segundo = primero;
//                segundoCliente = primeroCliente;
//                primero = caloriasQuemadas;
//                primeroCliente = cliente;
//            } else if (caloriasQuemadas > segundo) {
//                tercero = segundo;
//                terceroCliente = segundoCliente;
//                segundo = caloriasQuemadas;
//                segundoCliente = cliente;
//            } else if (caloriasQuemadas > tercero) {
//                tercero = caloriasQuemadas;
//                terceroCliente = cliente;
//            }
//        }
//        ArrayList<Cliente> topTres = new ArrayList<>();
//        if (primeroCliente != null) topTres.add(primeroCliente);
//        if (segundoCliente != null) topTres.add(segundoCliente);
//        if (terceroCliente != null) topTres.add(terceroCliente);
//
//        return topTres;
//    }
public ArrayList<RegistroEntrenamiento> toptresUsuariosMasActivos(ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
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

    return topTresEntrenamientos;
}

    public void ejercicioMasPracticado(ArrayList<RegistroEntrenamiento> listaEntrenamientos) {
        ArrayList<TipoEntrenamiento> tiposEntrenamiento = new ArrayList<>();
        ArrayList<Integer> tiemposTotales = new ArrayList<>();

        for (RegistroEntrenamiento entrenamiento : listaEntrenamientos) {
            TipoEntrenamiento tipoEntrenamiento = entrenamiento.getTipoEntrenamiento();
            int duracion = entrenamiento.getDuracion();  // Duration in minutes

            if (tiposEntrenamiento.contains(tipoEntrenamiento)) {
                // If it exists, add the duration to the corresponding total time
                int index = tiposEntrenamiento.indexOf(tipoEntrenamiento);
                tiemposTotales.set(index, tiemposTotales.get(index) + duracion);
            } else {
                tiposEntrenamiento.add(tipoEntrenamiento);
                tiemposTotales.add(duracion);
            }
        }

        TipoEntrenamiento ejercicioMasPracticado = null;
        int maxTiempo = 0;
        for (int i = 0; i < tiemposTotales.size(); i++) {
            if (tiemposTotales.get(i) > maxTiempo) {
                maxTiempo = tiemposTotales.get(i);
                ejercicioMasPracticado = tiposEntrenamiento.get(i);
            }
        }

        if (ejercicioMasPracticado != null) {
            System.out.println("El tipo de ejercicio más practicado es: " + ejercicioMasPracticado
                    + " con un tiempo registrado de " + maxTiempo + " minutos.");
        } else {
            System.out.println("No hay datos de ejercicios registrados.");
        }
    }
}
