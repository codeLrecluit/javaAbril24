package com;

public class Ejercicio6 {
	public static void main(String[] args) {
		double total=1000;
		double interes=0.02;
		for (int i = 1; i <= 12; i++) {
			total=(total*interes)+total;
			System.out.println(total);
		}
		
	}
}
