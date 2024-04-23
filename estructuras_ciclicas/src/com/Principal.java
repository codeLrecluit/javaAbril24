package com;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner Uinput = new Scanner (System.in);
		
//		===============================NUMERO 1 TABLA DE MULTIPLICAR ESTATICA======================================================================================================
		System.out.println("Tabla de multiplacar del 12");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("12 * %d = %d \n",i ,i*12);
		}
		
		
//		===============================NUMERO 2 TABLA DE MULTIPLICAR======================================================================================================
		System.out.println("\nTabla de multiplacar personalizada");
		System.out.println(" Ingresa el numero a multiplicar: ");
		int base = Uinput.nextInt();
		System.out.printf(" Ingresa el numero de veces a multiplcar \"%d\":\n",base);
		int veces = Uinput.nextInt();
		
		for (int i = 1; i <= veces; i++) {
			System.out.printf("%d * %d = %d \n",base ,i ,base*i);
		}
		Uinput.nextLine();
		
		
		
//		===============================NUMERO 3 PALINDROMO======================================================================================================
		System.out.println("\nVerificar si una frase es un palindromo");
		System.out.println("Ingresa tu frase o palabra");
		String palindromo = Uinput.nextLine();
		char[] Arrpalindromo = palindromo.toLowerCase().replace(" ", "").toCharArray();
		int fin1 =  Arrpalindromo.length;
		int coincidencias = 0;
		for (int i = 0; i <Arrpalindromo.length; i++) {
			fin1--;
//			System.out.printf("valores %s, %s\n",Arrpalindromo[i] , Arrpalindromo[fin] );
			if (Arrpalindromo[i] == Arrpalindromo[fin1] ) {coincidencias ++;}
		}
		
		if(coincidencias == Arrpalindromo.length) {
			System.out.printf("La frase \"%s\" SI es un palindromo\n",palindromo);
		}else {
			System.out.printf("La frase \"%s\" NO es un palindromo\n",palindromo);
		}
		
		
		
//	    ===============================NUMERO 4 BUSCAR CARACTER======================================================================================================
		System.out.println("\nIngresa una frase:");
		String frase = Uinput.nextLine();
		char[] cadena = frase.toCharArray();

		System.out.println("\nIngresa la letra a buscar:");
		String letra = Uinput.next();
		int contador = 0;
		
		for (int i = 0; i < cadena.length; i++) {
			if ((String.valueOf(cadena[i]).equals(letra))) {
				contador++;
			}
			
        }
		if (contador == 0){
			System.out.println("Caracter no encontrado");
			
		}else {
		System.out.printf(" tu frase es: %s \nLa letra \"%s\" se repitio %d veces\n", frase, letra, contador);
		}
		
		
		
//		===============================NUMERO 5 RELOG======================================================================================================
		System.out.println("\nSimulación del reloj");

		for (int horas = 0; horas < 24; horas++) {
		    for (int minutos = 0; minutos <= 59; minutos++) {
		        for (int segundos = 0; segundos <= 59; segundos++) {
		            System.out.printf("%02d : %02d : %02d\n", horas, minutos, segundos);
		        }
		    }
		}
		
		
		
//	    ===============================NUMERO 6 INVERSION======================================================================================================
		System.out.println("\nInversion");
		float inversion = 1000f;
		
		for (int i = 0; i < 12; i++) {
			inversion += inversion*.02;
		}
		System.out.printf("Saldo final: %.2f\n",inversion);
		
		
		
//		===============================NUMERO 7 INVERSION 2======================================================================================================
		System.out.println("\nInversion numero 2");
		float inversion2 = 700f;
		int meses = 0;
		while(inversion2<1500) {
			inversion2 += inversion2*.02;
			meses++;
		}
		System.out.printf("le tomaria %d meses para tener un saldo final: %.2f\n",meses,inversion);
		
		
		
//		=================================NUMERO 8 DE MENOR A MAYOR====================================================================================================
		System.out.println("\nLectura de 2 numeros (imprimir de menor a mayor)");
		System.out.println("Ingresa el primer numero");
		int inicio = Uinput.nextInt();
		System.out.println("Ingresa el segundo numero");
		int fin = Uinput.nextInt();
		int a = 0;
		Uinput.nextLine();
		if(inicio>fin) {
			a = inicio;
			inicio = fin;
			fin = a;
		}
		
		for(int i= inicio; i<=fin; i++) {
			System.out.println(i);
		}
		
		
		
//		===============================NUMERO 9 PARES======================================================================================================		
		System.out.println("\nLectura de 2 numeros (impirmir los pares)");
		System.out.println("Ingresa el primer numero");
		int inicio2 = Uinput.nextInt();
		System.out.println("Ingresa el segundo numero");
		int fin2 = Uinput.nextInt();
		Uinput.nextLine();
		int b = 0;
		if(inicio2>fin2) {
			b = inicio2;
			inicio2 = fin2;
			fin2 = b;
		}
		for(int i= inicio2+1; i < fin2; i++) {
			if (i%2 == 0 && i != 0) {
				System.out.println(i);
			}
			
		}
		
		
		
//		===============================NUMERO 10 DESCRIPCION======================================================================================================
		int No_num = 5;
		System.out.printf("\ningresa %d numeros\n",No_num);
		int[] numeros = new int[20];;
		for(int i=0; i < No_num; i++) {
			numeros[i] = Uinput.nextInt();
		}
		int positivos = 0;
		int impares = 0;
		
		for(int i=0; i < No_num; i++) {
			int x = numeros[i];
			System.out.printf("%d es:    ",x);
			if (x == 0) {
				System.out.printf(" cero");
			}
			else {
				if(x>0) {
					System.out.printf(" | positivo");
					positivos += x;
				}
				else{
					System.out.printf(" | negativo");
				}
			
				if(x%2 == 0) {
					System.out.printf(" | par");
				}
				else {
					System.out.printf(" | impar");
					impares += x;
				}
			}
			System.out.println("");
		}
		
		System.out.printf("La sumatoria de los positivos es: %d\n",positivos);
		System.out.printf("La sumatoria de los impares es: %d\n",impares);
		
		
		
//		===============================NUMERO 11 CUADRADO======================================================================================================
		System.out.println("\nDibujar un cuadrado");
		System.out.println("Ingresa el ancho");
		int ancho = Uinput.nextInt();
		System.out.println("Ingresa el alto");
		int alto = Uinput.nextInt();
		
		System.out.printf("dibujando un cuadrado de %d * %d\n", ancho, alto);
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.printf("* ");
			}
			System.out.println("");
		}
		
		
		
//		===============================NUMERO 12 EDADES======================================================================================================		
		System.out.println("\nPromedio de edades superior a 25");
		float promedio = 0.f;
		float edades = 0 ;
		int No_edades = 0;
		
		while (promedio < 25) {
			System.out.println("Ingresa tu edad: ");
			int edad = Uinput.nextInt();
			edades += edad;
			No_edades ++;
			promedio = edades/No_edades;
		}
		System.out.printf("El promedio fue de: %.2f\n", promedio);
		
		
		
		
	}

}
