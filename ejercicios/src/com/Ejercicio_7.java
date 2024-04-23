// Elaborado por: Cristian Gustavo González Gómez
// Ejercicio 7. Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.

package com;

public class Ejercicio_7 {
	 public static void main(String[] args) {
		 
	     double inversion = 700.00;
	     double interes = 0.02; // 2% de interés mensual
	     double objetivo = 1500.00;
	        
	     int meses = 0;
	     double montoActual = inversion;
	        
	     while (montoActual < objetivo) {
	    	 montoActual += montoActual * interes; 
	         meses++;
	         System.out.println("Mes --> " + meses + " Cantidad --> " + montoActual);
	         
	     }
	    
	     System.out.println("El número de meses necesarios para acumular más de $" + objetivo + " es: " + meses + " meses");
	    }
}
