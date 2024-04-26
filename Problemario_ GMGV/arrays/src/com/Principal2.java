package com;

public class Principal2 {

	public static void main(String[] args) {		
		String mensaje="Gerardo gomez 31";
		String c = "";
		String cifrado="";
		String numeros="1234567890";
		String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l",
				"m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		for (int i = 0; i < mensaje.length(); i++) {
			c=Character.toString(mensaje.charAt(i)).toLowerCase();
			if(c.equals(" ")) {
				cifrado = cifrado + "-";
			}else if(c.equals("z")) {
				cifrado = cifrado + "a";
			}else if(numeros.indexOf(c)>=0) { //Si es un numero
				cifrado = cifrado + (Integer.parseInt(c) + 1);
			}else {
				//Buscar en que posicion del abc esta la letra actual
				for (int j = 0; j < abc.length; j++) {
					if(abc[j].equals(c)) {
						cifrado = cifrado + abc[j+1];
					}	
				}	
			}	
		}
		System.out.println(cifrado);
	}


}
