package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int nota;
		
		System.out.println("Introduce un número.");
		do {
			nota = Integer.parseInt(entrada.readLine());
			if (nota<0 || nota>10) {
				System.out.println("Introduce una nota entre 1 y 10, por favor");
			}
			
		} while (nota<0 || nota>10);
		if (nota>=0 && nota<=4) {
			System.out.println("Suspenso");
		}else if (nota>=5 && nota<=6) {
			System.out.println("Bien");
		}else if (nota>=7 && nota<=8) {
			System.out.println("Notable");
		}else if (nota>=8 && nota<=10){
			System.out.println("Sobresaliente");
			}
	}

}
