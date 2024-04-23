// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 6. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?

package com;

public class Ejercicio_6 {
	public static void main(String[] args) {
		
		double inv1 = 1000;
		double interes = 0.02f;
		float meses = 12;
		
		
		for(int i=1; i<=meses; i++) {
			
			inv1 += inv1 * interes;
			
			System.out.println("Mes " + i + "--> " + inv1);
		}
		System.out.println("La cantidad de dinero que obtendra esta persona en un año es de $1,268.2417878 mx.");
		
    }

}
