package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio1 {
    public static int sumar (int x, int y){
        int suma =x+y;
        return suma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Dime un numero: ");
        a= teclado.nextInt();
        System.out.println("Dime otro numero: ");
        b= teclado.nextInt();
        teclado.close();
        System.out.println(a+"+"+b+"="+sumar(a,b));

    }
}
