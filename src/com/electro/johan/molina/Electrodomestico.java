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
        precioFinal();

    }
    public Electrodomestico(){
        precioBase = 100;
        color = "BLANCO";
        consumoEnergetico = 'F';
        peso = 5;
        comprobarColor(LIST_COLORES);
        validarConsumo(dicConsumo);
        precioFinal();

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
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + (color) +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
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

    public int precioFinal() {
        valorPeso(getPeso());
        int consumo = (int) dicConsumo.get(getConsumoEnergetico());
        int resultadoFinal = getValorXPeso() + getPrecioBase() + consumo;
        mensaje("Valor por Kilos: €" + getValorXPeso() + " Precio base del articulo:  €" + getPrecioBase() + " Valor consumo del articulo = €" + consumo + " Precio final = €" + resultadoFinal);
        return consumo;
    }

    public void validarConsumo(Map dicConsumo) {
        boolean result = dicConsumo.containsKey(getConsumoEnergetico());

        if (result) {
            mensaje("Los valores son iguales");
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
    public int precioFinal() {
        valorPeso(getPeso());
        int consumo = (int) dicConsumo.get(getConsumoEnergetico());
        int x = 50;
if (carga>30){
    int resultadoFinal = getValorXPeso() + getPrecioBase() + consumo + x;
    mensaje("Valor por Kilos: €" + getValorXPeso() + " Precio base del articulo:  €" + getPrecioBase() + " Valor consumo del articulo = €" + consumo +"x = "+x+ " Precio final = €" + resultadoFinal);
}else {
    int resultadoFinal = getValorXPeso() + getPrecioBase() + consumo;
    mensaje("Valor por Kilos: €" + getValorXPeso() + " Precio base del articulo:  €" + getPrecioBase() + " Valor consumo del articulo = €" + consumo + " Precio final = €" + resultadoFinal);
}



        return consumo;
    }

    /*
    @Override
    public int precioFinal() {
        if(carga>50){
            int y= precioFinal();

             super.precioFinal();
        }

        return 0;
    }
     */

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                "} " + super.toString();
    }



}
