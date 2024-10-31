package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Calcula la circunferencia a partir de su radio
     * @param radio de la circunferencia
     * @return longitud calculada
     */
    public final static double PI = 3.14f;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio;

        System.out.println("Radio de la circunferencia: ");
        radio = teclado.nextInt();
        System.out.println("El radio de una circunferencia es " + radio + ", su area es " + areaCircunferencia(radio) +", su diametro es"+diametroCircunferencia(radio)+" y su longitud es " + longitudCircunferencia(radio));
        teclado.close();
    }

    public static double areaCircunferencia(double radio) {
        return PI*radio*radio;
    }

    public static double longitudCircunferencia(double radio) {
        return diametroCircunferencia(radio) * PI;
    }
    public static double diametroCircunferencia(double radio) {
        return radio*2;
    }

}

