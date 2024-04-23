package com;

import java.util.Scanner;

public class Problema9 {

	public static void main(String[] args) {
		/*
		 * 9. Programa Java que lea dos números y 
		 * muestre los números pares entre ellos
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
			if(i%2==0) {
				System.out.println(i);
			}
			
			
		}
	}

}
