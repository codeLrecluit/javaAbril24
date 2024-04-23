package com;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		String[] data = { "23", "45", "76", "75", "79", "37", "6", "96", "254", "3", "2", "636", "4" };
		String[] resultado = new String[data.length];

		int[] numeros = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			numeros[i] = Integer.parseInt(data[i]);
		}
		
		for(int i=0; i < data.length; i++) {
			if(numeros[i]%2==0) {
				resultado[i]="par";
			}else {
				resultado[i]="impar";
			}
		}
		
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(resultado));

	}

}
