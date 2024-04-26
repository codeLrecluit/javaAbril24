package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		List<Alumno> alumnos = new ArrayList<Alumno>();
		List<Alumno> procd = new ArrayList<Alumno>();

		String nombre;
		int edad;
		String numeroControl;
		String procedencia;
		String sexo;
		String carrera;
		int seleccion=0;
		Alumno al = null;
		int sumatoriaEdades = 0;
		int mujeres = 0;
		int promedio = 0;

		Scanner sc = new Scanner(System.in);
		

		do {

			System.out.println("--------------Menu---------------");
			System.out.println("1. Agregar");
			System.out.println("2. Editar");
			System.out.println("3. Buscar por nombre");
			System.out.println("4. Mostrar todos los que tengan una escuela de procedencia");
			System.out.println("5. Calcular edad promedio de las mujeres");
			System.out.println("6. Eliminar por nombre");
			System.out.println("7. Mostrar todos");
			System.out.println("Selecciona una opcion");

			seleccion = sc.nextInt();
			sc.nextLine();

			switch (seleccion) {
			case 1:
				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();

				System.out.println("Ingresa la edad");
				edad = sc.nextInt();
				sc.nextLine();

				System.out.println("Ingresa numero de control");
				numeroControl = sc.nextLine();

				System.out.println("Ingresa la procedencia");
				procedencia = sc.nextLine();

				System.out.println("Ingresa sexo del alumno");
				sexo = sc.nextLine();

				System.out.println("Ingresa la carrera");
				carrera = sc.nextLine();

				al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);
				alumnos.add(al);

				break;
			case 2:

				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();

				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getNombre().equals(nombre)) {

						System.out.println("Ingresa la nueva edad");
						edad = sc.nextInt();
						sc.nextLine();

						System.out.println("Ingresa nuevo numero de control");
						numeroControl = sc.nextLine();

						System.out.println("Ingresa la nueva procedencia");
						procedencia = sc.nextLine();

						System.out.println("Ingresa nuevo sexo del alumno");
						sexo = sc.nextLine();

						System.out.println("Ingresa la nueva carrera");
						carrera = sc.nextLine();

						alumnos.get(i).setEdad(edad);
						alumnos.get(i).setNumeroControl(numeroControl);
						alumnos.get(i).setProcedencia(procedencia);
						alumnos.get(i).setSexo(sexo);
						alumnos.get(i).setCarrera(carrera);
						break;
					}
				}

				break;
			case 3:

				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();

				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getNombre().equals(nombre)) {

						al = alumnos.get(i); // Ya se encontro el alumno

						break;

					}
				}
				if (al != null) {
					System.out.println(al);
				} else {
					System.out.println("Alumno no encontrado");
				}

				break;
			case 4:

				System.out.println("Ingresa la nueva procedencia");
				procedencia = sc.nextLine();

				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getProcedencia().equals(procedencia)) {
						procd.add(alumnos.get(i));
					}else {
						System.out.println("Procedencia no encontrada");
					}
				}
				System.out.println(procd);
				break;
			case 5:

				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getSexo().equals("femenino")) {
						mujeres++;
						sumatoriaEdades += sumatoriaEdades + alumnos.get(i).getEdad();
					}
				}
				promedio = sumatoriaEdades / mujeres;
				System.out.println("Promedio: " + promedio);
				break;
			case 6:
				
				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();

				for (int i = 0; i < alumnos.size(); i++) {
					if (alumnos.get(i).getNombre().equals(nombre)) {

						alumnos.remove(i); // Se elimina la posicion del alumno

						break;
					}
				}

				break;
			case 7:
				
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println(alumnos.get(i));
				}

				break;

			}

		} while (seleccion >0 && seleccion <8);

	}

}
