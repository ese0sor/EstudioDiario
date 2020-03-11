package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int num, cont=0;
		
		System.out.println("Introduce un número");
		
		do {
			num = Integer.parseInt(entrada.readLine());
			if (num<=0) {
				System.out.println("Introduce un número mayor que 0");
			}
		} while (num<=0);
		
		for (int i = 0; i < num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				cont = cont+1;
			}
		}
		System.out.println("Multiplos de 3 encontrados: " + cont);

	}

}
