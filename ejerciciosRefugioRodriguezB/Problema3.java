package com;

import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
		/*
		 * 3. Realiza un programa para determinar
		 *  si un String es palíndromo.
		 * */
		Scanner sc = new Scanner(System.in);
		String palabraOriginal;
		String palabraInvertida="";
	
		System.out.println("Ingresa palabra: ");
		palabraOriginal = sc.nextLine();
		palabraOriginal = palabraOriginal.replaceAll(",", "");
		palabraOriginal = palabraOriginal.replaceAll(" ", "");
		
		for (int i = palabraOriginal.length()-1; i >=0 ; i--) {
				palabraInvertida += palabraOriginal.charAt(i);
		}
		if(palabraOriginal.equalsIgnoreCase(palabraInvertida)) {
			System.out.println("La palabra "+palabraOriginal+" es palindromo ");
		}else {
			System.out.println("La palabra "+palabraOriginal+" no es palindromo ");
			
		}
		
		
		
	}

}
