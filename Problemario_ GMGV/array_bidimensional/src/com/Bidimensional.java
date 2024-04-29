package com;

import java.util.Arrays;

public class Bidimensional {
	public static void main(String[] args) {                                                                        
		String[][] matrizA = { { "f", "5", "7" }, { "6", "x", "k" }, { "1", "8", "9" } };                           
		String[][] matrizB = { { "3", "8", "f" }, { "c", "4", "9" }, { "7", "5", "n" } };                           
		int[][] matrizC = new int[matrizA.length][matrizB.length];                                                  
                                                                            
	                                                                                                                
		for (int i = 0; i < matrizA.length; i++) {                                                                  
		    for (int j = 0; j < matrizB[i].length; j++) {                                                           
		        String a = matrizA[i][j];                                                                           
		        String b = matrizB[i][j]; 

		        char caracterA = a.charAt(0); // Obtén el primer carácter de 'a'
		        char caracterB = b.charAt(0); // Obtén el primer carácter de 'b'

		        if(Character.isDigit(caracterA) && Character.isDigit(caracterB)) {
		            int valorA = Integer.parseInt(a);
		            int valorB = Integer.parseInt(b);
		            matrizC[i][j] = valorA + valorB;
		        } else {
		            matrizC[i][j] = 0;
		        }
		    }                                                                                                       
		}                                                                                                          
	                                                                                                                
//		// Mostrar matriz C                                                                                         
//		for (int i = 0; i < matrizC.length; i++) {                                                                  
//			for (int j = 0; j < matrizC[i].length; j++) {                                                           
//				System.out.print(matrizC[i][j] + " ");                                                              
//			}                                                                                                       
//			System.out.println();                                                                                   
//		}   
		
		System.out.println(Arrays.deepToString(matrizA)); 
		System.out.println(Arrays.deepToString(matrizB)); 
		System.out.println("\n Matriz de resultados ");                                                                                                           
		System.out.println(Arrays.deepToString(matrizC));                                                                             
	                                                                                                                
	}                                                                                                               
}
