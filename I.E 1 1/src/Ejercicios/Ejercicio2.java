package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int resto;
		double num;
		
		do {
			System.out.println("Introduce un número de 4 cifras");
			num = Double.parseDouble(entrada.readLine());
		} while (num<=1000 || num>=9999);
		
		num = num/1000;
		
		for (int i = 0; i < 4; i++) { 
			resto = (int)num;
			num = num-resto;
			num = num*10;
			if (i==0) {
				System.out.println("La primera cifra es " + resto);
			}else if (i==1) {
				System.out.println("La segunda cifra es " + resto);
			}else if (i==2) {
				System.out.println("La tercera cifra es " + resto);
			}else {
				System.out.println("La cuarta cifra es " + resto);
			}
		}
	}
}
