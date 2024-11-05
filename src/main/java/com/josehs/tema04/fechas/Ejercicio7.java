package com.josehs.tema04.fechas;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio7 {
    public static void main(String[] args) {
        LocalDate hoy=LocalDate.now();
        System.out.println("*********************************\n" + "*** FECHA CALCULADA: "+hoy+" ***\n" + "*********************************");
        System.out.println("1. Modificar fecha calculada");
        System.out.println("2. Operaciones");
        System.out.println("------------------------------------------");
        System.out.println("0. Salir del programa");



    }

    public static int modificarFecha(){
        LocalDate fecha=LocalDate.of(y, m, d);
        return fecha;
    }
    public static int operacion(){
        System.out.println("**********************************\n" + "*** OPERACIONES ***\n" + "*** FECHA CALCULADA: 25/10/2024 ***\n" + "**********************************\n");
        System.out.println("1. Sumar años\n" + "2. Sumar meses\n" + "3. Sumar días\n" + "4. Restar años\n" + "5. Restar meses\n" + "6. Restar días");
        System.out.println("-----------------------");
        System.out.println("0. Volver al menú principal");
        int getYear(y);
        Month getMonth(m);
        int getDayOfMonth(d);

    }


}
