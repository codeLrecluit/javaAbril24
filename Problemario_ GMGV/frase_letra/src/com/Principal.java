package com;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner obj  = new Scanner(System.in);
        
        String frase = "";
        String letra = "";
        
        System.out.println("Ingresa una frase:");
        frase = obj.nextLine();
        
        System.out.println("Ingresa una letra:");
        letra = obj.nextLine().toLowerCase(); // Convertir la letra a minúscula
        
        int contador = 0; // Inicializar el contador de repeticiones
        
        // Recorrer cada letra de la frase
        for(int i = 0; i < frase.length(); i++) {
            char letraActual = frase.charAt(i);
            
            // Compara la letra actual con la letra ingresada
            if (Character.toLowerCase(letraActual) == letra.charAt(0)) {
                contador++; // Incrementar el contador si la letra coincide
            }
        }
        
     // Mostrar cuantas veces se repite la letra en caso de que se encuentre        
        if(contador > 0) {        	 
            System.out.println("La letra '" + letra + "' se repite " + contador + " veces en la frase.");
        }
        //Si no se encuentra la letra, el resultado será mostrar que el caracter no fue encontrado
        else {
        	System.out.println("Caracter no encontrado");
        }        
    }
}

