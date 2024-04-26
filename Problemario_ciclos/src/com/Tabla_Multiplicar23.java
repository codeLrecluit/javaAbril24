package com;

import java.util.Scanner;

  public class Tabla_Multiplicar23 {
	  
	//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???;
	  public static void main(String[] args) {
		 
	  try (Scanner sc = new Scanner(System.in)) {
		int multi= 23;
		int resultado= 0;
		while (multi <= 95) {
			System.out.println("Ingresar un numero");
		     resultado = sc.nextInt();
		    resultado = multi* resultado;
		    System.out.println("23: "+resultado);
		}
	}
	}
}
	

