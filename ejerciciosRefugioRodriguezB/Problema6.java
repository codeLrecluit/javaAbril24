package com;

public class Problema6 {

	public static void main(String[] args) {
		/*
		 * 6.- Una persona desea invertir $1000.00
		 *  en un banco, el cual le otorga un 2% de 
		 *  interés mensual. Cual será la cantidad de 
		 *  dinero que esta persona tendrá al cabo de
		 *   un año si todo el dinero lo reinvierte?.*/
		
		double inversionInicial = 1000;
        double interes = 0.02; 
        int meses = 12; 

        
        double inversionFinal = inversionInicial;
        for (int i = 0; i < meses; i++) {
            inversionFinal += inversionFinal * interes;
        }

        System.out.println("Inversion final: $" + inversionFinal);
 
	}

}
