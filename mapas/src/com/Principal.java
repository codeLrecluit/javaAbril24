package com;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Map<String, Alumno> alumnos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int edad;
        String numeroControl;
        String procedencia;
        String sexo;
        String carrera;
        int seleccion = 0;
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
            System.out.print("Selecciona una opción: ");
            seleccion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (seleccion) {
                case 1:
                    System.out.print("Ingresa el nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingresa la edad: ");
                    edad = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("Ingresa el número de control: ");
                    numeroControl = sc.nextLine();
                    System.out.print("Ingresa la procedencia: ");
                    procedencia = sc.nextLine();
                    System.out.print("Ingresa el sexo: ");
                    sexo = sc.nextLine();
                    System.out.print("Ingresa la carrera: ");
                    carrera = sc.nextLine();

                    Alumno al = new Alumno(nombre, edad, numeroControl, procedencia, sexo, carrera);
                    alumnos.put(numeroControl, al);
                    break;

                case 2:
                    System.out.println("Ingresa el número de control a buscar: ");
                    numeroControl = sc.nextLine();
                    Alumno alumnoEditar = alumnos.get(numeroControl);
                    if (alumnoEditar != null) {
                        System.out.println("Ingresa la nueva información del alumno:");
                        System.out.print("Ingresa la edad: ");
                        edad = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer de entrada
                        System.out.print("Ingresa la procedencia: ");
                        procedencia = sc.nextLine();
                        System.out.print("Ingresa el sexo: ");
                        sexo = sc.nextLine();
                        System.out.print("Ingresa la carrera: ");
                        carrera = sc.nextLine();
                        alumnoEditar.setEdad(edad);
                        alumnoEditar.setProcedencia(procedencia);
                        alumnoEditar.setSexo(sexo);
                        alumnoEditar.setCarrera(carrera);
                        alumnos.put(numeroControl, alumnoEditar);
                    } else {
                        System.out.println("El alumno con número de control " + numeroControl + " no existe.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el nombre a buscar: ");
                    nombre = sc.nextLine();
                    Alumno alumnoBuscar = null;
                    for (Alumno alumno : alumnos.values()) {
                        if (alumno.getNombre().equals(nombre)) {
                            alumnoBuscar = alumno;
                            break;
                        }
                    }
                    if (alumnoBuscar != null) {
                        System.out.println(alumnoBuscar);
                    } else {
                        System.out.println("El alumno no existe");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa la procedencia: ");
                    procedencia = sc.nextLine();
                    for (Alumno alumno : alumnos.values()) {
                        if (alumno.getProcedencia().equals(procedencia)) {
                            System.out.println(alumno);
                        }
                    }
                    break;

                case 5:
                    for (Alumno alumno : alumnos.values()) {
                        if (alumno.getSexo().equalsIgnoreCase("femenino")) {
                            mujeres++;
                            sumatoriaEdades += alumno.getEdad();
                        }
                    }
                    if (mujeres > 0) {
                        promedio = (double) sumatoriaEdades / mujeres;
                        System.out.println("Promedio edad de las mujeres: " + promedio);
                    } else {
                        System.out.println("No hay mujeres en la lista.");
                    }
                    break;

                case 6:
                    System.out.println("Ingresa el nombre del alumno a eliminar");
                    nombre = sc.nextLine();
                    Alumno alumnoEliminar = null;
                    for (Alumno alumno : alumnos.values()) {
                        if (alumno.getNombre().equals(nombre)) {
                            alumnoEliminar = alumno;
                            break;
                        }
                    }
                    if (alumnoEliminar != null) {
                        alumnos.remove(alumnoEliminar.getNumeroControl());
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("El alumno no existe.");
                    }
                    break;

                case 7:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (Alumno alumno : alumnos.values()) {
                            System.out.println(alumno);
                        }
                    }
                    break;

                case 8:
                    System.out.print("Ingresa la carrera a buscar: ");
                    carrera = sc.nextLine();
                    boolean encontrado = false;
                    for (Alumno alumno : alumnos.values()) {
                        if (alumno.getCarrera().equalsIgnoreCase(carrera)) {
                            System.out.println(alumno);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron alumnos en la carrera " + carrera);
                    }
                    break;

                case 9:
                    alumnos.clear();
                    System.out.println("Todos los alumnos han sido eliminados.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (seleccion > 0 && seleccion < 10);
    }
}
