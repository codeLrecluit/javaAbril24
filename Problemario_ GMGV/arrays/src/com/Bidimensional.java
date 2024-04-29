package com;

import java.util.Arrays;
import java.util.Scanner;

public class Bidimensional {

	public static void main(String[] args) {

		int[][] matriz2 = new int[5][4];
		System.out.println(matriz2);

		int[][] matriz3 = { { 3, 4, 67 }, { 2, 5, 12 }, { 5, 7, 18 } };

		System.out.println(Arrays.deepToString(matriz3));

		// Agregar valores a la matriz

		matriz2[2][2] = 15;
		matriz2[3][0] = 80;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matriz2.length; i++) { // filas

			for (int j = 0; j < matriz2[i].length; j++) { // columnas
				System.out.println("Ingresa un valor: (" + i + ":" + j + ")");
				matriz2[i][j] = sc.nextInt();

			}

		}

		System.out.println(Arrays.deepToString(matriz2));

	}

}
