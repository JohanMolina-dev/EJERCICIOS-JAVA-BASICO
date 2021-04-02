package com.johan.molina;

import java.util.Scanner;


public class CalculoIva {
    /*
    Lee  un  número  por  teclado  que  pida  el  precio  de  un  producto
    (puede  tener decimales) y calcule el precio final con IVA.
    El IVA sera una constante que sera del 21%.
     */

    public static final double PORCENTAJE_IVA = 21;
    public static final double FACTOR_IVA = PORCENTAJE_IVA / 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esUnNumero ;
        do {
            mensaje("Ingresa el valor de tu artículos :");

            String valorImporte = scanner.next();
            if(compararValores(valorImporte)){
                esUnNumero = toDouble(valorImporte);

            }else {
                mensaje("Valor invalido intentelo de nuevo");
                esUnNumero = false;
            }


        }while (!esUnNumero);




    }

    private static boolean toDouble(String valorImporte) {

        double valorArticulo = Double.parseDouble(valorImporte);
        getIva(valorArticulo);

        return true;
    }

    private static boolean compararValores(String valorImporte) {
        return valorImporte.matches("[0-9]*") || valorImporte.matches("[0.0-9.9]*");
    }

    private static void getIva(double valorImporte) {
        double calculoIva = valorImporte * FACTOR_IVA;
        double total = valorImporte + calculoIva;

        mensaje( "El valor del iva es : "+ "$"+ calculoIva);
        mensaje( "El valor total de tu articulo es : "+"$"+ total);
    }

    private static void mensaje(String s) {
        System.out.println(s);
    }

}

