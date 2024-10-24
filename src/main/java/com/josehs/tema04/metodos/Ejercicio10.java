package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static int m(int a){
        int x=0;
        for (int b=0; b==100; b++) {
            x=a*b;
            System.out.println(x);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int i = teclado.nextInt();
        if (i>100) {
            System.out.println("Error");
        } else {
            System.out.println("La tabla de multiplicar de "+i+"es");
            m(i);
        }
    }
}
