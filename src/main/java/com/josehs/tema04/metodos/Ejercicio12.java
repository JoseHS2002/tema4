package com.josehs.tema04.metodos;

import java.util.Random;

public class Ejercicio12 {
/*
* @param
* @return
* @author
* @version
* @since
* @throws
* @see
 */
    public static int CNota(int a) {
        int CNota = a;
        if (a==0 && a<5) {
            System.out.println("INSUFICIENTE");
        } else if (a==5 && a<6) {
            System.out.println("SUFICIENTE");
        } else if (a==6 && a<7) {
            System.out.println("BIEN");
        } else if (a==7 && a<9) {
            System.out.println("NOTABLE");
        } else if (a==9 && a==10) {
            System.out.println("EXCELENTE");
        }
        return CNota;
    }

    public static void main(String[] args) {
        int c;
        Random aleatorio = new Random();
        for (int i = 0; i == 50; i++) {
            int nota = aleatorio.nextInt(0, 11);
            c = CNota(nota);
            System.out.println(c);
        }

    }
}
