package com;
import java.util.Scanner;

public class Principal {
	
 Scanner scanner = new Scanner(System.in);
 {
   System.out.print("Ingrese su frase:");
	 String frase = scanner.nextLine();
	  System.out.println("Ingrese su letra:");
	    String letra = scanner.nextLine();
	 
	   //Convierte A minúsculas
	    
	String fraseMinuscula = frase.toLowerCase();
	 String letraMinuscula = letra.toLowerCase();
	 
	 
 //Contar las Ocurrencias de la letra (cuantas veces aparece)
	 
	 
	          int contador =0;
	           for(int i =0; i<fraseMinuscula.length(); i++) {
	        	   
	           
	           
	           
	            if (fraseMinuscula.charAt(i)== letraMinuscula.charAt(0)) {
	            	
	            	contador++;
	            }
 
	           }
	           
	       //Imprime resultado
	           
	           
	        if(contador > 0 ){
	        	System.out.println("La letra '" + letra + "' aparece" + contador + "veces en la frase");
	        }else {
	        	System.out.println("Carácter no encontrado");
	        }
}
}
