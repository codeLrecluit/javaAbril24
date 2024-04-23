// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 2. Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
// 23 x 95 = ???;

package com;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Introduce un número base para multiplicar: ");
        n1 = sc.nextInt();

        System.out.println("Introduce hasta que número desea que termine el programa: ");
        n2 = sc.nextInt();
        
        System.out.println("Tabla de multiplicar del número: " + n1);

        for (int i = 1; i <= n2; i++) {
            int resultado = n1 * i;
            System.out.println(n1 + " x " + i + " = " + resultado);
        }
        System.out.println("Gracias por utlizar mi programa...");
        sc.close();
    }
}
