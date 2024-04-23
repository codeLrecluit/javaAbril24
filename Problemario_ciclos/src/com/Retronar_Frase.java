package com;


	//4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”.
	
		import java.io.*;
		public class Retronar_Frase {
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

		 public Retronar_Frase(){
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
			 Retronar_Frase cl = new Retronar_Frase();
		 cl.procesarArchivo();
		 cl.mostrarResultados();
		 }

}
