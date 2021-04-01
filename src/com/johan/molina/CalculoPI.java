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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio de tu circulo para calcular su area :)");

        double radio = scanner.nextDouble();

        getArea(radio);


    }

    private static void getArea(double radio) {
        double areaCirculo =  Math.pow(radio,2) * Math.PI;
        System.out.println("El area de tu circulo es : " + areaCirculo);
    }
}
