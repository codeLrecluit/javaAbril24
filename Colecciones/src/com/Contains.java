package com;

public class Contains {
	
	public static void main(String[] args) {
		
		//Contains: se usa para determinar si el objeto especificado existe dentro de la colección. Retorna true si la colección contiene el elemento especificado, de lo contrario retorna false.
		
		String mensaje = "Hola mundo";

        // Comprobar si el string contiene "mundo"
        boolean contieneMundo = mensaje.contains("mundo");
        System.out.println("¿Contiene 'mundo'? " + contieneMundo); // Imprime true

        // Comprobar si el string contiene "Hola"
        boolean contieneHola = mensaje.contains("Hola");
        System.out.println("¿Contiene 'Hola'? " + contieneHola); // Imprime true

        // Comprobar si el string contiene "adios"
        boolean contieneAdios = mensaje.contains("adios");
        System.out.println("¿Contiene 'adios'? " + contieneAdios); // Imprime false
		
	}

}
