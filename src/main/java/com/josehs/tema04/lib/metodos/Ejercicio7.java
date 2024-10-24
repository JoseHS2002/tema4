package com.josehs.tema04.lib.metodos;
//TODO: 7 al 11

import java.util.Scanner;

public class Ejercicio7 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; ++i) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero entero");
        int num = teclado.nextInt();
        teclado.close();
        if (num<0){
            System.out.println("Error");
        } else {
            int resultado = factorial(num);
            System.out.printf("Factorial:%d\n", resultado);
        }
    }

}
