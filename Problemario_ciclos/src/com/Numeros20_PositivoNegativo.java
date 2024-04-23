package com;

import java.util.Scanner;

public class Numeros20_PositivoNegativo {
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int[] numeros = new int[20];
			int sumatoriaPositivos = 0;
			int sumatoriaImpares = 0;

			// Leer 20 números
			for (int i = 0; i < 20; i++) {
			    System.out.println("Introduce el número " + (i + 1) + ":");
			    numeros[i] = scanner.nextInt();

			    // Analizar si es positivo o negativo
			    if (numeros[i] > 0) {
			        System.out.println("El número " + numeros[i] + " es positivo.");
			        sumatoriaPositivos += numeros[i];
			    } else if (numeros[i] < 0) {
			        System.out.println("El número " + numeros[i] + " es negativo.");
			    } else {
			        System.out.println("El número " + numeros[i] + " es cero.");
			    }

			    // Analizar si es par o impar
			    if (numeros[i] % 2 == 0) {
			        System.out.println("El número " + numeros[i] + " es par.");
			    } else {
			        System.out.println("El número " + numeros[i] + " es impar.");
			        sumatoriaImpares += numeros[i];
			    }
			}

			// Mostrar sumatoria de positivos y sumatoria de impares
			System.out.println("La sumatoria de los números positivos es: " + sumatoriaPositivos);
			System.out.println("La sumatoria de los números impares es: " + sumatoriaImpares);
		}
    }
}


    