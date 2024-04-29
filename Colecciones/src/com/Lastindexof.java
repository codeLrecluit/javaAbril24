package com;

public class Lastindexof {
	public static void main(String[] args) {
		
		String texto = "Hola mundo, bienvenido al mundo de Java";

        // Índice de la última aparición de "mundo"
        int ultimoIndiceMundo = texto.lastIndexOf("mundo");
        System.out.println("Última aparición de 'mundo': " + ultimoIndiceMundo); // Imprime 26

        // Índice de la última aparición de "Java"
        int ultimoIndiceJava = texto.lastIndexOf("Java");
        System.out.println("Última aparición de 'Java': " + ultimoIndiceJava); // Imprime 35

        // Índice de una subcadena que no existe
        int ultimoIndicePython = texto.lastIndexOf("Python");
        System.out.println("Última aparición de 'Python': " + ultimoIndicePython); // Imprime -1
		
	}

}
