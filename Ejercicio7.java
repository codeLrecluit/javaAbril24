package com;

public class Ejercicio7 {
	public static void main(String[] args) {
		int i=0;
		double total=700;
		double interes=0.02;
		for (; total <= 1500; ) {
			total=(total*interes)+total;
			i++;
		}
		System.out.println("El total es: "+total+" En # meses "+i);
		
	}
}
