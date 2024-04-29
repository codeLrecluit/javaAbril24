package com;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el 1er Numero: ");
		a = s.nextInt();
		
		System.out.println("Ingrese el 2do Numero: ");
		b = s.nextInt();
		
		if(a%2==0 && b%2==0) {
			System.out.println("numero(s) par: "+"\n"+a+"\n"+b);
			
		}else if(a%2==0){
			System.out.println("numero(s) par: "+a);
			
		}else if(b%2==0) {
			System.out.println("numero(s) par: "+b);
		}
		
	}

}
