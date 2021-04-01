package com.johan.molina;

import java.util.Scanner;

public class BasicJava {

        /*
        Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de  los  dos.
        Si  son  iguales  indicarlo también.  Ve  cambiando  los  valores  para comprobar que funciona.
        Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
        menores o iguales.
         */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            getNumbers("¡¡Bienvenido Al sistema de comparación numerica!!", "Ingrese el primer valor a comprar:");
            int numero1 = scanner.nextInt();
            printV1("Ingrese el segundo  valor a comprar :");
            int numero2 = scanner.nextInt();
            printV2(numero1, numero2);

            mayorOEquals(numero1, numero2);

            getNumbers("Valor 1 = " + numero1, "Valor 2 = " + numero2);
        }

    private static void printV2(int numero1, int numero2) {
        System.out.println("Sus valores ingresados fueron: PRIMER VALOR = " + numero1 + "SEGUNDO VALOR = " + numero2);
    }

    private static void printV1(String s) {
        System.out.println(s);
    }

    private static void getNumbers(String s, String s2) {
        printV1(s);
        printV1(s2);
    }

    private static void mayorOEquals(int numero1, int numero2) {

            if(numero1 == numero2)
                printV1("Ambos valores numericos son iguales");
            else if(numero1 > numero2)
                printV1("El primero valor es Mayor que el segundo valor");
            else printV1("El primer valor es menor al segundo valor");
    }
}






