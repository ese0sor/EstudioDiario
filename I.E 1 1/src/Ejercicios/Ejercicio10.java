package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random(System.currentTimeMillis());
		
		int num, a, cont=0;
		
		num = random.nextInt(100)+1;
		System.out.println("Número secreto: " + num);
		
		do {
			System.out.println("Adivina el número.");
			a = Integer.parseInt(entrada.readLine());
			if (num>a) {
				System.out.println("Sube más.");
				cont = cont++;
			}else if(num<a){
				System.out.println("Baja más.");
				cont = cont++;
			}else {
				System.out.println("¡Enhorabuena! Has conseguido acertar el número.");
			}
		} while (num!=a);
	}

}