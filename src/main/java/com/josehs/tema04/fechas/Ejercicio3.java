package com.josehs.tema04.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio3 {

    public enum Planet{
        MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE
    }

    public static float calcularEdadPlaneta(LocalDate fechaNacimiento, Planet world){
        float WorldDays = switch (world){
            case MERCURY -> 87.9f;
            case VENUS -> 226.7f;
            case EARTH -> 365.25f;
            case MARS -> 687f;
            case JUPITER -> 4333f;
            case SATURN -> 10759f;
            case URANUS -> 30668f;
            case NEPTUNE -> 60182f;
        };

        long dias = Ejercicio2.calcularEdadDias(fechaNacimiento);
        return dias / WorldDays;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el planeta");
        for (int i = 0; i < Planet.values().length;i++){
            System.out.println((i+1) + "-> " + Planet.values()[i].toString());
        }
        int a = scanner.nextInt();
        Planet planet = Planet.values()[a - 1];
        System.out.println("Dime tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaStr=scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Tienes %d dias\n", calcularEdadPlaneta(fechaNacimiento, planet));


    }
}
