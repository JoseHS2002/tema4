package com.josehs.tema04.metodos;

import java.util.Scanner;

public class Ejercicio8 {
    public static boolean esCapicua(int n1, int n2, int n3, int n4){
        String palabra= String.valueOf(n1)+String.valueOf(n2)+String.valueOf(n3)+String.valueOf(n4);
        String reverse= "";

        for (int i= palabra.length()-1; i >= 0; i--){
            reverse += palabra.charAt(i);
        }
        return palabra.equals(reverse);
    }

    public static boolean esCapicua(int num){
        String palabra = String.valueOf(num);
        String reverse = "";
        for (int i = palabra.length() -1; i >= 0; i--){
            reverse += palabra.charAt(i);
        }
        return palabra.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4;
        boolean validado;
        do {
            System.out.println("Escribe el primer numero capicuo: ");
            num1 = Integer.parseInt(teclado.nextLine());
            validado = num1 >= 0;
            if (!validado) {
                System.out.println("Solo se permiten numeros positivos");
            }
        } while (!validado);
        do {
            System.out.println("Escribe el segundo numero capicuo: ");
            num2 = Integer.parseInt(teclado.nextLine());
            validado = num2 >= 0;
            if (!validado) {
                System.out.println("Solo se permiten numeros positivos");
            }
        } while (!validado);
        do {
            System.out.println("Escribe el tercer numero capicuo: ");
            num3 = Integer.parseInt(teclado.nextLine());
            validado = num3 >= 0;
            if (!validado) {
                System.out.println("Solo se permiten numeros positivos");
            }
        } while (!validado);
        do {
            System.out.println("Escribe el cuarto numero capicuo: ");
            num4 = Integer.parseInt(teclado.nextLine());
            validado = num4 >= 0;
            if (!validado) {
                System.out.println("Solo se permiten numeros positivos");
            }
        } while (!validado);

        if (esCapicua(num1, num2, num3, num4)) {
            System.out.println("La secuencia "+num1+""+num2+""+num3+""+num4+" es capicua");
        } else {
            System.out.println("La secuencia "+num1+""+num2+""+num3+""+num4+" no es capicua");
        }
        teclado.close();
    }

}
