package com;

import java.text.DecimalFormat;

public class Principal {
	
	public static void main(String[] args) {
		
		DecimalFormat formato_inversion = new DecimalFormat("#0.00");
		
		 int inversion = 700;
	        double cantidad_inversion = inversion; // Comenzamos con la inversión inicial
	        double interes = 0.02; // El interés mensual (2% expresado como decimal)
	        
	        int mes = 1;
	        
	        while(cantidad_inversion <=1500) {
	        	
	        	cantidad_inversion += cantidad_inversion * interes;       	
	        	
	        	mes=mes+1;
	        }
	        System.out.println("Si inviertes $700, tardarás "+mes+" meses en obtener una cantidad igual o mayor a $1500");
	}

}
