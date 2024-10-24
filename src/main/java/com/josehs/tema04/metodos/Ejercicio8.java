package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio8 {
    public static boolean esCapicua(int numero){
        String palabra= String.valueOf(numero);

        for (int i=0, j= palabra.length()-1; i <= j; i++, --j){
            if (palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero capicuo: ");
        int numero = teclado.nextInt();
        System.out.println("El numero"+numero+"es capicuo"+esCapicua(numero));
    }

}
