package com.uniquindio.GYM.model;
import java.time.LocalDate;
import java.util.ArrayList;

import com.uniquindio.GYM.model.person.Cliente;
import com.uniquindio.GYM.model.Clase;


public class ReservaClase {
    private Clase clase;
    private Cliente cliente;
    private LocalDate fechaReserva;




    public ReservaClase(Clase clase, Cliente cliente, LocalDate fechaReserva) {
        this.clase = clase;
        this.cliente = cliente;
        this.fechaReserva = fechaReserva;
    }

    public void reservarClase( String elegirClase, ArrayList<Clase> listaClases){
        for(Clase clase : listaClases){
            if(clase.getNombre().equals(elegirClase)){
                if(clase.getCapacidadPlazas() < clase.getCAPACIDADMAXIMA()){
                    clase.setCapacidadPlazas(clase.getCapacidadPlazas() + 1);
                    System.out.println("Reserva exitosa");
                    ArrayList<ReservaClase> listaReservas = new ArrayList<>();
                    listaReservas.add(new ReservaClase(clase, cliente, fechaReserva));
                }
            }
        }
    }

//    public void cancelarClase( String elegirClase, ArrayList<Clase> listaClases, String cedula){
//        for(Clase clase : listaClases){
//            if(clase.getNombre().equals(elegirClase)){
//                if()
//                }
//            }
//        }
//    }



//    public Clase getClase() {
//        return clase;
//    }
//    public void setClase(Clase clase) {
//        this.clase = clase;
//    }
//    public Cliente getCliente() {
//        return cliente;
//    }
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
//    public LocalDate getFechaReserva() {
//        return fechaReserva;
//    }
//    public void setFechaReserva(LocalDate fechaReserva) {
//        this.fechaReserva = fechaReserva;
//    }
//    @Override
//    public String toString() {
//        return "ReservaClase [clase=" + clase + ", cliente=" + cliente + ", fechaReserva=" + fechaReserva + "]";
//    }


}
