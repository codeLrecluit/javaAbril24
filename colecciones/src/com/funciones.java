package com;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class funciones {
	List<Alumno> alumnos = new ArrayList<Alumno>();
	List<Alumno> procedenciaList = new ArrayList<Alumno>();
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
	void menu() {
		System.out.println("---------------Menu--------------");
		System.out.println("1 Agregar");
		System.out.println("2 Editar");
		System.out.println("3 Buscar por nombre");
		System.out.println("4 Mostrar todos los que tengan una escuela de procedencia");
		System.out.println("5 Calcula la edad promedio de las mujeres");
		System.out.println("6 Eliminar alumno por nombre");
		System.out.println("7 Mostrar todos");
		System.out.println("Salir");
		System.out.println("-----------Selecciona----------");
	}
	
	void agregarAlumno() {
		
		System.out.println("Dame nombre");
		nombre = sc.next();
		System.out.println("Dame el numero de control");
		numeroControl = sc.next();
		System.out.println("Dame la procedencia");
		procedencia= sc.next();
		System.out.println("Ingresa el sexo");
		sexo = sc.next();
		System.out.println("Ingresa la carrera");
		carrera = sc.next();
		System.out.println("Ingresa la edad");
		edad = sc.nextInt();
		Alumno al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);
		alumnos.add(al);
	}
	
	void editar(String nombre) {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}
		for (int i = 0; i < alumnos.size() ; i++) {
			if (alumnos.size()==0) {
				System.out.println("No hay alumnos que editar");
				break;
			}
//			if (alumnos.get(i).getNombre().equals(nombre)) {
			if (alumnos.get(i).getNombre().contains(nombre)) {
				System.out.println("Dame nombre nuevo");
				nombre = sc.next();
				System.out.println("Dame el numero de control nuevo");
				numeroControl = sc.next();
				System.out.println("Dame la procedencia nuevo");
				procedencia= sc.next();
				System.out.println("Ingresa el sexo nuevo");
				sexo = sc.next();
				System.out.println("Ingresa la carrera nuevo");
				carrera = sc.next();
				System.out.println("Ingresa la edad nuevo");
				edad = sc.nextInt();
				
				alumnos.get(i).setNombre(nombre);
				alumnos.get(i).setEdad(edad);
				alumnos.get(i).setNumeroControl(numeroControl);
				alumnos.get(i).setSexo(sexo);
				alumnos.get(i).setProcedencia(procedencia);
				alumnos.get(i).setCarrera(carrera);
				break;
			}
		}
		System.out.println("No se encontro");
	}
	
	void buscarAlumnoNombre(String nombre) {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(nombre)) {
				Alumno al = alumnos.get(i);
				System.out.println(al);
				break;
			}
		
		}
		System.out.println("No se encontro");
	}
	
	void mostrarAlumnosProcedencia(String procedencia) {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}
		for (int i = 0; i < alumnos.size(); i++) {	
			if (alumnos.get(i).getProcedencia().equals(procedencia)) {
				procedenciaList.add(alumnos.get(i));
			}
		}
		System.out.println(procedenciaList);
	}
	
	void calcularPromMujeres()
	{
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}
		
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getSexo().equals("F")) {
//			if (alumnos.get(i).getSexo().indexOf(0)) {
				mujeres++;
				sumaEdades+= alumnos.get(i).getEdad();
			}
		}
		
		promedio = sumaEdades/mujeres;
		if (sumaEdades==0 && mujeres==0) {
			System.out.println("Error matematico");
		}
		else {
			System.out.println("Promedio "+promedio);
		}
		
	}

	void eliminarAlumno(String nombre) {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equals(nombre)) {
				alumnos.remove(i);
				// Clear aqui borraria toda la lista
				break;
			}
		}
	}
	
	void mostrarAlumnos() {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i));
		}
	}
}
