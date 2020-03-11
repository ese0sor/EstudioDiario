package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, opt;
		double aux;
		
		System.out.println("Introduce dos números por teclado");
		
		a = Integer.parseInt(entrada.readLine());
		b = Integer.parseInt(entrada.readLine());
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1. Sumar los números");
			System.out.println("2. Restar los números");
			System.out.println("3. Multiplicar los números");
			System.out.println("4. Dividir los números");
			System.out.println("5. Salir del programa");
			opt = Integer.parseInt(entrada.readLine());
			
			if (opt>=1 && opt<=5) {
				switch (opt) {
				case 1:
						aux = a+b;
						System.out.println("Resultado suma: " + aux);
						aux=0;
						System.out.println("");
					break;

				case 2:
						aux = a - b;
						System.out.println("Resultado resta: " + aux);
						aux=0;
						System.out.println("");
					break;
					
				case 3:
						aux=a*b;
						System.out.println("Resultado multiplicación: " + aux);
						aux=0;
						System.out.println("");
					break;
					
				case 4:
						if (b==0) {
							System.out.println("No se puede dividir entre 0, introduzca otro valor");
							b=Integer.parseInt(entrada.readLine());
						}else {
							aux=a/b;
							System.out.println("Resultado división: " + aux);
							aux=0;
							System.out.println("");
						}
					break;
				}
			}else {
				System.out.println("Ha introducido un número fuera del rango.");
			}
		} while (opt!=5);
		System.out.println("Gracias.");
	}

}
