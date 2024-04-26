package com;
import java.util.Scanner;
public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sumaEdades = 0;
	        int contadorEdades = 0;

	        System.out.println("Ingrese las edades de las personas (Ingrese -1 para finalizar):");

	        while (true) {
	            System.out.print("Edad: ");
	            int edad = scanner.nextInt();

	            if (edad == -1) {
	                break;
	            }

	            sumaEdades += edad;
	            contadorEdades++;

	            double promedio = (double) sumaEdades / contadorEdades;

	            if (promedio > 25) {
	                break;
	            }
	        }

	        System.out.println("El promedio de las edades es superior a 25.");
	        System.out.println("Suma de las edades: " + sumaEdades);
	        System.out.println("Cantidad de edades ingresadas: " + contadorEdades);
	    }
	}
