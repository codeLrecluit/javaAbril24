// Elaborado por Cristian Gustavo González Gómez.
// Ejercicio 1. Programa un algoritmo que realice la tabla de multiplicar del 12.
package com;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		int x = 12;
		int multi = 0;
		System.out.println("Tabla de multiplicar del 12: \n");
		for(int i = 1; i<=10; i++) {
			multi = i * x;
			System.out.println(i + " x " + "12 = " + multi);
		}
		System.out.println("Gracias por utilizar mi programa...");
	}
}
