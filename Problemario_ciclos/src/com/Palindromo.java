package com;

import java.util.Scanner;

public class Palindromo {
            //3. Realiza un programa para determinar si un String es palíndromo.
	
	
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			String opcion ="";
			do {
				
				System.out.println("Ingresar texto (,. : ");
				String  s=sc.nextLine();
				
				s=s.replace(" " , ",");
				System.out.println(s);
				int ini=0, fin = s.length()-1;
				boolean bo = true;
				
				while (ini < fin) {
					if(s.charAt(ini)!= s.charAt(fin)) {
						bo=false;
					}
					ini++;
					fin--;
				}
				if(bo)
					System.out.println("\nEs palindromo.");
				else
					System.out.println("\nNo palindromo.");
				
				
				System.out.println("Desea continuar");
			opcion = sc.nextLine();
			} while(opcion.equals("y"));
		}
		
			
}
}
