package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio5 {

    public static void contarCaracteres(char caracter, int veces){
        for (int i=1;i<=veces;i++){
            System.out.print(caracter);
        }
        System.out.println();
    }

    public static String strContarCaracteres(char caracter, int veces){
        String s= "";
        for (int i=1;i<=veces;i++){
            s += caracter;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        char caracter;
        System.out.println("Dime la letra: ");
        caracter=teclado.nextLine().charAt(0);
        System.out.println("Repeticiones: ");
        i=teclado.nextInt();
        contarCaracteres(caracter, i);
        System.out.println("Numero de veces en las que el caracter se repite"+i);
        teclado.close();

    }
}
