package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		List<Alumno> alumnos = new ArrayList<Alumno>();
		List<Alumno> procd = new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);
		String nombre="";
		int edad;
		String numeroControl;
		String procedencia;
		String sexo;
		String carrera;
		int seleccion = 0;
		Alumno al = null;
		int sumatoriaEdades = 0;
		int mujeres = 0;
		double promedio = 0.0;

		System.out.println("-----------Menú-------------");
		System.out.println("1.-Agregar");
		System.out.println("2.-Editar");
		System.out.println("3.-Buscar por nombre");
		System.out.println("4.-Mostrar todos los que tengan una escuela de procedencia");
		System.out.println("5.-Calcular la edad promedio de las mujeres");
		System.out.println("6.-Eliminar por nombre");
		System.out.println("7.-Mostrar todos");
		System.out.println("8.-Buscar por carrera");
		System.out.println("9.-Eliminar todos");

		do {
			System.out.print("Selecciona una opción");
			seleccion = sc.nextInt();

			switch (seleccion) {
			case 1:
				sc.nextLine();
				System.out.print("Ingresa el nombre: ");
				nombre = sc.nextLine();
				System.out.print("Ingresa la edad: ");
				edad = sc.nextInt();
				sc.nextLine();
				System.out.print("Ingresa el número de control: ");
				numeroControl = sc.nextLine();
				System.out.print("Ingresa la procendencia: ");
				procedencia = sc.nextLine();
				System.out.print("Ingresa el sexo: ");
				sexo = sc.nextLine();
				System.out.print("Ingresa la carrera: ");
				carrera = sc.nextLine();
				
				al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);
				alumnos.add(al);
				break;
			case 2:
				System.out.println("Ingresa el nombre a buscar: ");
				nombre = sc.nextLine();
				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getNombre().equals(nombre)) {
						sc.nextLine();
						
						System.out.print("Ingresa la edad: ");
						edad = sc.nextInt();
						sc.nextLine();
						System.out.print("Ingresa el número de control: ");
						numeroControl = sc.nextLine();
						System.out.print("Ingresa la procendencia: ");
						procedencia = sc.nextLine();
						System.out.print("Ingresa el sexo: ");
						sexo = sc.nextLine();
						System.out.print("Ingresa la carrera: ");
						carrera = sc.nextLine();
						alumnos.get(i).setNumeroControl(numeroControl);
						alumnos.get(i).setCarrera(carrera);
						alumnos.get(i).setEdad(edad);
						alumnos.get(i).setProcedencia(procedencia);
						alumnos.get(i).setSexo(sexo);
						break;
					}

				}
				break;
			case 3:
				System.out.print("Ingresa el nombre a buscar: ");
				nombre = sc.nextLine();
				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getNombre().equals(nombre)) {
						al = alumnos.get(i);
						break;
					}
				}
				if (al != null) {
					System.out.println(al);
				} else {
					System.out.println("El alumno no existe");
				}
				break;
			case 4:
				System.out.print("Ingresa la procedencia");
				procedencia = sc.nextLine();
				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getProcedencia().equals(procedencia)) {

						procd.add(alumnos.get(i));

					}
				}
				System.out.println(procd);
				break;
			case 5:
				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getSexo().equals("femenino")) {

						mujeres++;
						sumatoriaEdades += alumnos.get(i).getEdad();

					}
				}
				promedio = sumatoriaEdades / mujeres;
				System.out.println("Promedio edad " + promedio);
				break;
			case 6:
				System.out.println("Ingresa el nombre del alumno buscado");
				nombre = sc.nextLine();
				for (int i = 0; i < alumnos.size(); i++) {
					// Si el nombre del alumno actual coincide con el buscado ....
					if (alumnos.get(i).getNombre().equals(nombre)) {

						alumnos.remove(i); // Ya lo encontré
						break;
					}
				}
				break;

			case 7:
				if(alumnos.isEmpty()) {
					System.out.println("No hay alumnos");
				}else {
					for (int i = 0; i < alumnos.size(); i++) {
						System.out.println(alumnos.get(i));
					}
				}
				break;
			case 8:
				sc.nextLine();
				System.out.print("Ingresa la carrera a buscar: ");
				carrera = sc.nextLine();
				for (int i = 0; i < alumnos.size(); i++) {
					if(alumnos.get(i).getCarrera().contains(carrera)) {
						System.out.println(alumnos.get(i));
					}else {
						System.out.println("No fue encontrada la carrera");
					}
				}
				break;
			case 9:
				alumnos.clear();
				break;
			}
		} while (seleccion > 0 && seleccion < 9);
	}

}
