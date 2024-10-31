package com.josehs.tema04.fechas;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio4 {

    public enum Zodiaco{
        ACUARIO,PISCIS,ARIES,TAURO,GEMINIS,CANCER,LEO,VIRGO,LIBRA,ESCORPIO,OFIUCO,SAGITARIO,CAPRICORNIO
    }

    public static int calcularZodiaco(LocalDate fechaNacimiento) {
        int day = fechaNacimiento.getDayOfMonth();
        int month = fechaNacimiento.getMonth();
        MonthDay monthDay = MonthDay.of(month, day);

        if (day > 17 && month == 2 || day < 12 && month == 3){
            return Zodiaco.ACUARIO;
        } else if (day > 11 && month == 3 || day <17 && month == 4){
            return Zodiaco.PISCIS;
        } else if (day > 16 && month == 4 || day <15 && month == 5){
            return Zodiaco.ARIES;
        } else if (day > 14 && month == 5 || day <22 && month == 6){
            return Zodiaco.TAURO;
        } else if (day > 21 && month == 6 || day <20 && month == 7){
            return Zodiaco.GEMINIS;
        } else if (day > 19 && month == 7 || day <11 && month == 8){
            return Zodiaco.CANCER;
        } else if (day > 10 && month == 8 || day <17 && month == 9){
            return Zodiaco.LEO;
        } else if (day > 16 && month == 9 || day <31 && month == 10){
            return Zodiaco.VIRGO;
        } else if (day > 30 && month == 10 || day <23 && month == 11){
            return Zodiaco.LIBRA;
        } else if (day > 22 && month == 11 || day <29 && month == 11) {
            return Zodiaco.ESCORPIO;
        } else if (day > 28 && month == 11 || day <18 && month == 12{
            return Zodiaco.OFIUCO;
        } else if (day > 17 && month == 12    || day < 21 && month == 1){
            return Zodiaco.SAGITARIO;
        } else if (day > 20 && month == 1 || day <16 && month == 2){
            return Zodiaco.CAPRICORNIO;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaStr=scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Tienes %d años\n", calcularZodiaco(fechaNacimiento));

        Zodiaco resultado = calcularZodiaco(fechaNacimiento);
        System.out.println("Tu signo del zodiaco es " + resultado);
    }
}
