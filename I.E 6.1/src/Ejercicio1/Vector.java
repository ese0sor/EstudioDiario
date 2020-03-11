package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vector {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	int vector[];
	
	public void crearArrayRelleno(int huecos) {
	
		vector = new int[huecos];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int) (Math.random()*10+1);
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}
	
	public void cambiarValoresLeidos() throws NumberFormatException, IOException {
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=Integer.parseInt(teclado.readLine());
		}
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}
}
