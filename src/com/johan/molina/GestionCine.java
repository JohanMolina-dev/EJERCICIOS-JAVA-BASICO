package com.johan.molina;

import java.util.Scanner;

public class GestionCine {
    public static void main(String[] args) {

        boolean salir = true;

        do {
            menuCine();
            salir = switchMenu(salir);
        }while (!salir);

    }

    private static boolean switchMenu(boolean salir) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                salir =false;
                break;
            case 2:
                salir =false;
                break;
            case 3:
                salir =false;
                break;
            case 4:
                salir =false;
                break;
            case 5:
                salir =false;
                break;
            case 6:
                salir =false;
                break;
            case 7:
                salir =false;
                break;
            case 8:
                salir =true;
                mensaje("Chao");
                break;
            default:
                mensaje("Ingrese un opción Valida");
                salir=false;
                break;
        }
        return salir;
    }


    private static void menuCine() {
        mensaje("****** GESTIÓN CINEMATOGRÁFICA ******** \n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6-VER PELÍCULAS DE LOS ACTORES\n" +
                "7-VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }

    public static void mensaje(String s){
        System.out.println(s);
    }
}
