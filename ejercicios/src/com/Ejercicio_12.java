// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 12. Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara cuando el promedio de las edades sea superior a 25.

package com;

import java.util.Scanner;

public class Ejercicio_12 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int cantidadEdades = 0;

        while (true) {
            System.out.println("Ingresa una edad o ingresa (-1) para finalizar:");
            int edad = scanner.nextInt();

            if (edad == -1) {
            	System.out.println("GRACIAS POR UTILIZAR MI PROGRAMA...");
                break; 
            }

            sumaEdades += edad;
            cantidadEdades++;
            
            double promedio = (double) sumaEdades / cantidadEdades;
            System.out.println("Promedio actual de edades: " + promedio);

            if (promedio > 25) {
                System.out.println("El promedio actual de las edades, es superior a 25. GRACIAS POR UTILIZAR MI PROGRAMA...");
                break;
            }
        }
        scanner.close();
    }
}
