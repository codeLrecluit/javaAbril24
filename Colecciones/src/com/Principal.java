package com;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        List<Alumnos> alumnos = new ArrayList<Alumnos>();
        String nombre;
        int edad;
        String numeroControl;
        String procedencia;
        String sexo;
        String carrera;
        Scanner sc = new Scanner(System.in);
        int seleccion = 0;
        Alumnos al = null;
        List<Alumnos> procd = new ArrayList<Alumnos>();
        int sumatoriaEdades = 0;
        int mujeres = 0;
        double promedio = 0.0;

        do {
            System.out.println("-------------Menu--------------");
            System.out.println("1-Agregar");
            System.out.println("2-Editar");
            System.out.println("3-Buscar por nombre");
            System.out.println("4-Mostrar todos los que tengan una escuela de procedencia");
            System.out.println("5-Calcula la edad promedio de las mujeres");
            System.out.println("6-Eliminar por nombre");
            System.out.println("7-Mostrar todos");
            System.out.println("8-Contains");
            System.out.println("9-IndexOf");
            System.out.println("10-LastIndexOf");
            System.out.println("11-Empty");
            System.out.println("12-Clear");
            System.out.println("0-Salir");
            System.out.println("Selecciona una opcion");
            seleccion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después de leer el número

            switch (seleccion) {

                case 1:
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
                    al = new Alumnos(nombre, edad, numeroControl, procedencia, sexo, carrera);

                    // Añado a la lista el objeto que acabo de crear
                    alumnos.add(al);
                    break;

                case 2:
                    System.out.println("Ingresa el nombre del alumno buscado");
                    sc.nextLine(); // Consumir el salto de línea antes de leer el nombre
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
                    System.out.println("Ingresa el nombre del alumno buscado");
                    sc.nextLine(); // Consumir el salto de línea antes de leer el nombre
                    nombre = sc.nextLine();
                    for (int i = 0; i < alumnos.size(); i++) {
                        // Si el nombre del alumno actual coincide con el buscado ....
                        if (alumnos.get(i).getNombre().equals(nombre)) {
                            al = alumnos.get(i); //Ya lo encontré
                            break;
                        }
                    }

                    if (al != null) { //Comprobar el contenido de la variable al
                        System.out.println(al);
                    } else {
                        System.out.println("El alumno no existe");
                    }

                    break;

                case 4:
                    System.out.println("Ingresa la procedencia buscada");
                    sc.nextLine(); // Consumir el salto de línea antes de leer la procedencia
                    procedencia = sc.nextLine();
                    //Itera
                    for (int i = 0; i < alumnos.size(); i++) {
                        // Si la procedencia del alumno actual coincide con la buscada ....
                        if (alumnos.get(i).getProcedencia().equals(procedencia)) {
                            procd.add(alumnos.get(i));
                        }
                    }
                    System.out.println(procd);
                    break;

                case 5:
                    for (int i = 0; i < alumnos.size(); i++) {
                        // Si la procedencia del alumno actual coincide con la buscada ....
                        if (alumnos.get(i).getSexo().equals("femenino")) {
                            mujeres++;
                            sumatoriaEdades = sumatoriaEdades + alumnos.get(i).getEdad();
                        }
                    }

                    promedio = (double) sumatoriaEdades / mujeres; // Casting a double para obtener el resultado correcto
                    System.out.println("Promedio: " + promedio);

                    break;

                case 6:
                    System.out.println("Ingresa el nombre del alumno buscado");
                    sc.nextLine(); // Consumir el salto de línea antes de leer el nombre
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
                        System.out.println(alumnos.get(i));
                    }
                    break;

                case 8:
                    System.out.println("Ingresa el nombre a buscar:");
                    sc.nextLine(); // Consumir el salto de línea antes de leer el nombre
                    nombre = sc.nextLine();
                    boolean encontrado = false;
                    for (Alumnos alumno : alumnos) {
                        if (alumno.getNombre().contains(nombre)) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("El nombre '" + nombre + "' se encuentra en la lista de alumnos.");
                    } else {
                        System.out.println("El nombre '" + nombre + "' no se encuentra en la lista de alumnos.");
                    }
                    break;
                      case 9:
                    System.out.println("Ingresa el nombre a buscar:");
                    sc.nextLine(); // Consumir el salto de línea antes de leer el nombre
                    nombre = sc.nextLine();
                    int index = -1;
                    for (int i = 0; i < alumnos.size(); i++) {
                        if (alumnos.get(i).getNombre().equals(nombre)) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        System.out.println("El nombre '" + nombre + "' se encuentra en la posición " + index + " de la lista de alumnos.");
                    } else {
                        System.out.println("El nombre '" + nombre + "' no se encuentra en la lista de alumnos.");
                    }
                    break;

                case 10:
                    System.out.println("Ingresa el nombre a buscar:");
                    sc.nextLine(); // Consumir el salto de línea antes de leer el nombre
                    nombre = sc.nextLine();
                    int lastIndex = -1;
                    for (int i = 0; i < alumnos.size(); i++) {
                        if (alumnos.get(i).getNombre().equals(nombre)) {
                            lastIndex = i;
                        }
                    }
                    if (lastIndex != -1) {
                        System.out.println("El nombre '" + nombre + "' se encuentra en la última posición " + lastIndex + " de la lista de alumnos.");
                    } else {
                        System.out.println("El nombre '" + nombre + "' no se encuentra en la lista de alumnos.");
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
                    System.out.println("Se ha eliminado todos los elementos de la lista de alumnos.");
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida del menú.");
                    break;
            }

        } while (seleccion != 0);

        sc.close();
    }
}