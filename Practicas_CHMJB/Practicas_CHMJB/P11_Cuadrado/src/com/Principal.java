package com;
import java.util.Scanner;
public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el ancho del cuadrado: ");
	        int ancho = scanner.nextInt();

	        System.out.print("Ingrese el alto del cuadrado: ");
	        int alto = scanner.nextInt();

	        for (int i = 0; i < alto; i++) {
	            for (int j = 0; j < ancho; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}