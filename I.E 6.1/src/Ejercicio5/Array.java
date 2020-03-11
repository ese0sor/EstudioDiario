package Ejercicio5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Array {
	
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	int array[];
	
	public void crearArrayRelleno(int huecos) {
		
		array = new int[huecos];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) (Math.random()*100+1);
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void mayorArray() {
		
		int mayor=0;
		
		this.crearArrayRelleno(20);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>=mayor) {
				mayor=array[i];
			}
		}
		
		System.out.println("El mayor de todos es " + mayor);
	}
}
