package com;

import java.util.ArrayList;
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
	int seleccion =0;

	Alumno al = null;

	do {
		al = null;
		if (seleccion > 0 && seleccion <= 13) {
			System.out.println("Presiona ENTER para continuar");
			sc.nextLine();
			limpiarPantalla();
		}
		
		System.out.println("---------------MENU------------");
		System.out.println("1.- Agregar");
		System.out.println("2.- Editar por nombre");
		System.out.println("3.- Buscar por nombre");
		System.out.println("4.- Mostrar todos los que tengan una escuela de procedencia");
		System.out.println("5.- Calcular el promedio de las mujeres");
		System.out.println("6.- Eliminar por nombre");
		System.out.println("7.- Mostrar todos");
		System.out.println("8.- Verificar si alguien esta registrado");
		System.out.println("9.- Consultar el numero de registro desde el inicio");
		System.out.println("10.- Consultar el numero de registro desde el final");
		System.out.println("11.- Checar numero de registros");
		System.out.println("12.- Eliminar todos los registros");
		System.out.println("13.- Salir");
		
		System.out.println(Colores.morado + "Selecciona una opcion" + Colores.reset);
		String s = sc.nextLine();
		
		try {
			seleccion = Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(Colores.rojo + "Opcion invalida, ingresa una opcion valida un valor ente 1 y 8" + Colores.reset);
		}
//		********************************************************************************************************************************************************    
		switch (seleccion) {
//		********************************************************************************************************************************************************
		case 1: 
			al = pedirDatos();
			alumnos.add(al);
			System.out.println(Colores.verde + "Datos ingresados correctamente" + Colores.reset);
			break;
			
//		********************************************************************************************************************************************************
		case 2: 
			System.out.println("Ingresa el nombre del alumno a buscar");
			nombre = sc.nextLine();
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getNombre().equals(nombre)) {
//					System.out.println(alumnos.get(i));
					System.out.println("Ingresa la nueva edad");
					edad = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingresa el nuevo numero de control");
					numeroControl = sc.nextLine();
					System.out.println("Ingresa el nuevo lugar de procedencia");
					procedencia = sc.nextLine();
					System.out.println("Ingresa el nuevo sexo");
					sexo = sc.nextLine().toLowerCase();
					System.out.println("Ingresa la nueva carrera carrera");
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
			
//		********************************************************************************************************************************************************
		case 3: 
			System.out.println("Ingresa el nombre del alumno a buscar");
			nombre = sc.nextLine();
			imprimirEncabezado();
			int encontrados = 0;
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getNombre().equals(nombre) && alumnos.get(i) != null ) {
					al = alumnos.get(i);
					encontrados++;
					imprimir(al);	
				}	
			}
			if (encontrados == 0){
				System.err.println("\t\tNo se encontraron coincidencias con ese nombre");
			}
			break;
			
//		********************************************************************************************************************************************************
		case 4: 
//			System.out.println("Ingresa el lugar de procedencia");
//			procedencia = sc.nextLine();
			imprimirEncabezado();
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getProcedencia() != null && alumnos.get(i).getProcedencia() != "" ) {
					al = alumnos.get(i);
					imprimir(al);
				}
			}
			if (alumnos.size() <= 0) {
				imprimirVacio();
			}
	
			break;
		
//		********************************************************************************************************************************************************
		case 5: 
			float promedio = 0;
			int cont = 0;
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getSexo().equals("femenino") || alumnos.get(i).getSexo().equals("mujer") ) {
					cont ++;
					int edad_alumno = alumnos.get(i).getEdad();
					promedio += edad_alumno;
			}
			}
			System.out.println("El promedio es: ");
			if (promedio != 0 || cont != 0) {
				promedio = promedio/cont;
			}
			System.out.println(promedio);
			break;
			
//		********************************************************************************************************************************************************
		case 6:
			System.out.println("Ingresa el nombre del alumno a eliminar");
			nombre = sc.nextLine();
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getNombre().equals(nombre) && alumnos.get(i) != null ) {
					al = alumnos.get(i);
					System.out.println(alumnos.get(i));
					alumnos.remove(i);
				}
			}
			break;
			
//		********************************************************************************************************************************************************
		case 7: 
			imprimirEncabezado();
			for (int i = 0; i < alumnos.size(); i++) {
					imprimir(alumnos.get(i));
			}
			if (alumnos.size() <= 0) {
				imprimirVacio();
			}
	
			break;
//		********************************************************************************************************************************************************
		case 8: 
			System.out.println("Ingresa los datos del alumno a verificar");
			al = pedirDatos();
			System.out.println(alumnos.contains(al) ?
					"El alumno si se encuentra registrado..." 
					: "Alumno no encontrado"); 
			System.out.println("Datos ingresados:");
			imprimirEncabezado();
			imprimir(al);
			
		break;
		
//		********************************************************************************************************************************************************
		case 9: 
			
			System.out.println(alumnos.indexOf(al));
			al = pedirDatos();
			int index = alumnos.indexOf(al);
			System.out.printf("Tu numero de registro es: %d\n", index);
			break;

//		********************************************************************************************************************************************************
		case 10: 

			al = pedirDatos();
			int index2 = alumnos.lastIndexOf(al);
			System.out.printf("Tu numero de registro es: %d\n", index2);
			break;	

//		********************************************************************************************************************************************************
		case 11: 
			if(alumnos.isEmpty()){
				System.out.println(Colores.rojo + "No hay ningun registro hasta ahora" + Colores.reset);
			}
			else {
				System.out.printf("Hay un total de" + Colores.verde + "%d" + Colores.reset, alumnos.size());
			}
			break;
			
