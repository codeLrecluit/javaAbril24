package com;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		int num1= dato.nextInt();
		System.out.println("Ingresa el segundo numero");
		int num2= dato.nextInt();	
		
		
		 if (num1 % 2 == 0 && num2 % 2 == 0) { // Verificar si ambos números son pares
	            System.out.println("Los dos numeros son pares: " + num1+","+ num2);
	        } else if (num1 % 2 == 0) { // Verificar si solo el primer número es par
	            System.out.println("Solo el primer numero es par: " + num1);
	        } else if (num2 % 2 == 0) { // Verificar si solo el segundo número es par
	            System.out.println("Solo el segundo numero es par: " + num2);
	        } else { // Si ninguno de los números es par
	            System.out.println("Ningun numero es par");
	        }
	        
	        dato.close();
		
		
	}

}
