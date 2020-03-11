package Clase;

import java.lang.reflect.Array;

public class TeoriaArray {

	public static void main(String[] args) {
		
		// Teoria sobre los Array:

		/*Un array representa un recipiente dividido en diferentes cajas, en las cuales, en cada una
		de ellas puedes guardar información o objetos*/
		
		//	**Declaración de un Array**
			
			int nombre_array[];				//Declaramos el tipo de dato del array
		
			nombre_array = new int[5];		//Intanciamos el array
			
		// "nombre_array" nos daria algo parecido a esta mochila 
			
		//	 | posicion=0 | posicion=1 | posicion=2 | posicion=3 | posicion=4 |
			
		// **LLenamos las pequeñas cajas del array**
			
			nombre_array[0]=24;
			nombre_array[1]=10;
			nombre_array[2]=8;				//En cada hueco del array introducimos la información
			nombre_array[3]=78;
			nombre_array[4]=11;
			
		// **Acceder a una de las cajas**
			
			int num = nombre_array[2];
			
		// **Imprimir una caja del array**
			
			System.out.println(nombre_array[2]);
			
		// **Recorrer un array**
			
			for (int x=0;x<nombre_array.length;x++) {
				System.out.println(nombre_array[x]);
			}
	}

}