//		********************************************************************************************************************************************************
		case 12: 
			System.out.println("Si estas seguro de" + Colores.rojo +" eliminar "+Colores.reset+"TODOS los registros, teclea:");
			System.out.println(Colores.naranja+ "si" + Colores.reset);
			String borrar = sc.nextLine();
			if (borrar.equals("si")) {
				alumnos.clear();
				System.out.println(Colores.rojo + "SE ELIMINARON TODOS LOS REGISTROS" + Colores.reset);
				System.out.println(Colores.naranja + "T.T" + Colores.reset);
				
			}
			break;
			
//		********************************************************************************************************************************************************
		case 13: 
			System.out.println("Ejecucion Finalizada");
			break;
		
		default:
		
		}
		
		
		} while(seleccion != 13);
	
	
	}
	
	
//	=============================================================================================================================================================
	static Alumno pedirDatos() {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		String numeroControl;
		String procedencia;
		String sexo;
		String carrera;		
		System.out.println("Ingresa el nombre");
		nombre = sc.nextLine();
		System.out.println("Ingresa la edad");
		String edadaux = sc.nextLine();
		try {
			edad = Integer.parseInt(edadaux);
		} catch (Exception e) {
			edad = 0;
		}
		System.out.println("Ingresa el numero de control");
		numeroControl = sc.nextLine();
		System.out.println("Ingresa el lugar de procedencia");
		procedencia = sc.nextLine();
		System.out.println("Ingresa el sexo");
		sexo = sc.nextLine().toLowerCase();
		System.out.println("Ingresa la carrera");
		carrera = sc.nextLine();
		Alumno alumno = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);
		
		return alumno;
		
	}
	
//	=============================================================================================================================================================
	static String formato(String dato,String desc) {
		int tam = dato.length();
		int espacio = 0;
		int espacio1 = 0;
		int espacio2 = 0;
		switch (desc) {
		case "nombre":
			espacio = 30-tam;
			break;
		case "edad":
			espacio = 6-tam;
			break;
		case "numeroControl":
			espacio = 18-tam;
			break;
		case "procedencia":
			espacio = 24-tam;
			break;
		case "sexo":
			espacio = 10-tam;
			break;
		case "carrera":
			espacio = 40-tam;
			break;
		case "vacio":
			espacio = 155-tam;
			break;

		default:
			break;
		}
		
		espacio1 = (int) espacio/2;
		espacio2 = espacio-espacio1;
		
		
		for (int j = 0; j < espacio2; j++) {
			dato = " "+ dato;
		}
		for (int i = 0; i < espacio1; i++) {	
			dato = dato + " ";
		}
		return dato;
	}
	
//	=============================================================================================================================================================	
	static void limpiarPantalla() {
		for (int i = 0; i < 24; i++) {
			System.out.println("");
		}
	}
	
//	=============================================================================================================================================================
	static void imprimirEncabezado() {
		System.out.println(Colores.gris +"|=================================+==========+======================+=========="+
				"==================+==============+===========================================|" + Colores.reset);
		
		System.out.printf(Colores.gris + "| " + Colores.reset);
		System.out.printf(Colores.naranja + formato("NOMBRE","nombre") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.naranja + formato("EDAD","edad") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.naranja + formato("NÚMERO DE CONTROL","numeroControl") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.naranja + formato("LUGAR DE PROCEDENCIA","procedencia") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.naranja + formato("SEXO","sexo") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.naranja + formato("CARRERA","carrera") + Colores.reset);
		System.out.printf(Colores.gris + " |\n" + Colores.reset);
		
		System.out.println(Colores.gris + "|=================================+==========+======================+=========="+
				"==================+==============+===========================================|" + Colores.reset);
	}
	
//	=============================================================================================================================================================
	public static void imprimir (Alumno alumno) {
		
		System.out.printf(Colores.gris + "| " + Colores.reset);
		System.out.printf(Colores.verde + formato(alumno.getNombre(),"nombre") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.verde + formato(String.valueOf(alumno.getEdad()),"edad") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.verde + formato(alumno.getNumeroControl(),"numeroControl") + Colores.reset);
		System.out.printf(Colores.gris +"  |  " + Colores.reset);
		System.out.printf(Colores.verde + formato(alumno.getProcedencia(),"procedencia") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.verde + formato(alumno.getSexo(),"sexo") + Colores.reset);
		System.out.printf(Colores.gris + "  |  " + Colores.reset);
		System.out.printf(Colores.verde + formato(alumno.getCarrera(),"carrera") + Colores.reset);
		System.out.printf(Colores.gris + " |\n" + Colores.reset);
		System.out.println(Colores.gris + "|··············································································"+
				"·············································································|" + Colores.reset);

	}
	
	static void imprimirVacio() {
		System.out.printf(Colores.gris + "|" + Colores.reset );
		System.out.printf(Colores.rojo + formato("NO SE ENCONTRARON DATOS", "vacio") + Colores.reset );
		System.out.println(Colores.gris + "|" + Colores.reset );
		
		System.out.println(Colores.gris + "|=============================================================================="+
				"=============================================================================|" + Colores.reset);
	}
	
	public class Colores {
		
	    public static final String verde = "\u001B[32m";
	    public static final String azul = "\u001B[34m";
	    public static final String morado = "\u001B[35m";
	    public static final String naranja = "\u001B[33m";
	    public static final String rojo = "\u001B[31m"; 
	    public static final String gris = "\u001B[90m"; 
	    public static final String reset = "\u001B[0m";
	    
	    
	}
	
	}
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

