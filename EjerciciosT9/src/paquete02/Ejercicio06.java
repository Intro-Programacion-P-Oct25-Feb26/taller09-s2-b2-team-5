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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        String [] productos = {"Cafe tradicional", "Cafe frances", "Cafe aleman"};
        double[] precios = {1.5, 2.1, 2.3};
        int[] tazasCompradas = {0, 0, 0};     
        double[] subtotal = {0, 0, 0};        
        double totalGeneral = 0;
        boolean bandera = true;

        while (bandera) {

            System.out.printf("Seleccione el cafe a comprar:\n1) Cafe tradicional\n"
                    + "2) Cafe frances\n3) aleman\nOpcion:");
            int opcion = entrada.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida.");
            }

            int valor = opcion - 1;
            System.out.print("¿Cuantas tazas desea comprar? ");
            int tazas = entrada.nextInt();

            tazasCompradas[valor] += tazas;
            subtotal[valor] += tazas * precios[valor];
            totalGeneral += tazas * precios[valor];

            System.out.println("¿Desea seguir comprando? (S/N): ");
            String salida = entrada.next();
            if (salida.equalsIgnoreCase("N")) {
                bandera = false;
            }
        }

        System.out.println("\nEl usuario ha comprado:\n");

        for (int i = 0; i < productos.length; i++) {
            if (tazasCompradas[i] > 0) {
                System.out.printf("  %s (%d t), valor a cancelar $%.2f\n",
                        productos[i], tazasCompradas[i], subtotal[i]);
            }
        }

        System.out.printf("\nTotal a pagar: %.2f\n", totalGeneral);
    }
}
