package com.josehs.tema04.fechas;

import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalDate;

public class Ejercicio5 {
    //Fecha y hora de salida en formato dd/MM/yyyy HH:mm:ss
    //Velocidad de la nave en Km/h
    //Distancia 225,000,000 km
    //Tiempo de viaje en horas y dias
    //Calcular fecha de llegada sumando tiempo de viaje a la tierrra de salida
    //sout: Tiempo de viaje en dias, horas, minutos y segundos.
        //Fecha y hora de llegada a marte dd/MM/yyyy HH:mm:ss

    /**
    *@author JoseHS autor.
     */


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        long x=225_000_000_000L;
        long v=0L;
        long t=x/v;
        long ss;
        long mm, h, d;
        LocalDate fechaLlegada;

        System.out.println("Dime la velocidad: ");
        v=teclado.nextLong();
        long kmH=(v*3600)/1000;
        teclado.close();
        System.out.println("Velocidad"+kmH);
        LocalDate fechaSalida=LocalDate.now();
        LocalTime horaSalida=LocalTime.now();
        mm=t/60;
        ss=t%60;
        h=mm/60;
        mm=mm%60;
        d=h/24;
        h=h%24;
        fechaLlegada = fechaSalida.plusDays(d);
        LocalTime horaLlegada=LocalTime.of((int)h,(int)mm,(int)ss);
        System.out.println("Fecha de salida: "+fechaSalida);
        System.out.println("Hora de salida: "+horaSalida);
        System.out.println("Fecha de llegada: "+fechaLlegada);
        System.out.println("Hora de llegada: "+horaLlegada);

    }
}
