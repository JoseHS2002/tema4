package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void contarCaracteresMatriz(char caracter, int x, int y){

        for (int i=1; i <= x;i++){
            for (int j = 1; j <= y; j++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static String strContarCaracteresMatriz(char caracter, int x, int y){
        String s= "";
        for (int i=1; i <= x; i++){
            s+=Ejercicio5.strContarCaracteres(caracter, y)+"\n";
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int x, y;
        char caracter;
        System.out.println("Escribe un caracter: ");
        caracter=teclado.nextLine().charAt(0);
        System.out.print("Filas: ");
        x=Integer.parseInt(teclado.nextLine());
        System.out.println("Columnas: ");
        y=Integer.parseInt(teclado.nextLine());
        contarCaracteresMatriz(caracter, x, y);
        teclado.close();
        System.out.println();
        System.out.println(strContarCaracteresMatriz(caracter, x, y));

    }
}
