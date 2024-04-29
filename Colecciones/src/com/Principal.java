// Elaborado por: Cristian Gustavo González Gómez
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
			System.out.println("*******************************************************************");
			System.out.println("*                        MENU DE OPCIONES                         *");
			System.out.println("*******************************************************************");
			System.out.println("*1 Agregar                                                        *");
			System.out.println("*2 Editar                                                         *");
			System.out.println("*3 Buscar por nombre                                              *");
			System.out.println("*4 Mostrar todos los que tengan una escuela de procedencia        *");
			System.out.println("*5 Calcula la edad promedio de las mujeres                        *");
			System.out.println("*6 Eliminar por nombre                                            *");
			System.out.println("*7 Mostrar todos                                                  *");
			System.out.println("*8 Método Contains                                                *");
			System.out.println("*9 Método IndexOF                                                 *");
			System.out.println("*10 Método Last index Of                                          *");
			System.out.println("*11 Método Empty                                                  *");
			System.out.println("*12 Método Clear                                                  *");
			System.out.println("*13 Salir                                                         *");
			System.out.println("*******************************************************************");
			System.out.println("*Selecciona una opcion: ");
			seleccion = sc.nextInt();

			switch (seleccion) {

			case 1:

				sc.nextLine(); // Agregamos esto para capturar el salto de línea que deja nextInt()

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
			    sc.nextLine(); // Agregar esto para un mejor funcionamiento

			    // Instancio el objeto con los datos obtenidos desde teclado
			    al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);

			    // Añado a la lista el objeto que acabo de crear
			    alumnos.add(al);
			    break;
			case 2:
				 sc.nextLine(); // Limpia el buffer de entrada después del último nextInt()
				    System.out.println("Ingresa el nombre del alumno buscado");
				    nombre = sc.nextLine();
				    boolean encontrado = false; //Agregamos una bandera.

				    for (int i = 0; i < alumnos.size(); i++) {
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
				            sc.nextLine(); // Limpia el buffer después de nextInt()

				            // Actualización del objeto alumno
				            alumnos.get(i).setNumeroControl(numeroControl);
				            alumnos.get(i).setProcedencia(procedencia);
				            alumnos.get(i).setSexo(sexo);
				            alumnos.get(i).setCarrera(carrera);
				            alumnos.get(i).setEdad(edad);
				            
				            break;
				        }
				    }
				    if (!encontrado) {
				        System.out.println("No se encontró un alumno con ese nombre...");
				    }
				    break;
			case 3:
				al = null; //Limpiar variable para evitar mostrar busquedas anteriores...
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
				System.out.println(procd); //Agregar un salto de línea //Imprimir cada elemento
				break;
			case 5:
				for (int i = 0; i < alumnos.size(); i++) {
					// Si la procedencia del alumno actual coincide con la buscado ....
					if (alumnos.get(i).getSexo().equals("femenino")) {
						mujeres++;
						sumatoriaEdades = sumatoriaEdades + alumnos.get(i).getEdad();
					}
				}
				promedio = sumatoriaEdades/mujeres;
				if (promedio > 0) { //Condición (promedio > 0)
					System.out.println("Promedio: "+promedio);
				}else {
					System.out.println("Aviso, no se puede realizar la operación...");
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
				break;
					

			case 7:
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println(alumnos.get(i) + "\n");				
				}
				break;
				
			case 8:
				
				//Contains: se usa para determinar si el objeto especificado existe dentro de la colección. Retorna true si la colección contiene el elemento especificado, de lo contrario retorna false.
				
				String mensaje = "Hola mundo";

		        // Comprobar si el string contiene "mundo"
		        boolean contieneMundo = mensaje.contains("mundo");
		        System.out.println("¿Contiene 'mundo'? " + contieneMundo); // Imprime true

		        // Comprobar si el string contiene "Hola"
		        boolean contieneHola = mensaje.contains("Hola");
		        System.out.println("¿Contiene 'Hola'? " + contieneHola); // Imprime true

		        // Comprobar si el string contiene "adios"
		        boolean contieneAdios = mensaje.contains("adios");
		        System.out.println("¿Contiene 'adios'? " + contieneAdios); // Imprime false
				break;
				
			case 9:
				// IndeOf:  se utiliza con strings para encontrar el índice de la primera aparición de una subcadena o un carácter específico. Si la subcadena o el carácter no se encuentran en el string, el método retorna -1.
				String texto = "Hola mundo, bienvenido al mundo de Java";

		        // Índice de la primera aparición de "mundo"
		        int indiceMundo = texto.indexOf("mundo");
		        System.out.println("Primera aparición de 'mundo': " + indiceMundo); // Imprime 5

		        // Índice de la primera aparición de "Java"
		        int indiceJava = texto.indexOf("Java");
		        System.out.println("Primera aparición de 'Java': " + indiceJava); // Imprime 37

		        // Índice de una subcadena que no existe
		        int indicePython = texto.indexOf("Python");
		        System.out.println("Primera aparición de 'Python': " + indicePython); // Imprime -1
				break;
				
			case 10:
				//LastIndexOf: se usa para encontrar la posición de la última aparición de un elemento o una subcadena dentro de un string o una lista en Java.
				String texto1 = "Hola mundo, bienvenido al mundo de Java";

		        // Índice de la última aparición de "mundo"
		        int ultimoIndiceMundo = texto1.lastIndexOf("mundo");
		        System.out.println("Última aparición de 'mundo': " + ultimoIndiceMundo); // Imprime 26

		        // Índice de la última aparición de "Java"
		        int ultimoIndiceJava = texto1.lastIndexOf("Java");
		        System.out.println("Última aparición de 'Java': " + ultimoIndiceJava); // Imprime 35

		        // Índice de una subcadena que no existe
		        int ultimoIndicePython = texto1.lastIndexOf("Python");
		        System.out.println("Última aparición de 'Python': " + ultimoIndicePython); // Imprime -1
				break;
				
			case 11:
				//Método isEmpty: es utilizado frecuentemente para verificar si una colección, un string o cualquier contenedor de datos está vacío, es decir, no contiene elementos. Este método es útil porque proporciona una manera simple y legible de chequear si necesitas añadir elementos a una colección o realizar operaciones sobre elementos que podrían no existir, evitando así errores como NullPointerException.
				String textoVacio = "";
		        String textoLleno = "Hola";

		        // Verificar si el texto está vacío
		        System.out.println("¿'textoVacio' está vacío? " + textoVacio.isEmpty()); // Imprime true
		        System.out.println("¿'textoLleno' está vacío? " + textoLleno.isEmpty()); // Imprime false
			
				break;
				
			case 12:
				//Método clear: es utilizado para eliminar todos los elementos de una estructura de datos mutable, como una colección (Listas, Conjuntos, Mapas) en Java. Este método es muy útil cuando deseas reutilizar una colección existente sin la necesidad de crear una nueva, eliminando todos los elementos actuales para que la colección esté vacía.
				
				List<String> lista = new ArrayList<>();
		        lista.add("Manzana");
		        lista.add("Banana");
		        lista.add("Cereza");

		        System.out.println("Lista antes de clear(): " + lista);  // Imprime [Manzana, Banana, Cereza]

		        // Limpiar la lista
		        lista.clear();

		        System.out.println("Lista después de clear(): " + lista);  // Imprime []
				break;
			}

		} while (seleccion>0 && seleccion <13);
		System.out.println("Gracias por utilizar mi programa");

	}

}