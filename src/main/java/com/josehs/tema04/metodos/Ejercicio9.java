package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio9 {
    public static int suma(int n){
        int s=0;
        for (int i=n; i>1; i--){
            s=n+s;
            n--;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Inserte un numero: ");
        n = teclado.nextInt();
        int s=suma(n);
        System.out.println("La suma de "+n+" es: "+s);
    }
}
