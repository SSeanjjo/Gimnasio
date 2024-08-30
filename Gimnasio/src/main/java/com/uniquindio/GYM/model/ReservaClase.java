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


//public static ArrayList<ReservaClase>  reservarClase( ReservaClase reservaClase, ArrayList<ReservaClase> listaReservas){
//        if(reservaClase.clase.getCapacidadPlazas() < reservaClase.clase.getCAPACIDADMAXIMA()){
//            reservaClase.clase.setCapacidadPlazas(reservaClase.clase.getCapacidadPlazas() + 1);
//            System.out.println("Reserva exitosa");
//            listaReservas.add(reservaClase);
//            return listaReservas;
//        }
//        return null;
//    }
//
//
//    public static void cancelarClase( ArrayList<ReservaClase> listaReservas, String cedula, LocalDate fechaReserva){
//        for(ReservaClase reservaClase : listaReservas){
//            if(reservaClase.cliente.getCedula().equals(cedula) && reservaClase.fechaReserva.equals(fechaReserva)){
//                reservaClase.clase.setCapacidadPlazas(reservaClase.clase.getCapacidadPlazas() - 1);
//                listaReservas.remove(reservaClase);
//                // Se elimina la reserva de la lista de
//                System.out.println("Reserva cancelada");
//            }
//        }
//    }
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

    public Clase getClase() {
        return clase;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

}
