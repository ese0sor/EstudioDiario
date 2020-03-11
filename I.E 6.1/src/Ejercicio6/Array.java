package Ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	int array[];
	
	public void crearArrayRelleno(int huecos) {
			
			array = new int[huecos];
			
			for (int i = 0; i < array.length; i++) {
				array[i]=(int) (Math.random()*100+1);
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	
	public void cuantasVeces() throws NumberFormatException, IOException {
		
		int cont=0;
		int num;
		
		this.crearArrayRelleno(25);
		
		System.out.println("Dime que número busco.");
		num=Integer.parseInt(teclado.readLine());
		
		for (int i = 0; i < array.length; i++) {
			if (num==array[i]) {
				cont++;
			}
		}
		
		System.out.println("El número " + num + " aparece " + cont + " veces.");
	}


}
