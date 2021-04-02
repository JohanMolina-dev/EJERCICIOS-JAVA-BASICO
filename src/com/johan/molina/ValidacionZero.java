package com.johan.molina;

import java.util.Scanner;

public class ValidacionZero {
    public static void main(String[] args) {
        /*
        Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
        si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
         */
        Scanner scanner = new Scanner(System.in);
        boolean esValido;
        do {
            mensaje("Ingresa un numero : ");
            String numero = scanner.next();
            if(validarNumero(numero)){
                esValido = validacionNumerica(numero);

            }else{
                mensaje("Ingresa un numero valido, vuelve a intentarlo");
                esValido = false;
            }


        }while (!esValido);
    }

    private static boolean validacionNumerica(String numero) {
        int numeroValido = Integer.parseInt(numero);
        mensaje("El numero que ingresaste es valido y es = " + numeroValido);
        return true;
    }

    private static boolean validarNumero(String numero) {
        return numero.matches("[0-9]*");
    }

    private static void mensaje(String s){
        System.out.println(s);
    }

}
