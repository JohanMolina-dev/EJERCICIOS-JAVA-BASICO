package com.johan.molina;

import java.util.Scanner;

public class SerieNumeros {
    public static void main(String[] args) {
        /*
        Crear un programa que pida un numero por teclado y que imprima
        por pantalla los números desde el numero introducido hasta 1000
        con saldos de 2 en 2.
         */
        Scanner scanner = new Scanner(System.in);
        mensaje("Ingresa un numero positivo menor a 1000 :");
        int numeroSerie = scanner.nextInt();
        counterSerie(numeroSerie);
    }

    private static void counterSerie(int numeroSerie) {
        for (int i = numeroSerie; numeroSerie <999; i++){

            if(i<999){
                numeroSerie +=2;
                num(numeroSerie);
            }
    }
    }

    public static void mensaje(String s){
        System.out.println(s);
    }
    public static void num(int s){
        System.out.println(s);
    }
}
