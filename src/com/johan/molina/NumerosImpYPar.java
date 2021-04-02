package com.johan.molina;

public class NumerosImpYPar {


    public static void main(String[] args) {
    /*
    Números Impares con ciclo While
     */
        mensaje("Serie números impares");
        whileImpares();

     /*
     Números pares con ciclo While
      */

        mensaje("Serie números pares");
        whilePares();

        /*
    Números Impares con ciclo for
     */

    mensaje("Números Impares Ciclo For");
        forImpares();
         /*
    Números pares con ciclo for
     */
        mensaje("Números pares Ciclo For");
        forPares();
    }

    private static void forPares() {
        for(int b= 0; b<100; b++){
            if(b%2==0){
                num(b);
            }
        }
    }

    private static void forImpares() {
        for(int a= 0; a<100; a++){
            if(a%2!=0){
                num(a);
            }
        }
    }

    private static void whileImpares() {
        int i=0;
        while (i<100){
            i++;
            if(i%2!=0){
               num(i);
            }

        }
    }

    private static void whilePares() {
        int j=0;
        while (j<100){
            j++;
            if(j%2==0){
                num(j);
            }

        }
    }
    private static void mensaje(String s) {
        System.out.println(s);
    }
    private static void num(int s) {
        System.out.println(s);
    }

}
