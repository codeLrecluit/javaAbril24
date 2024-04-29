package com;

import java.text.DecimalFormat;

public class Principal {
	
	public static void main(String[] args) {
		
		DecimalFormat formato_inversion = new DecimalFormat("#0.00");
		
		 int inversion = 1000;
	        double cantidad_inversion = inversion; // Comenzamos con la inversión inicial
	        double interes = 0.02; // El interés mensual (2% expresado como decimal)
	        
	        for (int mes = 1; mes <= 12; mes++) { // Utilizamos un bucle for para iterar sobre los 12 meses
	            
	            // Calculamos el interés para este mes y lo sumamos al saldo de la inversión
	            cantidad_inversion += cantidad_inversion * interes;
	        }
	        
	        System.out.println("La cantidad de dinero disponible en un año será: $" + formato_inversion.format(cantidad_inversion));
	}

}
