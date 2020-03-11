package Mochila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gengar {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	int array[];
	
//*****************************METODOS PARA ARRAY***********************************************************************
	
	public void crearArrayLleno(int num) {
		array=new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) (Math.random()*10+1);
		}
	}
	
	public void imprimirArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void modificarInteriorArray() throws NumberFormatException, IOException {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Cambia el valor de la posicion " + (i+1));
			array[i]=Integer.parseInt(teclado.readLine());
		}
	}
	
	public void sumarYMediaArray() {
		int suma=0;
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			suma=array[i]+suma;
			cont++;
		}
		System.out.println("El sumatorio del array es: " + suma + 
				"\nLa media del array es: " + suma/cont);
	}
//**********************************************************************************************************************
}
