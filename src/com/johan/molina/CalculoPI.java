package com.johan.molina;

import java.util.Scanner;

/*
            Haz una aplicación que calcule el área de un círculo(pi*R2).
            El radio se pedirá por teclado  (recuerda  pasar  de  String
             a  double  conDouble.parseDouble).
            Usa  la constante PI y el método pow de Math.
 */

public class CalculoPI {

    public static void main(String[] args) {
        boolean esUnNumero;

        Scanner scanner = new Scanner(System.in);
        do {
            mensaje("Ingresa el radio de tu circulo para calcular su area :)");
            String radio = scanner.next();
            if (compararValores(radio)){
                esUnNumero = validacionParseD(radio);
            }
            else{
                mensaje("Numero invalido!!");
                esUnNumero = false;
            }





        }while (!esUnNumero);



    }

    private static boolean validacionParseD(String radio) {
        double radioDouble = Double.parseDouble(radio);
        getArea(radioDouble);
        return true;
    }

    private static boolean compararValores(String radio) {
        return radio.matches("[0.0-9.9]*") || radio.matches("[0-9]*");
    }

    private static void getArea(double radioDouble) {
        double areaCirculo =  Math.pow(radioDouble,2) * Math.PI;
        mensaje("El area de tu circulo es : " + areaCirculo);
    }

    private static void mensaje(String s) {
        System.out.println(s);
    }
}
