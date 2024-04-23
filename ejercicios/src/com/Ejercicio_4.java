// Elaborado por: Cristian Gustavo González Gómez 
// Ejercicio 4. Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.

package com;

import java.util.Scanner;

public class Ejercicio_4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Ingrese una frase: ");
		String frase = scanner.nextLine();
		
		System.out.println("Ingrese una letra a buscar: ");
		char caracter = scanner.nextLine().charAt(0);
		
        int cuenta = contarCaracteres(frase, caracter);
        
        // Imprimir 
        if (cuenta > 0) {
            System.out.println("El carácter '" + caracter + "' aparece " + cuenta + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
        
        scanner.close();
    }
    
    // Método para contar las ocurrencias de un carácter en una frase
    public static int contarCaracteres(String frase, char caracter) {
        int contador = 0;
        
        // Convertir todo a minúsculas para hacer la búsqueda
        frase = frase.toLowerCase();
        caracter = Character.toLowerCase(caracter);
        
        // Contar las ocurrencias del carácter
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }
        
        return contador;
		
	}

}
