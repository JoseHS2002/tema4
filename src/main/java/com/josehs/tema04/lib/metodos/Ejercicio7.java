package com.josehs.tema04.lib.metodos;
//TODO: 7 al 11

import java.util.Scanner;

public class Ejercicio7 {
    public static int factorial(int fact, int n){
        for (int i=n;i>0;i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fact=1;
        System.out.println("Dime el numero entero");
        int n = teclado.nextInt();
        teclado.close();
        System.out.println("Factorial: "+factorial(fact, n));
    }
}
