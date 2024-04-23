package com;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		boolean x;
		System.out.println("Introduce numero 1 y 2");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {
					System.out.println(i);
				}
			}
		
		else {
			for(int i=num2;i<=num1;i++) {
					System.out.println(i);
			}
		}
		
	}
}
