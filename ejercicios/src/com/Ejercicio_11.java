// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 11. Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
//Ejemplo: 8 x 8

package com;

import java.util.Scanner;

public class Ejercicio_11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el ancho del cuadrado:");
        int ancho = scanner.nextInt();

        System.out.println("Introduce el alto del cuadrado:");
        int alto = scanner.nextInt();

        matriz(ancho, alto);
        scanner.close();
    }
    public static void matriz(int ancho, int alto) {
        for (int i = 0; i < alto; i++) { 
            System.out.println("* ".repeat(ancho)); 
        }
    }
}
