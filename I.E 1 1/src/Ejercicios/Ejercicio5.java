package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int num, pos=0, Cpos=0, neg=0, Cneg=0, cero=0;
		
		for (int i = 1; i <= 10; i++) {
			num = Integer.parseInt(entrada.readLine());
			if (num>0) {
				pos = pos+num;
				Cpos = Cpos++;
			}else if (num<0) {
				neg = neg+num;
				Cneg = Cneg++;
			}else {
				cero = cero++;
			}
		}
		System.out.println("Media positivos: " + pos/Cpos);
		System.out.println("Media negativos: " + neg/Cneg);
		System.out.println("Número de ceros: " + cero);
	}
}