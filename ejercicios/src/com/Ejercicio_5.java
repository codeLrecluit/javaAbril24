// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas

package com;

public class Ejercicio_5 {
	public static void main(String[] args) {
		
		// Contador de horas:
		for (int horas=0; horas <= 23; horas++)
			
			//Contador de minutos:
			for (int min=0; min <= 59; min++)
				
					//Contador de segundos:
					for (int seg=0; seg <= 59; seg++)
												
						System.out.println(horas +" : "+ min +" : "+ seg+" horas");
		}
}
