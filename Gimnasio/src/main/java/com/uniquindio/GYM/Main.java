package com.uniquindio.GYM;

import com.uniquindio.GYM.model.Gimnasio;

public class Main {
    public static void main(String[] args) {
        System.out.println("iniciando");
        Gimnasio gimnasio = new Gimnasio("gym");
        gimnasio.quemarDatos();
        System.out.println("terminado");
    }

}
