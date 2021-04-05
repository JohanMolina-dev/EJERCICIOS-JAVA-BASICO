package com.electro.johan.molina;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {




    public static void main(String[] args) {

        Lavadora lavadora;
        lavadora = new Lavadora(900,"GRIS", 'A', 34,5);
        lavadora.precioFinal();
        lavadora.mensaje(lavadora.toString());






        /*
        Electrodomestico electrodomestico;
        electrodomestico = new Electrodomestico(190,"RoJo",
                'B',80);
        electrodomestico.mensaje("Electrodomestico # 1: "+electrodomestico.toString());

        Electrodomestico electrodomestico2;
        electrodomestico2 = new Electrodomestico();
        electrodomestico2.mensaje("Electrodomestico # 2: "+electrodomestico2.toString());


        Electrodomestico electrodomestico3;
        electrodomestico3 = new Electrodomestico();
        electrodomestico3.setPrecioBase(56);
        electrodomestico3.setPeso(90);
        electrodomestico3.precioFinal();
        electrodomestico3.mensaje( "Electrodomestico # 3: "+electrodomestico3.toString());


         */

    }




}
