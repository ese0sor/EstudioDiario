package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int suma_par=0, suma_impar=0;
		
		for (int par = 1; par <= 100; par++) {
			if (par%2==0) {
				suma_par = suma_par + par;
			}else {
				suma_impar = suma_impar + par;
			}
			
		}
		
		System.out.println("Suma pares: " + suma_par);
		System.out.println("SUma impares: " + suma_impar);

	}

}
