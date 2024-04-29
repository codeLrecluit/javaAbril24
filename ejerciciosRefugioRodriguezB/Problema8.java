package com;

import java.util.Scanner;

public class Problema8 {

	public static void main(String[] args) {
		
		/*
		 * 8. Programa Java que lea dos números
		 *  y muestre los números desde el menor
		 *   hasta el mayor
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		int numero1 = sc.nextInt();
		System.out.println("Ingresa el segundo número: ");
		int numero2 = sc.nextInt();
		int menor,mayor;
		if(numero1<numero2) {
			menor=numero1;
			mayor=numero2;
		}else {
			menor=numero2;
			mayor=numero1;
		}
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
			
		}
		

	}

}
