package com;

import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		/*
		 * 11.Dibuja un cuadrado, como en
		 *  la imagen que acompaña,
		 *   introducir desde teclado el 
		 *   ancho y el alto.
        Ejemplo: 8 x 8
*/
		
		Scanner sc = new Scanner(System.in);
		int ancho,alto;
		do {
			System.out.print("Introduce el ancho del cuadrado: ");
	        ancho = sc.nextInt();

	        System.out.print("Introduce el alto del cuadrado: ");
	        alto = sc.nextInt();
		}while(ancho!=alto);
       

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
