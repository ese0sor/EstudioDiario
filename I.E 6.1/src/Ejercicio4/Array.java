package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	int array[];
	
	public void rellenarArrayMult3(int huecos) throws NumberFormatException, IOException {
		
		array = new int[huecos];
		int num;
		
		for (int i = 0; i < array.length; i++) {
			do {
				System.out.println("Introduce números multiplos de 3");
				num = Integer.parseInt(teclado.readLine());
				if (num%3!=0) {
					do {
						System.out.println("Tiene que ser un numero multiplo de 3");
						num=Integer.parseInt(teclado.readLine());
					} while (num%3!=0);
					array[i]=num;
				}else {
					array[i]=num;
				}
			} while (array.length!=huecos);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
