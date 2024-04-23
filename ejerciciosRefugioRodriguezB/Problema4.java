package com;

import java.util.Scanner;



public class Problema4 {

	public static void main(String[] args) {
		/*
		 * 4.Programa que reciba una frase y 
		 * una letra por teclado. Deberá retornar 
		 * como resultado cuántas veces existe esa 
		 * letra dentro de la frase. Si no existe,
		 *  imprimir un mensaje “Carácter no encontrado”.
		 * */
		Scanner sc = new Scanner(System.in);
		String frase;
		Character letra;
		int numeroOcurenciasLetra = 0;
		
		System.out.println("Ingresa la frase: ");
		frase = sc.nextLine().toLowerCase();
		System.out.println("Ingresa la letra: ");
		letra = sc.next().charAt(0);
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)==Character.toLowerCase(letra)) {
				numeroOcurenciasLetra++;
			}
		}
		if(numeroOcurenciasLetra==0) {
			System.out.println("Carácter no encontrado");
		}else {
			System.out.println("La letra "+letra+" aparece "+numeroOcurenciasLetra+" en la frase "+frase);
			
		}

	}

}
