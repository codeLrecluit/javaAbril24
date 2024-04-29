package com;

public class Problema7 {
	public static void main(String[] args) {
		/*
		 * 7- Una persona desea invertir $700.00
		 *  en un banco, el cual le otorga un 
		 *  2% de interés mensual. En cuantos 
		 *  meses tendrá mas de $1500, si 
		 *  reinvierte cada mes todo su dinero?.*/
        double inversionInicial = 700;
        double interes = 0.02; 
        double cantidadDeseada = 1500;
        int meses = 0;

        double inversionActual = inversionInicial;

        
        while (inversionActual < cantidadDeseada) {
            inversionActual += inversionActual * interes; 
            meses++; 
        }

        System.out.println("Después de " + meses + " meses, la cantidad de dinero será mayor a $" + cantidadDeseada);
    }
}
