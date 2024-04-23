package com;
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Dame ancho y alto");
		x=sc.nextInt();
		y=sc.nextInt();
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
