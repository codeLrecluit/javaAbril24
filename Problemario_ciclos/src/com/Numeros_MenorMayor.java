package com;

import java.util.Scanner;

public class Numeros_MenorMayor {
 public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Pedir al usuario que ingrese dos números
			System.out.println("Introduce el primer número:");
			int num1 = scanner.nextInt();
			System.out.println("Introduce el segundo número:");
			int num2 = scanner.nextInt();

			// Encontrar el menor y el mayor de los dos números
			int menor = Math.min(num1, num2);
			int mayor = Math.max(num1, num2);

			// Mostrar los números desde el menor hasta el mayor
			System.out.println("Los números desde el menor hasta el mayor son:");
			for (int i = menor; i <= mayor; i++) {
			    System.out.print(i + " ");
			}
		}
    }
}



   
