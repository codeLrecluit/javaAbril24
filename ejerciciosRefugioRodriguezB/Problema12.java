package com;

import java.util.Scanner;

public class Problema12 {

	public static void main(String[] args) {
		/*
		 * 12.Se ingresan un conjunto de n 
		 * edades de personas por teclado. 
		 * El programa finalizara cuando el 
		 * promedio de las edades sea superior 
		 * a 25.*/
		
		Scanner sc = new Scanner(System.in);
		
		int edad;
		int cantidadPersonas = 0;
		double sumaEdades=0;
		
		double promedioEdad=0;
		while(promedioEdad<=25) {
			System.out.println("Ingresa la edad: ");
			edad = sc.nextInt();
			sumaEdades+=edad;
			cantidadPersonas++;
			promedioEdad = sumaEdades/cantidadPersonas;
			
		}
 	     System.out.println("Número de personas: " + cantidadPersonas );
	     System.out.println("El promedio de edad es: " + promedioEdad);
		
	}

}
