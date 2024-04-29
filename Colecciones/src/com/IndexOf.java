package com;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {
	public static void main(String[] args) {
		
		// IndeOf:  se utiliza con strings para encontrar el índice de la primera aparición de una subcadena o un carácter específico. Si la subcadena o el carácter no se encuentran en el string, el método retorna -1.
		String texto = "Hola mundo, bienvenido al mundo de Java";

        // Índice de la primera aparición de "mundo"
        int indiceMundo = texto.indexOf("mundo");
        System.out.println("Primera aparición de 'mundo': " + indiceMundo); // Imprime 5

        // Índice de la primera aparición de "Java"
        int indiceJava = texto.indexOf("Java");
        System.out.println("Primera aparición de 'Java': " + indiceJava); // Imprime 37

        // Índice de una subcadena que no existe
        int indicePython = texto.indexOf("Python");
        System.out.println("Primera aparición de 'Python': " + indicePython); // Imprime -1
        
        List<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("cereza");
        frutas.add("banana");

        // Índice de la primera aparición de "banana"
        int indiceBanana = frutas.indexOf("banana");
        System.out.println("Primera aparición de 'banana': " + indiceBanana); // Imprime 1

        // Índice de un elemento que no existe
        int indiceMango = frutas.indexOf("mango");
        System.out.println("Primera aparición de 'mango': " + indiceMango); // Imprime -1
    
	}

}
