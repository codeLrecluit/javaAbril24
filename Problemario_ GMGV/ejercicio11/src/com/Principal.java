package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int ancho = 0, alto = 0;

		System.out.println("Ingrese la cantidad de alto");
		ancho = obj.nextInt();
		System.out.println("Ingrese la cantidad de ancho");
		alto = obj.nextInt();

		String[][] cuadrado = new String[ancho][alto];

		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < alto; j++) {
				cuadrado[i][j] = " * ";
			}
		}

		System.out.println("Resultado : \n");
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < alto; j++) {
				System.out.print(cuadrado[i][j] + " ");
			}
			System.out.println(); // Salto de línea después de cada fila
		}
		
		obj.close();

	}

}
