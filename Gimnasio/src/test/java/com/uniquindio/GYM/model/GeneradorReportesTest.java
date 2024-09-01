package com.uniquindio.GYM.model;

import com.uniquindio.GYM.model.person.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorReportesTest {

    GeneradorReportes generadorReportes = new GeneradorReportes();

    @Test
    void clasePopular() {
        ArrayList<Clase> listaClases1 = new ArrayList<>();
        Clase clase1 = new Clase(1, "Zumbalo", null, 18, null, null, true, TipoClase.AEROBICOS, null);
        Clase clase2 = new Clase(2, "Zumbalo0", null, 20, null, null, true, TipoClase.CROSSFIT, null);
        Clase clase3 = new Clase(3, "Zumbalo0", null, 30, null, null, true, TipoClase.CROSSFIT, null);
        listaClases1.add(clase1);
        listaClases1.add(clase2);
        listaClases1.add(clase3);
        Clase claseTest = generadorReportes.clasePopular(listaClases1);
        Assertions.assertEquals(claseTest, clase1);
    }

    @Test
    void toptresUsuariosMasActivos() {
        Cliente cliente1 = new Cliente("10273773", "Julian Casas", "Br 23 Armenia", "323333451", "jul@gmail.com", "asdf");
        Cliente cliente2 = new Cliente("10273774", "Maria Lopez", "Cl 45 Bogota", "300123456", "maria@gmail.com", "password1");
        Cliente cliente3 = new Cliente("10273775", "Andres Gomez", "Av 12 Medellin", "301654789", "andres@gmail.com", "password2");
        Cliente cliente4 = new Cliente("10273776", "Sofia Torres", "Br 9 Cali", "302987654", "sofia@gmail.com", "password3");

        RegistroEntrenamiento registro4 = new RegistroEntrenamiento(cliente4, TipoEntrenamiento.CARDIO, 45, 1600, null);
        RegistroEntrenamiento registro5 = new RegistroEntrenamiento(cliente1, TipoEntrenamiento.PESAS, 60, 2100, null);
        RegistroEntrenamiento registro6 = new RegistroEntrenamiento(cliente2, TipoEntrenamiento.YOGA, 50, 1100, null);
        RegistroEntrenamiento registro7 = new RegistroEntrenamiento(cliente3, TipoEntrenamiento.CROSSFIT, 35, 1800, null);
        RegistroEntrenamiento registro8 = new RegistroEntrenamiento(cliente4, TipoEntrenamiento.PILATES, 40, 1200, null);
        RegistroEntrenamiento registro9 = new RegistroEntrenamiento(cliente1, TipoEntrenamiento.FUERZA, 55, 2200, null);
        RegistroEntrenamiento registro10 = new RegistroEntrenamiento(cliente2, TipoEntrenamiento.CARDIO, 20, 1400, null);
        RegistroEntrenamiento registro11 = new RegistroEntrenamiento(cliente3, TipoEntrenamiento.YOGA, 25, 1000, null);
        RegistroEntrenamiento registro12 = new RegistroEntrenamiento(cliente4, TipoEntrenamiento.VELOCIDAD, 22, 1300, null);
        RegistroEntrenamiento registro13 = new RegistroEntrenamiento(cliente1, TipoEntrenamiento.CROSSFIT, 45, 1900, null);
        RegistroEntrenamiento registro14 = new RegistroEntrenamiento(cliente2, TipoEntrenamiento.PESAS, 50, 2000, null);
        RegistroEntrenamiento registro15 = new RegistroEntrenamiento(cliente3, TipoEntrenamiento.PILATES, 30, 950, null);
        RegistroEntrenamiento registro1 = new RegistroEntrenamiento(cliente1, TipoEntrenamiento.VELOCIDAD, 19, 1299, null);

        ArrayList<RegistroEntrenamiento> registros = new ArrayList<>();
        registros.add(registro1);
        registros.add(registro4);
        registros.add(registro5);
        registros.add(registro6);
        registros.add(registro7);
        registros.add(registro8);
        registros.add(registro9);
        registros.add(registro10);
        registros.add(registro11);
        registros.add(registro12);
        registros.add(registro13);
        registros.add(registro15);
        registros.add(registro14);



        ArrayList<Cliente> topEsperado = new ArrayList<>();
        topEsperado.add(cliente1);
        topEsperado.add(cliente1);
        topEsperado.add(cliente2);

        ArrayList<Cliente> topTest = generadorReportes.toptresUsuariosMasActivos(registros);
        Assertions.assertIterableEquals(topEsperado, topTest);
    }

    @Test
    void ejercicioMasPracticado() {
        Cliente cliente1 = new Cliente("10273773", "Julian Casas", "Br 23 Armenia", "323333451", "jul@gmail.com", "asdf");
        Cliente cliente2 = new Cliente("10273774", "Maria Lopez", "Cl 45 Bogota", "300123456", "maria@gmail.com", "password1");
        Cliente cliente3 = new Cliente("10273775", "Andres Gomez", "Av 12 Medellin", "301654789", "andres@gmail.com", "password2");

        ArrayList<RegistroEntrenamiento> listaEntrenamientos = new ArrayList<>();

        listaEntrenamientos.add(new RegistroEntrenamiento(cliente1, TipoEntrenamiento.CARDIO, 30, 500, LocalDate.of(2024, 8, 1)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente2, TipoEntrenamiento.PESAS, 45, 700, LocalDate.of(2024, 8, 2)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente1, TipoEntrenamiento.CARDIO, 25, 400, LocalDate.of(2024, 8, 3)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente3, TipoEntrenamiento.YOGA, 60, 300, LocalDate.of(2024, 8, 4)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente2, TipoEntrenamiento.CARDIO, 50, 800, LocalDate.of(2024, 8, 5)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente3, TipoEntrenamiento.CROSSFIT, 40, 1000, LocalDate.of(2024, 8, 6)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente1, TipoEntrenamiento.PESAS, 35, 600, LocalDate.of(2024, 8, 7)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente2, TipoEntrenamiento.YOGA, 50, 250, LocalDate.of(2024, 8, 8)));
        listaEntrenamientos.add(new RegistroEntrenamiento(cliente3, TipoEntrenamiento.CARDIO, 30, 500, LocalDate.of(2024, 8, 9)));

        String resultado = generadorReportes.ejercicioMasPracticado(listaEntrenamientos);

        // Resultado esperado
        String textoEsperado = "El tipo de ejercicio más practicado es: CARDIO con un tiempo registrado de 135 minutos.";

        // Comparar la salida esperada con la salida real
        assertEquals(textoEsperado, resultado);
    }

}