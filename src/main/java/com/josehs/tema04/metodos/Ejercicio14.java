package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio14 {
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

        int fact1=1;
        int fact2=1;
        System.out.println("Dime el numero combinatorio n");
        int n = teclado.nextInt();
        System.out.println("Dime el numero combinatorio m");
        int m = teclado.nextInt();
        teclado.close();
        for (int i1=n;i1>0;i1--){
            fact1 *= i1;
        }
        for (int i2=m;i2>0;i2--){
            fact2 *= i2;
        }

        System.out.println("Combinatrio (n m): "+fact1/(fact2*(fact1-fact2)));
    }
}
