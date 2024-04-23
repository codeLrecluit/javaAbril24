// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 3. Realiza un programa para determinar si un String es palíndromo.

package com;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un texto por favor: ");
        String texto = scanner.nextLine().toLowerCase(); // Convertimos el texto a minúsculas para ignorar mayúsculas
        
        // Eliminamos puntos, comas y espacios en blanco de la cadena
        texto = texto.replaceAll("[.,\\s]", "");
        
        // Variable para almacenar el texto invertido
        String textoInvertido = "";
        
        // Índice para recorrer el texto de forma inversa
        int i = texto.length() - 1;
        
        // Construimos el texto invertido
        while (i >= 0) {
            textoInvertido += texto.charAt(i);
            i--;
        }
        
        // Comparamos el texto con su inverso...
        if (texto.equals(textoInvertido)) {
            System.out.println(textoInvertido + " El texto. Es un palíndromo");
        } else {
            System.out.println(textoInvertido + " El texto. NO es un palíndromo");
        }
        
        scanner.close();
    }

}
