package com.josehs.tema04.metodos;

import java.util.Random;

public class Ejercicio11 {
    public static void quiniela(){
        int p;
        Random aleatorio= new Random();
        for (int i = 0; i <=15 ; i++) {
            p= aleatorio.nextInt(0,3);
            switch (p){
                case 0-> System.out.println("Partido x: "+i );
                case 1-> System.out.println("Partido local: "+i );
                case 2-> System.out.println("Partido visitante: "+i );
            }
            return i;
        }
        public static void main(String[] args) {
            System.out.println("");

            quiniela(i);

        }
}
