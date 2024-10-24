package com.josehs.tema04.metodos;
import java.util.Scanner;

public class Ejercicio3 {
    public static int maximo(int a, int b) {
        int max = 0;

        if (a>b)
            max=a;
         else
            max=b;

        return (max);

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max=0;
        int a=0, b=0;
        System.out.println("Introduzca el primer número: ");
        a= teclado.nextInt();
        System.out.println("Introduzca el segundo número: ");
        b= teclado.nextInt();

        max= maximo(a, b);
        System.out.println("El número mayor es: "+max);

    }
}
