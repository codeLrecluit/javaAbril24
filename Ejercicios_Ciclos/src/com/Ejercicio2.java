package com;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, it;
		
		System.out.println("Ingresa un numero para multiplicar: ");
		num = sc.nextInt();
		
		System.out.println("Ingrese hasta que iteracion desea: ");
		it = sc.nextInt();
		
		System.out.println("---Tabla de multiplicar "+num+"---");
		for (int i = 1; i <= it; i++) {
			
			System.out.println(num+" * " + i + " = " + num*i);
			
		}
		
	}
}


