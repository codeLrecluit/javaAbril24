package com;

public class Banco_700 {
	//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
	
		public static void main(String[] args) {
			double dinero = 1000;
			int mes = 1;

		while (mes<=12) {
			dinero = dinero * 1.02;
			mes++;
			}
			System.out.println(dinero);
		}	
}
