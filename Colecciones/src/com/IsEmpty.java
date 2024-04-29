package com;

public class IsEmpty {
	public static void main(String[] args) {
		//Método isEmpty: es utilizado frecuentemente para verificar si una colección, un string o cualquier contenedor de datos está vacío, es decir, no contiene elementos. Este método es útil porque proporciona una manera simple y legible de chequear si necesitas añadir elementos a una colección o realizar operaciones sobre elementos que podrían no existir, evitando así errores como NullPointerException.
		String textoVacio = "";
        String textoLleno = "Hola";

        // Verificar si el texto está vacío
        System.out.println("¿'textoVacio' está vacío? " + textoVacio.isEmpty()); // Imprime true
        System.out.println("¿'textoLleno' está vacío? " + textoLleno.isEmpty()); // Imprime false

	}
}




