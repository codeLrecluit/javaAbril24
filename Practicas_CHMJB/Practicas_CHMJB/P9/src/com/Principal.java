package com;
import java.util.Scanner;
public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int numero2 = scanner.nextInt();

	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        System.out.println("Los números pares entre " + menor + " y " + mayor + " son:");
	        for (int i = menor; i <= mayor; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	    }
	}
