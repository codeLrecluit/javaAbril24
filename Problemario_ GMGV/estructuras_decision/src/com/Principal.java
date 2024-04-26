package com;

public class Principal {
	
	public static void main(String[] args) {
		
		String x= "Hola java desde mi casa";
//		System.out.println(x.length()<100);
		
//		if(x.length()<100) {
//			System.out.println("OK");
//		}
		
		
//		if(x.length()<10 && x.equals("Hola java desde mi casa")) {
//			System.out.println("OK");
//		}else {
//			System.out.println("NO");
//		}
		
		if(x.length()<10 || x.equals("Hola java desde mi casa")) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
	}

}
