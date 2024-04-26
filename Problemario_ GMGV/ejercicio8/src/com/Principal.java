package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		int num1= dato.nextInt();
		System.out.println("Ingresa el segundo numero");
		int num2= dato.nextInt();
		
		int mayor, menor;
		
		if(num1<num2) {
			mayor=num2;
			menor=num1;
			System.out.println("Numeros ordenados: "+menor+","+mayor);
		}else if(num2<num1) {
			mayor=num1;
			menor=num2;
			System.out.println("Numeros ordenados: "+menor+","+mayor);
		}else {
			System.out.println("Ambos numeros son iguales");
		}
			
		
		
	}

}
