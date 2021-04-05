package com.electro.johan.molina;


import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static java.util.Arrays.asList;

public class Electrodomestico {

    final List<String> LIST_COLORES = asList("BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS");
    Map dicConsumo = getMap();
    private int precioBase;
    private String color;
    private Character consumoEnergetico;
    private int peso;
    private int valorXPeso;


    public Electrodomestico(int pPrecioBase, String pColor, char pConsumoEnergetico, int pPeso) {
        this.precioBase = pPrecioBase;
        this.color = pColor;
        this.consumoEnergetico = pConsumoEnergetico;
        this.peso = pPeso;
        comprobarColor(LIST_COLORES);
        validarConsumo(dicConsumo);
        //precioFinal();

    }
    public Electrodomestico(){
        precioBase = 100;
        color = "BLANCO";
        consumoEnergetico = 'F';
        peso = 5;
        comprobarColor(LIST_COLORES);
        validarConsumo(dicConsumo);
        //precioFinal();

    }




    /*
    Setters
     */

    public void setValorXPeso(int valorXPeso) {
        this.valorXPeso = valorXPeso;
    }


    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setColor(String pColor) {

        this.color = pColor.toUpperCase(Locale.ROOT);
        comprobarColor(LIST_COLORES);


    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    /*
    Getters
     */

    public int getValorXPeso() {
        return valorXPeso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color.toUpperCase();
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void mensaje(String s) {
        System.out.println(s);
    }


    @Override
    public String toString() {
        return "Electrodomestico:{\n" +
                "precioBase=" + precioBase +
                "\ncolor=" + (color) +
                "\nconsumoEnergetico=" + consumoEnergetico +
                "\npeso=" + peso +
                '}';
    }

    private static Map getMap() {
        Map dicConsumo = new HashMap();
        dicConsumo.put('A', 100);
        dicConsumo.put('B', 80);
        dicConsumo.put('C', 60);
        dicConsumo.put('D', 50);
        dicConsumo.put('E', 30);
        dicConsumo.put('F', 10);
        return dicConsumo;
    }

    protected void precioFinal() {
        valorPeso(getPeso());
        int consumo = (int) dicConsumo.get(getConsumoEnergetico());
        int resultadoFinal = getValorXPeso() + getPrecioBase() + consumo;
        mensaje("Valor por Kilos: €" + getValorXPeso() + "\nPrecio base del articulo:  €" + getPrecioBase() + "\nValor consumo del articulo = €" + consumo + "\nPrecio final = €" + resultadoFinal);
        mensaje("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }


    public void validarConsumo(Map dicConsumo) {
        boolean result = dicConsumo.containsKey(getConsumoEnergetico());

        if (result) {
            mensaje("Los valores son iguales");
            mensaje("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        } else {
            setConsumoEnergetico('F');
        }


    }

    public boolean comprobarColor(List<String> LIST_COLORES) {
        boolean resultado = LIST_COLORES.contains(getColor());
        if (!resultado) {
            setColor("BLANCO");
        }
        return resultado;
    }

    public void valorPeso(int peso) {

        peso = getPeso();
        if (peso >= 0 && peso <= 19) {
            setValorXPeso(10);
        } else if (peso >= 20 && peso <= 49) {
            setValorXPeso(50);
        }
        if (peso >= 50 && peso <= 79) {
            setValorXPeso(80);
        } else if (peso >= 80) {
            setValorXPeso(100);
        }


    }

}

/*
SUB CLASE LAVADORA
 */

class Lavadora extends Electrodomestico{

    int carga;
    public Lavadora(int pPrecioBase, String pColor, char pConsumoEnergetico, int pPeso, int pCarga){
        super(pPrecioBase, pColor, pConsumoEnergetico, pPeso);
        this.carga = pCarga;
    }

    @Override
    protected void precioFinal() {
       if(carga>30){
           valorPeso(getPeso());
           int aumentoValorXCarga=50;
           int consumo = (int) dicConsumo.get(getConsumoEnergetico());
           int resultadoFinal = getValorXPeso() + getPrecioBase() + consumo + aumentoValorXCarga;
           mensaje( "Aumento de valor por carga:  €"+aumentoValorXCarga+"\nValor por Kilos: €" + getValorXPeso() + "\nPrecio base del articulo:  €" + getPrecioBase() + "\nValor consumo del articulo = €" + consumo + "\nPrecio final = €" + resultadoFinal);
           mensaje("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
       }else

        super.precioFinal();
    }

    @Override
    public String toString() {
        return "Lavadora:{\n" +
                "carga=" + carga +
                "} " + super.toString() + "\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*";
    }



}

class Television extends Electrodomestico{


    @Override
    public String toString() {
        return "Television{\n" +
                "resolucion=" + resolucion +
                "\nsintonizadorTDT=" + sintonizadorTDT +
                "} \n" + super.toString() + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*";

    }

    private int resolucion ;
   private boolean sintonizadorTDT;
    public Television (int pPrecioBase, String pColor, char pConsumoEnergetico, int pPeso,int pResolucion, boolean pSintonizadorTDT){
        super(pPrecioBase,pColor,pConsumoEnergetico,pPeso);
        this.resolucion = pResolucion;
        this.sintonizadorTDT = pSintonizadorTDT;
    }

    @Override
    protected void precioFinal() {

        if(resolucion>40 && sintonizadorTDT){
            valorPeso(getPeso());
            int tdt = 50;
            int consumo = (int) dicConsumo.get(getConsumoEnergetico());
            int resultado = getValorXPeso() + getPrecioBase() + consumo;
            Double aumentoValorXResolucion= resultado*0.30;
            Double resultadoFinal = resultado + aumentoValorXResolucion + tdt;
            mensaje( "Aumento de valor por pulgadas:  €"+aumentoValorXResolucion+"\nAumento por TDT:  €"+ tdt+"\nValor por Kilos: €" + getValorXPeso() + "\nPrecio base del articulo:  €" + getPrecioBase() + "\nValor consumo del articulo = €" + consumo + "\nPrecio final = €" + resultadoFinal);
            mensaje("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        }else
        super.precioFinal();
    }

    /*
        Getters
         */
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    /*
    Setters

    */

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }


}

