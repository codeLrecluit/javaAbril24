package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cantidad_edades=0;
		double promedio_edad=0.00;
		
		System.out.println("Cuantas edades vas a guardar");
		cantidad_edades = sc.nextInt();
		
		int [] array_edades = new int[cantidad_edades];
		
		int suma_edades = 0;

        // Solicitar y almacenar las edades en el arreglo
        for (int i = 0; i < cantidad_edades; i++) {
            System.out.println("Ingresa edad " + (i + 1) + ":");
            array_edades[i] = sc.nextInt();
            suma_edades += array_edades[i]; // Sumar las edades ingresadas
        }
        
        promedio_edad = (double) suma_edades / cantidad_edades; // Calcular el promedio
        
        // Verificar si el promedio supera 25
        if (promedio_edad > 25) {
            System.out.println("El promedio de edades es superior a 25. El programa ha finalizado.");
        } else {
            System.out.println("El promedio de edades es: " + promedio_edad);
        }
		
	}

}
