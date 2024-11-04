package com.josehs.tema04.fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    /**
     * @author JoseHS autor.
     */


    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalDate nochevieja = LocalDate.of(hoy.getYear(), 12, 31);
        System.out.printf("\u001B[1B hoy \u001B[0B");

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long diasParaNochevieja = hoy.until(nochevieja, ChronoUnit.DAYS);
                System.out.printf("Faltan %d días para nochevieja\n", diasParaNochevieja);
            }
        }, 0, 1000);
    }
}
