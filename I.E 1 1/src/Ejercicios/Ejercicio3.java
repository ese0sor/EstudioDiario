package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int num, cont=0;
		
		System.out.println("Introduce un número entre el 1 y el 100");
		do {
			num = Integer.parseInt(entrada.readLine());
			if (num<1 || num>100) {
				System.out.println("Por favor, introduce un número entre el 1 y el 100");
			}
		} while (num<=1 || num>=100);
		
		for (int h = 2; h < num; h++) {
			for (int i = 1; i <= h; i++) {
				if (h%i==0) {
					cont = cont+1;
				}
			}
			if (cont==2) {
				System.out.println("El número " + h + " es primo.");
			}
			cont=0;
		}
	}

}

