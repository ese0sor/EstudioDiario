package Ejercicios;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ejercicio1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));	
		DecimalFormat formato = new DecimalFormat("#.00");
		
		double media=0, nota=0;
		//Programacion
		do {
			System.out.println("Por favor, introduce la nota de Programación");
			nota = Double.parseDouble(entrada.readLine());
			if (nota >= 0 && nota <= 10) {
				media = media + nota;
			}else {
				System.out.println("La nota no puede ser menor de 0 o mayor de 10");
			}
		} while (nota<=0 && nota>=10);
		//Lenguaje de Marcas
		do {
			System.out.println("Por favor, introduce la nota de Lenguaje de Marcas");
			nota = Double.parseDouble(entrada.readLine());
			if (nota >= 0 && nota <= 10) {
				media = media + nota;
			}else {
				System.out.println("La nota no puede ser menor de 0 o mayor de 10");
			}
		} while (nota<=0 && nota>=10);
		//Base de Datos
		do {
			System.out.println("Por favor, introduce la nota de Base de Datos");
			nota = Double.parseDouble(entrada.readLine());
			if (nota >= 0 && nota <= 10) {
				media = media + nota;
			}else {
				System.out.println("La nota no puede ser menor de 0 o mayor de 10");
			}
		} while (nota<=0 && nota>=10);
		//Entorno de Desarrollo
		do {
			System.out.println("Por favor, introduce la nota de Entorno de Desarrollo");
			nota = Double.parseDouble(entrada.readLine());
			if (nota >= 0 && nota <= 10) {
				media = media + nota;
			}else {
				System.out.println("La nota no puede ser menor de 0 o mayor de 10");
			}
		} while (nota<=0 && nota>=10);
		//Sistema Informaticos
		do {
			System.out.println("Por favor, introduce la nota de Sistemas Informaticos");
			nota = Double.parseDouble(entrada.readLine());
			if (nota >= 0 && nota <= 10) {
				media = media + nota;
			}else {
				System.out.println("La nota no puede ser menor de 0 o mayor de 10");
			}
		} while (nota<=0 && nota>=10);
		//FOL
		do {
			System.out.println("Por favor, introduce la nota de FOL");
			nota = Double.parseDouble(entrada.readLine());
			if (nota >= 0 && nota <= 10) {
				media = media + nota;
			}else {
				System.out.println("La nota no puede ser menor de 0 o mayor de 10");
			}
		} while (nota<=0 && nota>=10);
		
		System.out.println("La nota media es de " + formato.format(media/6));
	}
//hola
	
}
