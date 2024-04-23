package com;

import java.util.Scanner;

//public class Principal {
	//public static void main(String[] args) {
		
	//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
	
	//int multi= 12;
	//int resultado= 0;
	//for (int i =1; i <=12; i++) {
	     //resultado = multi*i;
	   // System.out.println("12: "+resultado);
	//}
	//}
	
	//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
	//23 x 95 = ???;
	
	//try (Scanner sc = new Scanner(System.in)) {
		//int multi= 23;
		//int resultado= 0;
		//while (multi <= 95) {
			//System.out.println("Ingresar un numero");
		     //resultado = sc.nextInt();
		    //resultado = multi* resultado;
		    //System.out.println("23: "+resultado);
	//	}
//}
	
		

	//3. Realiza un programa para determinar si un String es palíndromo.
	
	
    //public static void main(String[] args) {
    	//Scanner sc = new Scanner(System.in);
    	//String opcion ="";
    	//do {
    		
    		//System.out.println("Ingresar texto (,. : ");
    		//String  s=sc.nextLine();
    		
    		//s=s.replace(" " , ",");
    		//System.out.println(s);
    		//int ini=0, fin = s.length()-1;
    		//boolean bo = true;
    		
    		//while (ini < fin) {
    			//if(s.charAt(ini)!= s.charAt(fin)) {
    				//bo=false;
    			//}
    			//ini++;
    			//fin--;
    		//}
    		//if(bo)
    			//System.out.println("\nEs palindromo.");
    		//else
    			//System.out.println("\nNo palindromo.");
    		
    		
    		//System.out.println("Desea continuar");
    		//opcion = sc.nextLine();
    	//} while(opcion.equals("y"));
		
			
//}
	
	
	//4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
	
	import java.io.*;
	
	public class Principal {
	 private char[] abecedario = {'A', 'a', 'Á', 'á', 'B', 'b',
	 'C', 'c', 'D', 'd', 'E', 'e', 'É', 'é', 'F', 'f',
	 'G', 'g', 'H', 'h', 'I', 'i', 'Í', 'í', 'J', 'j',
	 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'Ñ', 'ñ',
	 'O', 'o', 'Ó', 'ó', 'P', 'p', 'Q', 'q', 'R', 'r',
	 'S', 's', 'T', 't', 'U', 'u', 'Ú', 'ú', 'Ü', 'ü',
	 'V', 'v', 'W', 'w', 'Z', 'z'};
	 private int[] contCaracteres = new int[abecedario.length];
	 private int contador = 0;
	 private int contNoImprimibles = 0;

	 public Principal(){
	 for(int i = 0;i < abecedario.length; i++) {
	 contCaracteres[i]=0;
	 }
	 }

	 public void procesarArchivo(){
	 try{
	 //Abre el fichero indicado en la variable nombreFichero
	 FileReader finput = new FileReader("mi-fich.txt");
	 //Leee el primer carácter.
	 int caract = finput.read();
	 // Recorre el fichero hasta encontrar el carácter -1
	 // que es el que marca el EOF.
	 while(caract != -1) {
	 // Obtenemos el índice de ese carácter en el array
	 int pos = getPosicion(caract);
	 if (pos != -1) {
	 // Incrementamos el contador de ese carácter
	 contCaracteres[pos]++;
	 }
	 else {
	 contNoImprimibles++;
	 }
	 caract = finput.read();
	 // Contamos cuantos caracteres tenemos en total
	 contador++;
	 } // while
	 //Cerramos el fichero
	 if (finput != null) finput.close();
	 } //try
	 catch (IOException e) {
	 System.out.println("Error de lectura del fichero");
	 }
	 }

	 private int getPosicion(int car) {
	 int i = 0;
	 while (i < abecedario.length && abecedario[i] != car) {
	 i++;
	 }
	 if (i < abecedario.length)
	 return i; // Devolvemos la posicion del caracter
	 else
	 return -1; // Carácter no encontrado
	 }
	 public void mostrarResultados(){
	 System.out.println("Núm. de caracteres: " + contador);
	 System.out.println("Letra Cantidad Frecuencia (%)");
	 System.out.println("--------------------------------");
	 int i = 0;
	 while (i < abecedario.length) {
	 System.out.print(" ");
	 System.out.print(abecedario[i]);
	 System.out.print("\t");
	 int cont;
	 // Las vocales pueden tener cuatro formas
	 if (abecedario[i] == 'A' || abecedario[i] == 'E' ||
	 abecedario[i] == 'I' || abecedario[i] == 'O') {
	 cont = contCaracteres[i] + contCaracteres[i+1] +
	 contCaracteres[i+2] + contCaracteres[i+3];
	 i = i + 4;
	 }
	 // Pero la U puede tener hasta seis formas
	 else if (abecedario[i] == 'U') {
	 cont = contCaracteres[i] + contCaracteres[i+1] +
	 contCaracteres[i+2] + contCaracteres[i+3] +
	 contCaracteres[i+4] + contCaracteres[i+5];
	 i = i + 6;
	 }
	 // El resto de caracteres solo tienen dos formas
	 else {
	 cont = contCaracteres[i] + contCaracteres[i+1];
	 i = i + 2;
	 }
	 System.out.format("%5d\n\t", cont);
	 System.out.format("%20.2f\n",
	 (double)(cont*100)/(contador-contNoImprimibles));
	 }
	 System.out.println("Caractes no imprimibles: " +
	 contNoImprimibles);
	 }
	 public static void main(String[] args) {
		 Principal cl = new Principal();
	 cl.procesarArchivo();
	 cl.mostrarResultados();
	 }



	//5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
    //public static void main(String[] args) {
    	//for (int h=0; h <= 23; h++)
    	//for (int m=0; m <= 59; m++)
    	//for (int s=0; s <= 59; s++)
    	//System.out.println(h +"h "+ m +"m "+ s+"s");
    	
    	//}
	
	//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.
		
	//public static void main(String[] args) {
		//double dinero = 1000;
		//int mes = 1;

	//	while (mes<=12) {
		//dinero = dinero * 1.02;
		//mes++;
		//}
		//System.out.println(dinero);
		//}
	//7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.
		//public static void main(String[] args) {
		//double dinero = 700;
		//int mes = 1;
		//for (;;) {
		//dinero = dinero * 1.02;
		//if (dinero >= 1500) break;
		//mes++;
		//}
		//System.out.println(mes);
		//System.out.println(dinero);
		//}

	//8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

	//9. Programa Java que lea dos números y muestre los números pares entre ellos

	//10. Programa que lea 20 números e indique si son positivos o negativos y pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.

	//11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el ancho y el alto.
	//Ejemplo: 8 x 8

}
