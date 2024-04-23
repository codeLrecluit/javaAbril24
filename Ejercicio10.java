package com;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,positivos=0,impares=0;
		for(int i=1; i<=20;i++)
		{
			num=sc.nextInt();
			if (num<0) {
				System.out.println("Es negativo");
			}
			else {
				System.out.println("Es positivo");
				positivos++;
			}
			if (num%2==0) {
				System.out.println("Es par");
			}
			else
			{
				System.out.println("Es impar");
				impares++;
			}
		}
		System.out.println("La cantidad de impares son "+impares);
		System.out.println("La cantidad de positivos son "+positivos);
	}
}
