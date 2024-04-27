package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Principal.Colores;

public class Principal {
	public static void main(String[] args) {
		
		Map<String, Alumno> alumnos = new HashMap<>();
		
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
			if (seleccion > 0 && seleccion <= 10) {
				System.out.println("Presiona ENTER para continuar");
				sc.nextLine();
				limpiarPantalla();
			}
			menu();
			System.out.println(Colores.morado + "Selecciona una opcion" + Colores.reset);
			String s = sc.nextLine();
			
			try {
				seleccion = Integer.parseInt(s.replace(" ", ""));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Colores.rojo + "Opcion invalida, ingresa una opcion valida un valor ente 1 y 8" + Colores.reset);
				seleccion = 14;
			}
			
//			********************************************************************************************************************************************************
			switch (seleccion) {
//			********************************************************************************************************************************************************
			case 1:
				al = pedirDatos();
				alumnos.put(al.getNombre(), al);
				System.out.println(Colores.verde + "Datos ingresados correctamente" + Colores.reset);
				break;
				
//			********************************************************************************************************************************************************
			case 2:
				System.out.println("Ingresa el nombre del alumno");
				nombre = sc.nextLine();
				al = buscar(nombre,alumnos);
				imprimirEncabezado();
				imprimir(al);	
				break;
				
//			********************************************************************************************************************************************************
			case 3:
				System.out.println("Ingresa el nombre del alumno para editar sus datos");
                nombre = sc.nextLine();
                al = buscar(nombre, alumnos);
                if (al != null) {
                    editar(nombre, alumnos);
                }
                al = buscar(nombre, alumnos);
                imprimirEncabezado();
                imprimir(al);
				
				
				break;
//			********************************************************************************************************************************************************
			case 4:
				imprimirEncabezado();
				for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
		            Alumno alumno = entry.getValue();
		            if (alumno.getProcedencia() != null && !alumno.getProcedencia().isEmpty()) {
		                imprimir(alumno);
		            }
		        }
				break;
				
//			********************************************************************************************************************************************************
			case 5:
				float promedio = 0;
				int cont = 0;
				
				for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
		            Alumno alumno = entry.getValue();
		            if (alumno.getSexo() != null && !alumno.getSexo().isEmpty() && alumno.getSexo().equals("femenino")) {
		            	cont++;
		            	promedio += alumno.getEdad();
		            }
		        }
				System.out.println("El promedio es: ");
				if (promedio != 0 || cont != 0) {
					promedio = promedio/cont;
				}
				System.out.println(promedio);
				
				break;
//			********************************************************************************************************************************************************
			case 6:
				System.out.println("Ingresa el nombre del alumno a eliminar");
				nombre = sc.nextLine();
				
				al = buscar(nombre, alumnos);
				if (al != null) {
					System.out.println("Datos del alumno");
					imprimirEncabezado();
					imprimir(al);
					if (eliminar()) {
						alumnos.remove(nombre);
					}
				}
				else {
					imprimirVacio();
				}
				
				break;
//			********************************************************************************************************************************************************
			case 7:			
				imprimirEncabezado();
				 for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
					 imprimir(entry.getValue());
				 }
				 if (alumnos.size() <= 0) {
					imprimirVacio();
				}
				
				break;
//			********************************************************************************************************************************************************
			case 8:
				if(alumnos.isEmpty()){
					System.out.println(Colores.rojo + "No hay ningun registro hasta ahora" + Colores.reset);
				}
				else {
					System.out.printf("Hay un total de " + Colores.verde + "%d registros\n" + Colores.reset, alumnos.size());
				}
				
				break;
//			********************************************************************************************************************************************************
			case 9:
				if (alumnos.size() > 0) {
					System.out.println("Estas a punto de eliminar " +
							Colores.rojo + "TODOS"+Colores.reset + " los registros");
					if (eliminar()) {
						alumnos.clear();
					}
		
					else {
						System.out.println("Que bueno que te arrepentiste");
					}
				}
				else {
					System.out.println("No hay datos a borrar");
				}
				break;
				
//			********************************************************************************************************************************************************
			case 10:
				System.out.println("Ejecucion Finalizada");
				break;
				
//			********************************************************************************************************************************************************
			case 11:
				System.out.println("");
				break;

			default:
				seleccion = 11;
				break;
			}
			
		} while (seleccion != 10);
		
	}
	
	
//	=============================================================================================================================================================
	static void menu() {
		System.out.println("---------------MENU------------");
		System.out.println("1.- Agregar");
		System.out.println("2.- Buscar por nombre");
		System.out.println("3.- Editar por nombre");
		
		System.out.println("4.- Mostrar todos los que tengan una escuela de procedencia");
		System.out.println("5.- Calcular el promedio de las mujeres");
		System.out.println("6.- Eliminar por nombre");
		System.out.println("7.- Mostrar todos");
		System.out.println("8.- Checar numero de registros");
		System.out.println("9.- Eliminar todos los registros");
		System.out.println("10.- Salir");
		
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
	static  Alumno buscar(String nombre, Map<String, Alumno> alumnos) {
		return  alumnos.get(nombre);
	}
//	=============================================================================================================================================================
	static void editar(String nombre, Map<String, Alumno> alumnos) {
		Alumno alumno = pedirDatos();
	    Alumno alumno_editar = alumnos.get(nombre);
	    if (alumno_editar != null) {
	    	alumno_editar.setNombre(alumno.getNombre());
	        alumno_editar.setEdad(alumno.getEdad());
	        alumno_editar.setNumeroControl(alumno.getNumeroControl());
            alumno_editar.setProcedencia(alumno.getProcedencia());
            alumno_editar.setSexo(alumno.getSexo());
            alumno_editar.setCarrera(alumno.getCarrera());
            System.out.println("Datos del alumno editados exitosamente.");
            } else {
            	System.out.println("No se encontró ningún alumno con el nombre: " + nombre);
            }
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
		
		if (alumno != null) {
		
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
		else {
			imprimirVacio();;
		}

	}
//	=============================================================================================================================================================
	static void imprimirVacio() {
		System.out.printf(Colores.gris + "|" + Colores.reset );
		System.out.printf(Colores.rojo + formato("NO SE ENCONTRARON DATOS", "vacio") + Colores.reset );
		System.out.println(Colores.gris + "|" + Colores.reset );
		
		System.out.println(Colores.gris + "|=============================================================================="+
				"=============================================================================|" + Colores.reset);
	}
	
//	=============================================================================================================================================================
	static boolean eliminar() {
		System.out.println("Si quieres continuar con la " + Colores.rojo + "eliminacion" + Colores.reset + ", teclea:");
		System.out.println(Colores.naranja + "si" + Colores.reset);
		Scanner sc = new Scanner(System.in);
		String confirmacion = sc.nextLine();
		if (confirmacion.equals("si")) {
			return true;
		}
		return false;
	}
	
//	=============================================================================================================================================================
	public class Colores {
		public static final String verde = "\u001B[32m";
	    public static final String azul = "\u001B[34m";
	    public static final String morado = "\u001B[35m";
	    public static final String naranja = "\u001B[33m";
	    public static final String rojo = "\u001B[31m"; 
	    public static final String gris = "\u001B[90m"; 
	    public static final String reset = "\u001B[0m";
	}

//=============================================================================================================================================================	
	static void limpiarPantalla() {
		for (int i = 0; i < 24; i++) {
			System.out.println("");
		}
	}
}

