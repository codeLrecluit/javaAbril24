package com;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de la tabla: ");
		x = sc.nextInt();
		System.out.println("Hasta que iteración: ");
		y = sc.nextInt();
		
		for (int i = 1; i <= y; i++) {
			System.out.println(i*x);
		}
	}
}
