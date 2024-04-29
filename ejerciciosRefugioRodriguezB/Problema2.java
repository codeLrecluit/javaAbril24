package com;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		/*2.- Programa un algoritmo que
		 *  realice la tabla de multiplicar 
		 *  de un numero introducido desde 
		 *  teclado, hasta la iteración deseada 
		 *  por el usuario. Ejemplo, tabla de 23
		 *   hasta el 95.
		 *   23 x 95 = ???;
		 */
		Scanner sc = new Scanner(System.in);
		int numeroTabla;
		int finTabla;
		System.out.println("Ingresa tabla de multiplicar: ");
		numeroTabla = sc.nextInt();
		System.out.println("Ingresa hasta que número parar: ");
		finTabla = sc.nextInt();
		for (int i = 1; i <=finTabla; i++) {
			System.out.println(numeroTabla+" x "+i +" = "+numeroTabla*i);
			
		}


	}

}
