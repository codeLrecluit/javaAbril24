package com;

public class Principal {

	  public static void main(String[] args) {
	        double capitalInicial = 700.00;
	        double tasaInteresMensual = 0.02;
	        double capitalObjetivo = 1500.00;

	        int meses = calcularMesesParaObjetivo(capitalInicial, tasaInteresMensual, capitalObjetivo);

	        System.out.printf("La persona tendrá más de $%.2f en %d meses\n", capitalObjetivo, meses);
	    }

	    public static int calcularMesesParaObjetivo(double capitalInicial, double tasaInteresMensual, double capitalObjetivo) {
	        double capitalFinal = capitalInicial;
	        int meses = 0;

	        while (capitalFinal < capitalObjetivo) {
	            capitalFinal += capitalFinal * tasaInteresMensual;
	            meses++;
	        }

	        return meses;
	    }
	}
