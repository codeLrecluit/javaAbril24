package com;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
//		Ingresar numeros hasta que la sumatoria sea igual a 250
		
		Scanner sc = new Scanner(System.in);		
		int suma = 280;
		int x = 0;
		
//		while(suma<=250){
//			System.out.println("Ingresa un numero");			
//			x=sc.nextInt();			
//			suma=suma+x;			
//			System.out.println("Acumulado: "+suma);			
//		}
		
//		do {
//			System.out.println("Ingresa un numero");			
//			x=sc.nextInt();			
//			suma=suma+x;			
//			System.out.println("Acumulado: "+suma);
//			
//		}while(suma<=250);
		
		for(int i=20; i<50; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				System.out.println("-");
			}
		}
	}

}
