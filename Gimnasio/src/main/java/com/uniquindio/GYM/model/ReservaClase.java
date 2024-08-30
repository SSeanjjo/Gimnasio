package com.uniquindio.GYM.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

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


    public static ArrayList<ReservaClase> reservarClase(ReservaClase reserva, ArrayList<ReservaClase> listaReservas) {
        listaReservas.add(reserva);
        System.out.println("Reserva exitosa");
        return listaReservas;
    }

    public static void cancelarClase(ArrayList<ReservaClase> listaReservas, String cedulaCliente, LocalDate fechaReserva) {
        Iterator<ReservaClase> iterator = listaReservas.iterator();
        while (iterator.hasNext()) {
            ReservaClase reserva = iterator.next();
            if (reserva.getCliente().getCedula().equals(cedulaCliente) && reserva.getFechaReserva().equals(fechaReserva)) {
                iterator.remove();
                System.out.println("Reserva cancelada");
            }
        }
    }


}
