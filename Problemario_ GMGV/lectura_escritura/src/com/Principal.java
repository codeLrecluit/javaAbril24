package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

    // Método para convertir un número de día a texto
    public static String convertirDia(int dia) {
        String[] dias = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
                "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete",
                "veintiocho", "veintinueve", "treinta", "treinta y uno"};
        return dias[dia];
    }

    // Método para convertir un número de mes a texto
    public static String convertirMes(int mes) {
        String[] meses = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre"};
        return meses[mes];
    }

    // Método para convertir un número de año a texto
    public static String convertirAnio(int anio) {
        return Integer.toString(anio);
    }

    public static void main(String[] args) {

        File file = new File("C:\\Users\\gmgv_\\OneDrive\\Desktop\\lectura.txt");
        File escritura = new File("C:\\Users\\gmgv_\\OneDrive\\Desktop\\escritura.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea;           

            while ((linea = br.readLine()) != null) {
                // Extraer día, mes y año de la línea
                int dia = Integer.parseInt(linea.substring(0, 2));
                int mes = Integer.parseInt(linea.substring(2, 4));
                int anio = Integer.parseInt(linea.substring(4, 8));

                // Convertir los números a texto utilizando los métodos definidos
                String diaTexto = convertirDia(dia);
                String mesTexto = convertirMes(mes);
                String anioTexto = convertirAnio(anio);
                
                System.out.println(linea);

                // Escribir en el archivo de salida
                FileWriter fw = new FileWriter(escritura,true);
                fw.write(diaTexto + " de " + mesTexto + " de " + anioTexto + "\n");                
                fw.close();
            }
            
            System.out.println("Se ha editado el archivo escritura.txt");
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("¿Qué intentas realizar?");
        }
    }
}
