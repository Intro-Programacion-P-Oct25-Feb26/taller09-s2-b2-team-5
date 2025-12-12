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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        double media;
        int arriba = 0;
        int abajo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        media = 1.0 * suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arriba++;
            } else if (arreglo[i] < media) {
                abajo++;
            }
        }
        System.out.printf("Media aritmética: %.2f Arriba: %d Abajo: %d%n", media, arriba, abajo);
    }
}




