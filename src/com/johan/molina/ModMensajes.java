package com.johan.molina;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ModMensajes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Acoplamiento app similares
         */
        mensaje("Elije a que aplicación deseas ingresar: \n" +
                "1) La sonrisa sera la mejor arma contra la tristeza\n"+
                "2) Ingresar por consola una frase y eliminar sus espacios\n"+
                "3) Ingresar por consola una frase e indicar su tamaño en caracteres y contar cuantas vocales tiene\n"+
                "4) Ingresar por consola dos frases e indicarte si son iguales o cuales son sus diferencias\n"+
                "5)Consultar la Fecha y hora actual\n"+
                "6) Salir de la aplicación"
                    );

        mensaje("Ingresa tu opción");
            int option = scanner.nextInt();
            switch (option){

                case 1:
                    aPorE();
                    break;
                case 2:
                    Scanner sc = new Scanner(System.in);
                    formatoSinEspacios(sc);
                    break;
                case 3:
                    Scanner scann = new Scanner(System.in);
                    counterVocales(scann);
                    break;
                case 4:
                    Scanner scnn = new Scanner(System.in);
                    difentesPalabras(scnn);
                    break;
                case 5:
                    fechaYHora();
                    break;
                default:
                    mensaje("Chao Vuelve pronto");
                    break;
            }





    }
    /*
    Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
     */
    private static void fechaYHora() {
        DateTimeFormatter dataTFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        mensaje("La fecha y hora actual en formato (AAAA/MM/DD) (HH:MM:SS) es: "+dataTFormat.format(LocalDateTime.now()));
    }

    private static void difentesPalabras(Scanner scanner) {
        mensaje("Ingresa la primera palabra: ");
        String sPalabra1 = scanner.nextLine();
        mensaje("Ingresa la segunda palabra: ");
        String sPalabra2 = scanner.nextLine();

        if (sPalabra1.equals(sPalabra2)){
            mensaje(sPalabra1 +" es igual a :  " + sPalabra2);
        }else mensaje(sPalabra1 +" no es igual a: " + sPalabra2 +"\n"+
                        "Diferencias : \n"+
                        sPalabra1+"\n"+
                        sPalabra2+"\n"+
                        "Revisa las diferencias e intentalo de nuevo para que sean iguales"
            );
    }
    /*
    Realizar  la  construcción  de  un  algoritmo  que  permita  de  acuerdo  a  una  frase
    pasada  por  consola,  indicar  cual  es  la  longitud  de  esta  frase,  adicionalmente
    cuantas vocales tiene de “a,e,i,o,u”.
     */

    private static void counterVocales(Scanner scanner) {
        mensaje("Ingresa a continuación  tu frase:");
        String frase = scanner.nextLine();
        frase = frase.toUpperCase(Locale.ROOT);


        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;


        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='A')counterA++;
            if(frase.charAt(i)=='E')counterE++;
            if(frase.charAt(i)=='I')counterI++;
            if(frase.charAt(i)=='O')counterO++;
            if(frase.charAt(i)=='U')counterU++;
        }
        message(frase, counterA, counterE, counterI, counterO, counterU);
    }

    private static void message(String frase, int counterA, int counterE, int counterI, int counterO, int counterU) {
        mensaje("Total vocales a= " + counterA);
        mensaje("Total vocales e= " + counterE);
        mensaje("Total vocales i =" + counterI);
        mensaje( "Total vocales o =" + counterO);
        mensaje("Total vocales u=" + counterU);
        mensaje("La longitud de la frase es :"+ frase.replaceAll(" ","").length());
    }

    /*
    Del texto, “La sonrisa sera la mejor arma contra la tristeza”
    Reemplaza  todas las a del  String  anterior  por  una e,
    adicionalmente  concatenar  a  esta  frase  una adicional que ustedes quieran
    incluir por consola y las muestre luego unidas.
     */
    private static void aPorE() {
        mensaje("Cambio A por E: ");
        String frase = "La sonrisa sera la mejor arma contra la tristeza. ";
        String frase2 = "El poder de la imaginacón nos hace infinitos.";
        String cambio = frase.replaceAll("a", "e").concat(frase2);
        mensaje(cambio);
    }
    /*
        Realizar una aplicación de consola, que al ingresar una frase por teclado elimine
        los espacios que esta contenga.
         */

    private static void formatoSinEspacios(Scanner sc) {
        mensaje("Ingrese por favor su nueva Frase :");
        String frasePorConsola = sc.nextLine();
        String sinEspacios = frasePorConsola.replaceAll(" ", "" ).trim();
        mensaje("Su mensaje sin espacios es : "+ sinEspacios);
    }

    private static void mensaje(String s){
        System.out.println(s);
    }
}
