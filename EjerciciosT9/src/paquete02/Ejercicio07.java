/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        double promedio;
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }
        promedio = (double) suma / numeros.length;
        System.out.println("\nResultados:");
        for (int i = 0; i < numeros.length; i++) {
            double diferencia = numeros[i] - promedio;
            System.out.printf("Número: %d | Diferencia con el promedio: %.2f%n", numeros[i], diferencia);
        }
    }
}

         

        
       