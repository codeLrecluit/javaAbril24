package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
	List<Alumno> alumnos = new ArrayList<Alumno>();
	String nombre;
	int edad;
	String numeroControl;
	String procedencia;
	String sexo;
	String carrera;
	Scanner sc = new Scanner(System.in);
	int seleccion = 0;
	Alumno al = null;
	List<Alumno> procd = new ArrayList<Alumno>();
	int sumatoriaEdades=0;
	int mujeres=0;
	double promedio=0.0;

	do {
		System.out.println("-------------Menu--------------");
		System.out.println("1-Agregar");
		System.out.println("2-Editar");
		System.out.println("3-Buscar por nombre");
		System.out.println("4-Mostrar todos los que tengan una escuela de procedencia");
		System.out.println("5-Calcula la edad promedio de las mujeres");
		System.out.println("6-Eliminar por nombre");
		System.out.println("7-Mostrar todos");
		System.out.println("8-Metodo contains");
		System.out.println("9-Metodo Indexof");
		System.out.println("10-Metodo lastIndexof");
		System.out.println("11-Metodo empty");
		System.out.println("12-Metodo clear");
		System.out.println("13-Salir");
		System.out.println("Selecciona una opcion");
		seleccion = sc.nextInt();

		switch (seleccion) {

		case 1:
			sc.nextLine();
			System.out.println("Ingresa el nombre");
			nombre = sc.nextLine();

			System.out.println("Ingresa el numero de control");
			numeroControl = sc.nextLine();

			System.out.println("Ingresa la procedencia");
			procedencia = sc.nextLine();

			System.out.println("Ingresa el sexo");
			sexo = sc.nextLine();

			System.out.println("Ingresa la carrera");
			carrera = sc.nextLine();

			System.out.println("Ingresa la edad");
			edad = sc.nextInt();

			// Instancio el objeto con los datos obtenidos desde teclado
			al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);

			// Añado a la lista el objeto que acabo de crear
			alumnos.add(al);
			break;
		case 2:
			sc.nextLine();
			System.out.println("Ingresa el nombre del alumno buscado");
			nombre = sc.nextLine();
			for (int i = 0; i < alumnos.size(); i++) {
				// Si el nombre del alumno actual coincide con el buscado ....
				if (alumnos.get(i).getNombre().equals(nombre)) {
					System.out.println("Ingresa el nuevo numero de control");
					numeroControl = sc.nextLine();
					System.out.println("Ingresa la nueva procedencia");
					procedencia = sc.nextLine();
					System.out.println("Ingresa el nuevo sexo");
					sexo = sc.nextLine();
					System.out.println("Ingresa la nueva carrera");
					carrera = sc.nextLine();
					System.out.println("Ingresa la nueva edad");
					edad = sc.nextInt();
					// Edicion del objeto
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
			al= null;
			sc.nextLine();
			System.out.println("Ingresa el nombre del alumno buscado");
			nombre = sc.nextLine();
			for (int i = 0; i < alumnos.size(); i++) {
				// Si el nombre del alumno actual coincide con el buscado ....
				if (alumnos.get(i).getNombre().equals(nombre)) {

					al = alumnos.get(i); //Ya lo encontré
					break;
				}
			}
			
			if(al!=null) { //Comprobar el contenido de la variable al
				System.out.println(al);
			}else {
				System.out.println("El alumno no existe");
			}

			break;
		case 4:
			sc.nextLine();
			System.out.println("Ingresa la procedencia buscada");
			procedencia = sc.nextLine();
			//Itera
			for (int i = 0; i < alumnos.size(); i++) {
				// Si la procedencia del alumno actual coincide con la buscado ....
				if (alumnos.get(i).getProcedencia().equals(procedencia)) {
					procd.add(alumnos.get(i));
				}
			}
			System.out.println(procd);
			break;
		case 5:
			sc.nextLine();
			for (int i = 0; i < alumnos.size(); i++) {
				// Si la procedencia del alumno actual coincide con la buscado ....
				if (alumnos.get(i).getSexo().equals("femenino")) {
					mujeres++;
					sumatoriaEdades = sumatoriaEdades + alumnos.get(i).getEdad();
				}
			}
			
			promedio = sumatoriaEdades/mujeres;
			System.out.println("Promedio: "+promedio);

			break;
		case 6:
			sc.nextLine();
			System.out.println("Ingresa el nombre del alumno buscado");
			nombre = sc.nextLine();
			for (int i = 0; i < alumnos.size(); i++) {
				// Si el nombre del alumno actual coincide con el buscado ....
				if (alumnos.get(i).getNombre().equals(nombre)) {

					alumnos.remove(i); //Ya lo encontré
					break;
				}
			}
			
			/*
			 * contains
			 * indexOf
			 * lastIndexOf
			 * empty
			 * clear
			 */
			

		case 7:
			for (int i = 0; i < alumnos.size(); i++) {
				System.out.println(alumnos.get(i));				
			}

			break;
			
	case 8:
		 sc.nextLine(); // Limpiar el buffer del scanner
		    System.out.println("Ingresa el nombre del alumno a buscar:");
		    nombre = sc.nextLine();
		    boolean encontrado = false;
		    // Iterar sobre la lista de alumnos
		    for (Alumno a : alumnos) {
		        if (a.getNombre().equalsIgnoreCase(nombre)) {
		            encontrado = true;
		            break; // Terminar el bucle una vez que se encuentre el alumno
		        }
		    }
		    if (encontrado) {
		        System.out.println("El alumno está presente en la lista.");
		    } else {
		        System.out.println("El alumno no está presente en la lista.");
		    }
		break;
	case 9:
		sc.nextLine(); // Limpiar el buffer del scanner
	    System.out.println("Ingresa el nombre del alumno a buscar:");
	    nombre = sc.nextLine();
	    int indice = -1; // Inicializar el índice con -1 para indicar que no se encontró el alumno
	    // Iterar sobre la lista de alumnos
	    for (int i = 0; i < alumnos.size(); i++) {
	        if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
	            indice = i; // Actualizar el índice si se encuentra el alumno
	            break; // Terminar el bucle una vez que se encuentre el alumno
	        }
	    }
	    if (indice != -1) {
	        System.out.println("El alumno " + nombre + " se encuentra en la posición " + indice + " de la lista.");
	    } else {
	        System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
	    }
	    break;
	case 10:
	    sc.nextLine(); // Limpiar el buffer del scanner
	    System.out.println("Ingresa el nombre del alumno a buscar:");
	    nombre = sc.nextLine();
	    int indiceUltimo = -1; // Inicializar el índice con -1 para indicar que no se encontró el alumno
	    // Iterar sobre la lista de alumnos en orden inverso
	    for (int i = alumnos.size() - 1; i >= 0; i--) {
	        if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
	            indiceUltimo = i; // Actualizar el índice si se encuentra el alumno
	            break; // Terminar el bucle una vez que se encuentre el alumno
	        }
	    }
	    if (indiceUltimo != -1) {
	        System.out.println("El alumno " + nombre + " se encuentra en la posición " + indiceUltimo + " de la lista (contando desde el final).");
	    } else {
	        System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
	    }
		break;
	case 11:
		 if (alumnos.isEmpty()) {
		        System.out.println("La lista de alumnos está vacía.");
		    } else {
		        System.out.println("La lista de alumnos no está vacía.");
		    }
		break;
	case 12:
		 alumnos.clear();
		    System.out.println("La lista de alumnos se ha vaciado.");
		break;
	case 13:
		 System.out.println("Saliendo del programa...");
		    // Aquí puedes agregar cualquier limpieza o cierre de recursos necesarios
		break;

	} while (seleccion>0 && seleccion <8);

}
}