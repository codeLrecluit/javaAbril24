package com;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingresa una frase: ");
	        String frase = scanner.nextLine();
	        
	        System.out.print("Ingresa una letra: ");
	        String letra = scanner.nextLine();
	        
	        // Convertir a minúsculas
	        String fraseMinusculas = frase.toLowerCase();
	        String letraMinusculas = letra.toLowerCase();
	        
	        // Contar las ocurrencias de la letra
	        int contador = 0;
	        for (int i = 0; i < fraseMinusculas.length(); i++) {
	            if (fraseMinusculas.charAt(i) == letraMinusculas.charAt(0)) {
	                contador++;
	            }
	        }
	        
	        // Imprimir el resultado
	        if (contador > 0) {
	            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
	        } else {
	            System.out.println("Carácter no encontrado.");
	        }
	    }
	}
	

	        
	        