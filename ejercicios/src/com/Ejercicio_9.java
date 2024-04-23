// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 9. Programa Java que lea dos números y muestre los números pares entre ellos

package com;

import java.util.Scanner;

public class Ejercicio_9 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer valor:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo valor:");
        int num2 = scanner.nextInt();

        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);
        
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
