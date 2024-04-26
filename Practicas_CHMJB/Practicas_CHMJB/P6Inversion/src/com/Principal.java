package com;

public class Principal {
	 public static void main(String[] args) {
	        double capitalInicial = 1000.00;
	        double tasaInteresMensual = 0.02;
	        int meses = 12;

	        double capitalFinal = calcularInteresCompuesto(capitalInicial, tasaInteresMensual, meses);

	        System.out.printf("Después de %d meses, la cantidad de dinero será $%.2f\n", meses, capitalFinal);
	    }

	    public static double calcularInteresCompuesto(double capitalInicial, double tasaInteresMensual, int meses) {
	        double capitalFinal = capitalInicial;

	        for (int i = 0; i < meses; i++) {
	            capitalFinal += capitalFinal * tasaInteresMensual;
	        }

	        return capitalFinal;
	    }
	}


