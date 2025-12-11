/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ventas = new int[5];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String mensajeFinal = "";

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Ingrese ventas del dia " + dias[i] + ":\n");
            ventas[i] = entrada.nextInt();
        }
        mensajeFinal = String.format("%sREPORTE SEMANAL\n",
                mensajeFinal);
        for (int i = 0; i < dias.length; i++) {
            mensajeFinal = String.format("%s-%s: $%s\n",
                    mensajeFinal,
                    dias[i],
                    ventas[i]);
        }
        System.out.print(mensajeFinal);
    }
}

