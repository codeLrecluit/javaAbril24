package com;

public class Principal {
	
	public static void main(String[] args) {
		
		int horas;
		int minutos;
		int segundos;		
        
        // Bucle para las horas
        for(horas = 0; horas < 24; horas++) {
            
            // Bucle para los minutos
            for(minutos = 0; minutos < 60; minutos++) {
                
                // Bucle para los segundos
                for(segundos = 0; segundos < 60; segundos++) {
                    
                    // Formatear las horas, minutos y segundos con ceros a la izquierda si son menores que 10
                    String hora_actual = String.format("%02d", horas);
                    String minuto_actual = String.format("%02d", minutos);
                    String segundo_actual = String.format("%02d", segundos);
                    
                    // Imprimir la hora actual
                    System.out.println(hora_actual + ":" + minuto_actual + ":" + segundo_actual);
                }
            }
        }

	}

}
