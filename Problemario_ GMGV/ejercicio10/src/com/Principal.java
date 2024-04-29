package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		int veces = 20;
		int par=0, impar=0, positivo=0, negativo;
		
		
		int [] numeros = new int[veces];
		
		for(int i=0; i<veces; i++) {
			System.out.println("Ingrese numero en la posicion "+(i+1)+" : ");
			numeros[i] = obj.nextInt();
		}
		
		System.out.println("Detalle de numeros ingresados");
		
		for(int i=0; i<veces; i++) {
			if(numeros[i]%2==0) {
				if(numeros[i]<0) {
					System.out.println("Numero ingresado en posicion "+i+" : "+numeros[i]+" ES PAR y ES NEGATIVO");
				}else {
					System.out.println("Numero ingresado en posicion "+i+" : "+numeros[i]+" ES PAR y ES POSITIVO");
					positivo +=numeros[i];
				}
				
			}else {
				if(numeros[i]<0) {
					System.out.println("Numero ingresado en posicion "+i+" : "+numeros[i]+" ES IMPAR y ES NEGATIVO");					
				}else {
					System.out.println("Numero ingresado en posicion "+i+" : "+numeros[i]+" ES IMPAR y ES POSITIVO");					
					impar+=numeros[i];
					positivo +=numeros[i];
					
				}
			}
			
		}
		
		System.out.println("La suma de los numeros positivos es "+positivo);
		System.out.println("La suma de los numeros impares es "+impar);
		
		
	}

}
