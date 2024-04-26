package com;
import com.funciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		funciones f = new funciones();
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		String numeroControl;
		String procedencia;
		String sexo;
		String carrera;
		int sumaEdades = 0;
		int mujeres=0;
		double promedio=0;
		int seleccion=0;
		
		try {
			
		do {
			f.menu();
			seleccion = sc.nextInt();
			Alumno al = null;
			switch (seleccion ) {
			case 1:
				f.agregarAlumno();
				break;
			case 2:
				System.out.println("Dame el nombre del alumno");
				nombre = sc.next();
				f.editar(nombre);
				break;
			case 3:
				System.out.println("Ingresa el nombre del alumno buscado");
				nombre = sc.next();
				f.buscarAlumnoNombre(nombre);
				break;
				
			case 4:
				System.out.println("Dame la procedencia");
				procedencia = sc.next();
				f.mostrarAlumnosProcedencia(procedencia);
				break;
				
			case 5:
				f.calcularPromMujeres();
				break;
				
			case 6:
				System.out.println("Ingresa el nombre del alumno a eliminar");
				nombre = sc.next();
				f.eliminarAlumno(nombre);
				break;
				
			case 7:
				f.mostrarAlumnos();
				break;
			
			case 8:
				break;
			}	
		}while(seleccion >0 && seleccion <= 7);
		}
		catch (Exception Ex) {
			Ex.getStackTrace();
			System.out.println("Error");
		}
		/*
		 * contains
		 * indexOf
		 * lastIndexOf
		 * empty
		 * clear
		 */

		
	}
}
