package com;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		  System.out.println("Ingrese la palabra o frase");
		    String palabra= scanner.nextLine();
 
		   //Eliminar espacios y convertir a minúsculas
		    
		      String palabraSinEspacios= palabra.replaceAll("\\s" , " ").toLowerCase();
		    //Invertir Cadena
		         String palabraInvertida = new StringBuilder(palabraSinEspacios).reverse().toString();
		    // Comparacion de Cadenas original con invertida(sera insesnible a mayus o minius)
		         
		           if(palabraSinEspacios.equalsIgnoreCase(palabraInvertida)) {
		        	   
		        	   System.out.println("La Palabra o Frase es un Palíndromo");
		        	   
		           }else {
		        	   System.out.println("Lapalabra o Frase no es un Palíndromo");
		           }
	}
}
