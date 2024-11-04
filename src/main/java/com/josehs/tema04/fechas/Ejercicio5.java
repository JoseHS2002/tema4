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
        long x=225000000000L;
        long v=0L;
        long t=x/v;
        long ss;
        long mm, HH, d;
        long FechaLlegada;

        System.out.println("Dime la velocidad: ");
        v=teclado.nextLong();
        long kmH=(v*3600)/1000;
        System.out.println("Velocidad"+kmH+" ;Tiempo estimado: "+d);
        LocalDate FechaSalida=LocalDate.now();
        LocalTime HoraSalida=LocalTime.now();
        mm=t/60;
        ss=t%60;
        HH=mm/60;
        mm=mm%60;
        d=HH/24;
        HH=HH%24;
        FechaLlegada=FechaSalida.plusDays(d);
        LocalTime HoraLlegada=LocalTime.of(HH,mm,ss);
        System.out.println("Fecha de salida: "+FechaSalida);
        System.out.println("Hora de salida: "+HoraSalida);
        System.out.println("Fecha de llegada: "+FechaLlegada);
        System.out.println("Hora de llegada: "+HoraLlegada);

    }
}
