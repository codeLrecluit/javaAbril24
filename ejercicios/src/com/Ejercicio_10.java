// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 10. Programa que lea 20 números e indique si son positivos o negativos y pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.

package com;

import java.util.Scanner;

public class Ejercicio_10 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumeros = 20;
        int[] numeros = new int[totalNumeros];

        for (int i = 0; i < totalNumeros; i++) {
            System.out.println("Introduce un valor " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int sumaPos = 0;
        int sumaImp = 0;

        // Analizar cada valor ingresado
        for (int numero : numeros) {
            // Positivos o negativos
            if (numero > 0) {
                System.out.println(numero + " Es numero positivo");
                sumaPos += numero;
            } else if (numero < 0) {
                System.out.println(numero + " Es numero negativo");
            } else {
                System.out.println(numero + " Es el numero 0");
            }

            // Numeros pares o impares
            if (numero % 2 == 0) {
                System.out.println(numero + " Es numero par");
            } else {
                System.out.println(numero + " Es numero impar");
                sumaImp += numero;
            }
        }
        System.out.println("Sumatoria de números positivos: " + sumaPos);
        System.out.println("Sumatoria de números impares: " + sumaImp);

        sc.close();
    }

}
