// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor.

package com;

import java.util.Scanner;

public class Ejercicio_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
	
		System.out.println("Introduce el valor uno: ");
		n1 = sc.nextInt();
		
		System.out.println("Introduce el valor dos: ");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("Los numeros del menor al mayor son: ");
			System.out.println(n2);
			System.out.println(n1);
		}else {
			System.out.println("Los numeros del menor al mayor son: ");
			System.out.println(n1);
			System.out.println(n2);
		}
		sc.close();		
	}
}
