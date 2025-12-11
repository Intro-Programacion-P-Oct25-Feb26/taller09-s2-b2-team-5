/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejercicio {
    public static void main(String[] args) {
    int m;
    int contador = 0;
    String[] marcas;
    String marca;
    String primeraLetra;
    Scanner entrada = new Scanner(System.in);
    System.out.println("¿Cuantas marcas desea ingresar?");
     m = entrada.nextInt();
    entrada.nextLine();
    marcas = new String[m];
    while (contador < m) {
        System.out.println("Ingrese una marca de vehículo");
        marca = entrada.nextLine();
        primeraLetra = marca.substring(0,1).toUpperCase();
        switch (primeraLetra){
                case "A":
                case "C":
                case "T":
                    System.out.println(" Marca no registrada");
                    break;
                default:
                    marcas[contador] = marca;
                    contador++;
                    System.out.println("Marca registrada.");
            }
        }

        System.out.println("\nMarcas registradas");
       for (int i = 0; i < marcas.length; i++) {
    System.out.println(marcas[i]);
}
        }
    }


