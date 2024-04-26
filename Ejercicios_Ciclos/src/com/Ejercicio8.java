package com;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		Double a,b;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el 1er Numero: ");
		a = s.nextDouble();
		
		System.out.println("Ingrese el 2do Numero: ");
		b = s.nextDouble();
		
		if(a>b) {
			System.out.println("numero menor a mayor: "+"\n"+b+"\n"+a);
		}
		else {
			System.out.println("numero menor a mayor: "+"\n"+a+"\n"+b);
		}
		
				
	}

}
