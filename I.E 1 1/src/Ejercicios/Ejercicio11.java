package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Ejercicio11 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, divA=0, divB=0;
		char salir;
		
		do {
			System.out.println("¿Qué números son amigos?");
			a = Integer.parseInt(entrada.readLine());
			b = Integer.parseInt(entrada.readLine());
			for (int i = 1; i < a/2; i++) {
				if (a%i==0) {
					divA = divA + i;
				}
			}
			for (int i = 1; i < b/2; i++) {
				if (a%b==0) {
					divB = divB + i;
				}
			}
			if (divA == b && divB == a) {
				System.out.println("Los números son amigos.");
			}else {
				System.out.println("Los números no son amigos.");
			}
			System.out.println("¿Desea salir?");
			salir = (char) entrada.read();
		} while (salir!='s');
	}
}
