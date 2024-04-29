package com;

public class Principal {
	
	public static void main(String[] args) {
		
		int tabla = 12;
		
		int i=1;
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(tabla+" X "+i+" = "+(tabla*i));
//		}
		
//		while(i<=10) {
//			System.out.println(tabla+" X "+i+" = "+(tabla*i));
//			i++;
//		}
		
		do {
			System.out.println(tabla+" X "+i+" = "+(tabla*i));	
			i++;
		}while(i<=10);
	}

}
