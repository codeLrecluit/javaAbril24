package com;

import java.util.Scanner;

public class Frase_Retornar {
	public static int contarLetra(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese una frase: ");
			String frase = scanner.nextLine();

			System.out.print("Ingrese una letra: ");
			char letra = scanner.next().charAt(0);

			int resultado = contarLetra(frase, letra);

			if (resultado > 0) {
			    System.out.println("La letra '" + letra + "' aparece " + resultado + " veces en la frase.");
			} else {
			    System.out.println("Carácter no encontrado.");
			}
		}
    }
}
