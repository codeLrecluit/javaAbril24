package com;

public class Ejercicio5 {
	public static void main(String[] args) {
		int hora, minutos, segundos;
		for (int i = 0; i <=23; i++) {
			for (int j=0; j<60;j++) {
				for(int k=0; k<60; k++)
				{
					System.out.println(i+" : "+j+" : "+k);
				}
			}
		}
	}
}
