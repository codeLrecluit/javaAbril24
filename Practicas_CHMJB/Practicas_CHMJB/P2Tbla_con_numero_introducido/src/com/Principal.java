package com;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
	
	Scanner scanner= new Scanner(System.in); 
	
	System.out.println("Ingrese el Número para la tabla de multiplicar");
	
	     int numero=scanner.nextInt();
	     
	System.out.println("Ingrese la iteración (hasta que numero)llrgara la tabla de multiplicar");
	
	      int iteracionDeseada = scanner.nextInt();
	      
	      
	        for(int i =1; i<= iteracionDeseada; i++) {
	        	
	        	int resultado= numero*i;
	        	
	        	
	        	  System.out.println(numero +  "x" + i + " =" + resultado);
}
}
}
