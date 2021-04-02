package com.johan.molina;

import java.util.Scanner;

public class ModMensajes {
    public static void main(String[] args) {
        /*
        Del texto, “La sonrisa sera la mejor arma contra la tristeza”
        Reemplaza  todas las a del  String  anterior  por  una e,
        adicionalmente  concatenar  a  esta  frase  una adicional que ustedes quieran
        incluir por consola y las muestre luego unidas.
         */

        aPorE();

        /*
        Realizar una aplicación de consola, que al ingresar una frase por teclado elimine
        los espacios que esta contenga.
         */
        Scanner scanner = new Scanner(System.in);
        formatoSinEspacios(scanner);


    }

    private static void aPorE() {
        mensaje("Cambio A por E: ");
        String frase = "La sonrisa sera la mejor arma contra la tristeza. ";
        String frase2 = "El poder de la imaginacón nos hace infinitos.";
        String cambio = frase.replaceAll("a", "e").concat(frase2);
        mensaje(cambio);
    }

    private static void formatoSinEspacios(Scanner scanner) {
        mensaje("Ingrese por favor su nueva Frase :");
        String frasePorConsola = scanner.nextLine();
        String sinEspacios = frasePorConsola.replaceAll(" ", "" ).trim();
        mensaje("Su mensaje sin espacios es : "+ sinEspacios);
    }

    private static void mensaje(String s){
        System.out.println(s);
    }
}
