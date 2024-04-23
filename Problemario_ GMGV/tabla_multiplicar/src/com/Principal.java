package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner num_tabla = new Scanner(System.in);
		Scanner num_deseado = new Scanner(System.in);
		
		int x=0;
		int y=0;
		
		int i=1;
		
		System.out.println("Ingrese el numero de la tabla");
		x=num_tabla.nextInt();
		System.out.println("Ingrese hasta que numero desea multiplicar");
		y=num_deseado.nextInt();
		
//		for(int i=1; i<=y; i++) {
//			System.out.println(x+" X "+i+" = "+(x*i));
//		}
		
//		while(i<=y) {
//			System.out.println(x+" X "+i+" = "+(x*i));
//			i++;
//		}
		
		do {
			System.out.println(x+" X "+i+" = "+(x*i));
			i++;
		}while(i<=y);
	}

}
