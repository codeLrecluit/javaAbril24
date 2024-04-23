package com;
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double edades,suma = 0;
		double promedio=0;
		
		System.out.println("Introduce las edades ");
		for (int i = 1; promedio < 25; i++) {
			edades = sc.nextInt();
			suma+=edades;
			promedio=suma/i;
			System.out.println(promedio);
		}
		
	}
}
