package com.josehs.tema04.lib.metodos;

import java.util.Scanner;

public class Ejercicio5 {
    public static int contarCaracteres(boolean caracter, int i, int j){

        do {
            caracter;
            i++;

        } while (i<j);
        return caracter;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i=0;
        boolean caracter;
        caracter=teclado.nextBoolean();
        System.out.println(caracter);
        int j=teclado.nextInt();
        System.out.println("Numero de veces en las que el caracter se repite"+i);

    }
}
