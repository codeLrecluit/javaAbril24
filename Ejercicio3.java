package com;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String palabra;
		palabra = sc.next().toLowerCase().replaceAll(" ", "");
		int largoPalabra = palabra.length(); 
		int finPalabra = palabra.length();
		for (int i = 0; i < largoPalabra; i++) {
			char caracterInicial = palabra.charAt(i);
			char caracterFinal = palabra.charAt(finPalabra-1);
			
			if (caracterInicial==caracterFinal) {
				if (i==largoPalabra-1) {
					System.out.println("Es palindromo");
					break;
				}
			}
			else {
				System.out.println("No es palindromo");
				break;
			}
			
			finPalabra--;

		}
		
	}
}
