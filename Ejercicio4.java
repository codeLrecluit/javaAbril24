package com;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase,letra;
		System.out.println("Introduce la frase: ");
		frase = sc.next().toLowerCase().replaceAll(" ", "");
		System.out.println("Introduce la letra a buscar");
		letra = sc.next().toLowerCase();
		char letra1=letra.charAt(0);
		int contadorLetra = 0;
		for (int i = 0; i < frase.length(); i++) {
		     
			if( letra1 == frase.charAt(i)) {
				contadorLetra++;
			}
		    
		}
		if(contadorLetra != 0) {
			System.out.println("Se ha encontrado # "+contadorLetra+" veces");
		}
		else
		{
			System.out.println("No se encontro");
		}
	}
}
