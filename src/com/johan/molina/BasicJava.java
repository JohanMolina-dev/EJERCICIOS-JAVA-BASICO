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
        boolean esUnNumero;
        String numero1;
        String numero2;
        int valor1 = 0;
        int valor2 = 0;
        do {
            getNumbers("¡¡Bienvenido Al sistema de comparación numérica!!", "Ingrese el primer valor a comprar:");

            numero1 = scanner.next();
            printV1("Ingrese el segundo  valor a comprar :");
            numero2 = scanner.next();
            if (compararValores(numero1, numero2)) {
                valor1 = Integer.parseInt(numero1);
                valor2 = Integer.parseInt(numero2);
                esUnNumero = true;
            } else {
                printV1("¡¡INGRESE \n VALORES\n VALIDOS!!");

                esUnNumero = false;
            }


        } while (!esUnNumero);
        mayorOEquals(valor1, valor2);
        printV2(valor1, valor2);

        getNumbers("Valor 1 = " + numero1, "Valor 2 = " + numero2);
    }

    private static boolean compararValores(String numero1, String numero2) {
        return numero1.matches("[0-9]*") && numero2.matches("[0-9]*");
    }

    private static void printV2(int numero1, int numero2) {
        System.out.println("Sus valores ingresados fueron: PRIMER VALOR = " + numero1 + " SEGUNDO VALOR = " + numero2);
    }

    private static void printV1(String s) {
        System.out.println(s);
    }

    private static void getNumbers(String s, String s2) {
        printV1(s);
        printV1(s2);
    }

    private static void mayorOEquals(int valor1, int valor2) {

        if (valor1 == valor2)
            printV1("Ambos valores numéricos son iguales");
        else if (valor1 > valor2)
            printV1("El primero valor es Mayor que el segundo valor");
        else printV1("El primer valor es menor al segundo valor");
    }
}






