package com;

import java.util.Scanner;

public class Principal {
	
	 public static boolean esPalindromo(String str) {
	        // Eliminar espacios y convertir todo a minúsculas para hacer la comparación más sencilla
	        String texto = str.replaceAll("\\s+", "").toLowerCase();
	        int longitud = texto.length();
	        
	        // Iterar hasta la mitad del texto para comparar caracteres desde el inicio y el final
	        for (int i = 0; i < longitud / 2; i++) {
	            if (texto.charAt(i) != texto.charAt(longitud - i - 1)) {
	                return false; // Si se encuentran caracteres diferentes, no es un palíndromo
	            }
	        }
	        return true; // Si no encontramos diferencias, es un palíndromo
	    }
	 


	 public static void main(String[] args) {
		 
		 Scanner obj = new Scanner(System.in);
		 
		 System.out.println("Ingresa una frase");
		 
		 String texto = obj.nextLine();
		 
		// Eliminar espacios, comas y puntos
	     String cleanStr = texto.replaceAll("[ ,.]", "");
		 
		 
		 if (esPalindromo(cleanStr)) {
			 System.out.println("El texto: '" + texto + "' es un palíndromo.");
		 } else {
			 System.out.println("El texto: '" + texto + "' no es un palíndromo.");
		 }
	 }

}
