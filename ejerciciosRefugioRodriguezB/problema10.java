package com;

import java.util.Scanner;

public class problema10 {

	public static void main(String[] args) {
		/*
		 * 10. Programa que lea 20 números e 
		 * indique si son positivos o negativos y
		 *  pares o impares y ademas muestre la 
		 *  sumatoria de los positivos y sumatoria
		 *   de los impares.*/
		Scanner sc = new Scanner(System.in);
		int numero;
		int sumaPositivos=0;
		int sumaImpares=0;
		
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Ingresa un número: ");
			numero = sc.nextInt();
			if(numero>0) sumaPositivos+=numero;
			if(numero%2!=0) sumaImpares+=numero;
			
			if(numero>0 && numero%2==0) {
				System.out.println("El número: "+numero+" es positivo y es par");
			}else if(numero<0 && numero%2!=0) {
				System.out.println("El número: "+numero+" es negativo y es impar");
			}else if(numero<0 && numero%2==0) {
				System.out.println("El número: "+numero+" es negativo y es par");
			}else if(numero>0 && numero%2!=0) {
				System.out.println("El número: "+numero+" es positivo y es impar");
			}
		}
		System.out.println("suma positivos "+sumaPositivos);
		System.out.println("suma impares "+sumaImpares);

	}

}
