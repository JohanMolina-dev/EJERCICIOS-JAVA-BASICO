package com.johan.molina;

import java.util.Scanner;

public class DiaSemana {
 /*
        Crea una aplicación por consola que nos pida un día de la semana
        y que nos diga si es un día laboral o no. Usa un switch para ello.
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String formatoDia = getFormatoDia(scanner);

        switch (formatoDia){
            case "LUNES":
                mensaje("El lunes es un dia laboral animo :D");
                break;
            case "MARTES":
                mensaje("El martes es un dia laboral animo :D");
                break;
            case "MIERCOLES":
                mensaje("El miércoles es un dia laboral y es el ombligo de la semana");
                break;
            case "JUEVES":
                mensaje("El jueves es un dia laboral quedan 2 días para el Sábado ");
                break;
            case "VIERNES":
                mensaje("El viernes es un dia laboral disfrutalo");
                break;
            case "SABADO":
                mensaje("El Sábado no es un dia laboral aprovechalo al ¡Maximo! :)");
                break;
            case "DOMINGO":
                mensaje("El Domingo no es un dia laboral, dedicale tiempo a tu Familia <3");
                break;

        }



    }

    private static String getFormatoDia(Scanner scanner) {
        mensaje("Ingresa el día de la semana, recuerda no usar tildes :");
        String diaSemana= scanner.nextLine();
        String formatoDia = diaSemana.replaceAll(" ", "");
        return formatoDia.toUpperCase();
    }
    private static void mensaje(String s){
        System.out.println(s);
    }
}
