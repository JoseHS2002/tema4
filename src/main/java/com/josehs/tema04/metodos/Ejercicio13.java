package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio13 {
    /*
     * @param
     * @return
     * @author
     * @version
     * @since
     * @throws
     * @see
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i;
        int n;
        System.out.println("Elige un idioma: 1=valenciano; 2=castellano; 3=ingles");
        i= teclado.nextInt();
        System.out.println("Dime un nombre: ");
        n= teclado.nextInt();
        if (i==1){
            System.out.println("Bon dia "+n);
        } else if (i==2) {
            System.out.println("Buenos dias "+n);
        } else if (i==3) {
            System.out.println("Good morning "+n);
        }
    }
}

