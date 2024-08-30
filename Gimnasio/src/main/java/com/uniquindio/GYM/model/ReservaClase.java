package com.uniquindio.GYM.model;

import java.time.LocalDate;
import java.util.ArrayList;

import com.uniquindio.GYM.model.person.Cliente;
import lombok.Data;

@Data
public class ReservaClase {
    private Clase clase;
    private Cliente cliente;
    private LocalDate fechaReserva;


    public ReservaClase(Clase clase, Cliente cliente, LocalDate fechaReserva) {
        this.clase = clase;
        this.cliente = cliente;
        this.fechaReserva = fechaReserva;
    }


    public static ArrayList<ReservaClase> reservarClase(ReservaClase reservaClase, ArrayList<ReservaClase> listaReservas) {
        if (reservaClase.clase.getCapacidadPlazas() < reservaClase.clase.getCAPACIDADMAXIMA()) {
            reservaClase.clase.setCapacidadPlazas(reservaClase.clase.getCapacidadPlazas() + 1);
            listaReservas.add(reservaClase);
            //System.out.println("Reserva exitosa");
            return listaReservas;
        }
        return null;
    }


    public static ArrayList<ReservaClase> cancelarReserva(ArrayList<ReservaClase> listaReservas, String cedula, LocalDate fechaReserva) {
        for (ReservaClase reservaClase : listaReservas) {
            if (reservaClase.cliente.getCedula().equals(cedula) && reservaClase.fechaReserva.equals(fechaReserva)) {
                reservaClase.clase.setCapacidadPlazas(reservaClase.clase.getCapacidadPlazas() - 1);
                listaReservas.remove(reservaClase);
                System.out.println("Reserva cancelada");
                return listaReservas;
            }
        }
        return null;
    }


}
