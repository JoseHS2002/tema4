package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio4 {
    public static int mayor(int a, int b) {
        int mayor = b;

        if (a > b) {
            mayor = a;
        }

        return mayor;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Introduzca el primer número: ");
        a = teclado.nextInt();
        System.out.println("Introduzca el segundo número: ");
        b = teclado.nextInt();
        System.out.println("Introduzca el tercer número: ");
        c = teclado.nextInt();
        System.out.println("Introduzca el cuarto número: ");
        d = teclado.nextInt();

        if (mayor(a, b) > mayor(c, d)) {
            System.out.println("El mayor es: " + mayor(a, b));
        } else {
            System.out.println("El mayor es: " + mayor(c, d));
        }

    }
}
