package com;
import java.util.ArrayList;
import java.util.List;

public class Clear {
	public static void main(String[] args) {
		//Méotodo clear: es utilizado para eliminar todos los elementos de una estructura de datos mutable, como una colección (Listas, Conjuntos, Mapas) en Java. Este método es muy útil cuando deseas reutilizar una colección existente sin la necesidad de crear una nueva, eliminando todos los elementos actuales para que la colección esté vacía.
		
		List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        System.out.println("Lista antes de clear(): " + lista);  // Imprime [Manzana, Banana, Cereza]

        // Limpiar la lista
        lista.clear();

        System.out.println("Lista después de clear(): " + lista);  // Imprime []
		
	}
}
