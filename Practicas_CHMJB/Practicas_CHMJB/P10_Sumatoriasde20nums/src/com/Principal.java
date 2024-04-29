package com;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumatoriaPositivos = 0;
        int sumatoriaImpares = 0;

        System.out.println("Ingrese 20 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Resultados:");

        for (int numero : numeros) {
            if (numero > 0) {
                System.out.println(numero + " es positivo");
                sumatoriaPositivos += numero;
            } else if (numero < 0) {
                System.out.println(numero + " es negativo");
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
                sumatoriaImpares += numero;
            }
        }

        System.out.println("Sumatoria de los números positivos: " + sumatoriaPositivos);
        System.out.println("Sumatoria de los números impares: " + sumatoriaImpares);
    }
}
