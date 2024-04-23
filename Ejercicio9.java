package com;
import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		boolean x;
		System.out.println("Introduce numero 1 y 2");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			}
		
		else {
			for(int i=num2;i<=num1;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}
		
	}
}
