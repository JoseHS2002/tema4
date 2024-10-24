package com.josehs.tema04.lib;

//import java.util.Scanner;

public class IO {
    //private static Scanner scanner = new Scanner()
    /**
     * Solicita un texto y valida su longitud este comprendido entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrara al usuario
     * @param longitudMinima Numero minimo de caracteres que debe tener el texto
     * @param longitudMaxima Numero maximo de caracteres que debe tener el texto
     * @return El texto leido valido
     */

    /*
    String solicitarString(String mensaje, int longitudMinima, int longitudMaxima) {
        String nombre=solicitarString("Dime tu nombre", 2, 30);
        String mensajeLeido;
        boolean valido;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(mensaje);
            mensajeLeido=teclado.nextLine();
            valido=mensajeLeido.length()>= longitudMinima && mensajeLeido.length() <= longitudMaxima;
        } while (!valido);
        teclado.close();
        return mensajeLeido;

        public static int solicitarEntero(String mensaje, int valorMinimo, int valorMaximo){
            int valorLeido;
            boolean valido;
            do {
                System.out.println(mensaje);
                valorLeido= Integer.parseInt(scanner.nextLine());
                valido=valido=valorLeido >= valorMinimo && valorLeido <= valorMaximo;
                if (!valido){
                    System.err.println("El mensaje debe estar comprendido entre [%d - %d]\n", valorMinimo, valorMaximo);
                } while (!valido);
                return valorLeido;
            }
        }

     */

        /*
        import com.josehs.tema04.lib.IO;
        String nombreProducto = IO.solicitarString("Indica el nombre del producto: ", 2, 30);
        System.out.println(nombreProducto);

         */


}
