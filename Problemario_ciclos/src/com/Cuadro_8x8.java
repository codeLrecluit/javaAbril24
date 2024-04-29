package com;

import java.util.Scanner;

public class Cuadro_8x8 {
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Pedir al usuario el ancho y el alto del cuadrado
			System.out.println("Introduce el ancho del cuadrado:");
			int ancho = scanner.nextInt();
			System.out.println("Introduce el alto del cuadrado:");
			int alto = scanner.nextInt();

			// Dibujar el cuadrado
			for (int i = 0; i < alto; i++) {
			    for (int j = 0; j < ancho; j++) {
			        // Imprimir asterisco en los bordes y espacios en el interior
			        if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
			            System.out.print("*");
			        } else {
			            System.out.print(" ");
			        }
			    }
			    System.out.println(); // Saltar a la siguiente línea después de cada fila
			}
		}
    }
}




    
