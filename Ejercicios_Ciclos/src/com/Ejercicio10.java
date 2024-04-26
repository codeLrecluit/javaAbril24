package com;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner( System.in );
		
		int i, t[];
		t = new int[20];
		
		for (i=0;i<5;i++){
		System.out.print("Introduzca numero: ");
		t[i]=s.nextInt();
		
		if(t[i]>=0) {
			System.out.println("El numero: " + t[i] +" Es positivo");
			double r=0;
			r = r+t[i] ;
			System.out.println(r);
		}else {
			System.out.println("El numero: " + t[i] +" Es negativo");	
		}
		
		if(t[i]%2==0) {
			System.out.println("El numero: " + t[i] + " Es par");
		}else {
			System.out.println("El numero: " + t[i] + " Es impar");
		}
		
		
	}
		
		System.out.println("El resultado es:");
		
		
		for (i=0;i<=4;i++){
		//System.out.println (r); // mostramos el i-ésimo número por el principio
		//System.out.println(t[9-i]); // y el i-ésimo por el final
		 }
		
	}

}
