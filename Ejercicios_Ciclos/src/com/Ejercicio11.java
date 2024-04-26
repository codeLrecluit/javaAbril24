package com;

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Integer ancho, alto;
		
		System.out.println("Ingresa el ancho del cuadrado:");
		ancho = sc.nextInt();
		
		//System.out.println("Ingresa el alto del cuadrado:");
		//alto = sc.nextInt();
		
		for (int i = 0; i < ancho; i++) {
			for (int columna = 1; columna <= ancho ; columna++)
				System.out.print("*");
			
			System.out.println();
			
		}
		
			
	}
}
