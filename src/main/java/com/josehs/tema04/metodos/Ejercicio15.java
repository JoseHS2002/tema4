package com.josehs.tema04.metodos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int sumaM = 0;
        int sumaJ=0;
        int j;
        int m;

        do {
            System.out.println("Ingresar numero");
            j = teclado.nextInt();
            m = aleatorio.nextInt(6);
            sumaJ = sumaJ+j;
            sumaM = sumaM+m;
            System.out.println("Jugador: " + sumaJ);
            System.out.println("Maquina: " + sumaM);
        }
        while (sumaJ < 11 && sumaM < 11);
        teclado.close();

        if (sumaJ > 11){
            System.out.println("You lose");
        } else if (sumaM > 11) {
            System.out.println("You won");
        }
        System.out.println("Jugador: " + sumaJ);
        System.out.println("Maquina: " + sumaM);
    }
}
