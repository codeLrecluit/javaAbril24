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
			sc.nextLine(); //Agregar para mejor funcionamiento

			// Instancio el objeto con los datos obtenidos desde teclado
			al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);

			// Añado a la lista el objeto que acabo de crear
			alumnos.add(al);
			break;
			
		case 2:
			sc.nextLine();
			System.out.println("Ingresa el nombre del alumno buscado");
			nombre = sc.nextLine();
			boolean encontrado = false; //se agrega bandera, para encontrar el nombre 
			
			for (int i = 0; i < alumnos.size(); i++) {
				// Si el nombre del alumno actual coincide con el buscado ....
				if (alumnos.get(i).getNombre().equals(nombre)) {
					encontrado = true;
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
					sc.nextLine(); //Limpia buufer despues del nextInt()
				
					// Edicion del objeto alumno
					alumnos.get(i).setNumeroControl(numeroControl);
					alumnos.get(i).setCarrera(carrera);
					alumnos.get(i).setEdad(edad);
					alumnos.get(i).setProcedencia(procedencia);
					alumnos.get(i).setSexo(sexo);

					break;
				}

			}
			if (!encontrado) {
				System.out.println("No se encontro alumno con ese nombre");
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
			if(promedio > 0) { //Condicion promedio
			System.out.println("Promedio: "+promedio);
			}else {
				System.out.println("No se puede realizar la operacion");
			}

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
			
			//constrains
			
			String mensaje ="Hola Mundo";
			
			//Comprobar si el string contiene "mundo"
			boolean contieneMundo = mensaje.contains("mundo");
			System.out.println("¿Contiene 'mundo'?" + contieneMundo); //Imprime true-verdadero
			
			//Comprobar si el string contiene "Hola"
			boolean contieneHola = mensaje.contains("Hola");
			System.out.println("¿Contiene 'Hola'?" + contieneHola); //Imprime true-verdadero
			
			//Comprobar si el string contiene "adios"
			boolean contieneadios = mensaje.contains("adios");
			System.out.println("¿Contiene 'adios'?" + contieneadios); //Imprime false-falso
			break;
			
	case 9:
		
		//IndeOf: se utiliza con strings para encontrar el indice de la primera aparicion
		
		
		String texto = "Hola mundo, bienvenido al mundo de Java";

	    int indiceMundo = texto.indexOf("mundo");
	    System.out.println("Primera aparicion de 'mundo': " + indiceMundo);
	    
	    int indiceJava = texto.indexOf("Java");
	    System.out.println("Primera aparicion de 'Java': " + indiceJava);
	    
	    int indicePython = texto.indexOf("Python");
	    System.out.println("Primera aparicion de 'Python': " + indicePython);
	    break; 
	      
	case 10:
		
		//LastIndexOf: Se usa para econtra la posocion de la ultima de un ultimo elemento
		String texto1= "Hola mundo, bienvenido al mundo de Java";
		
		//Indice de la ultima aparicion de "mundo"
		int ultimoIndiceMundo = texto1.lastIndexOf("mundo");
		System.out.println("Ultima aparicion de 'mundo': " + ultimoIndiceMundo);

		//Indice de la ultima aparicion de "Java"
		int ultimoIndiceJava = texto1.lastIndexOf("Java");
		System.out.println("Ultima aparicion de 'Java': " + ultimoIndiceJava);

		//Indice de una subcadena que no existe
		int ultimoIndicePython = texto1.lastIndexOf("Python");
		System.out.println("Ultima aparicion de 'Python': " + ultimoIndicePython);
		break;
	case 11:
		
		// isEmpty: se usa para verificar una coleccion
		String textoVacio = "";
		String textoLleno = "Hola";
		
		//Verificar si el texto esta vacio
		System.out.println("¿'textoVacio' esta vacio?" + textoVacio.isEmpty());
		System.out.println("¿'textoLleno' esta vacio?" + textoLleno.isEmpty());
		break;
	case 12:
		//CLEAR: Se utiliza para eliminar elementos de una estructura
		
		List<String> lista = new ArrayList<>();
		lista.add("Manzana");
		lista.add("Banana");
		lista.add("Cereza");
	    
		System.out.println("Lista antes de clear():" + lista);
		
		System.out.println("Lista despues de clear():" + lista);
		break;
		}
	}while (seleccion>0 && seleccion <13);
	System.out.println("Gracias");
		}
}