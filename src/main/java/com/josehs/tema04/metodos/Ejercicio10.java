package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static int m(int a){
        int x;
        int b=0;
        do {
            x=a*b;
            System.out.println(x);
        } while (b<100);
        return x;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int i = teclado.nextInt();
        if (i>100) {
            System.out.println("Error");
        } else {
            int x=m(i);
            System.out.println("La tabla de multiplicar de "+i+"es"+x);
        }
    }
}
