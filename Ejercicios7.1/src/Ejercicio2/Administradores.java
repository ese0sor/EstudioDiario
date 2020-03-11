package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administradores extends Usuario {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	private int postBasura;
	private int numBaneos;
	
	Administradores(){
		
	}
	
	Administradores(int numMensaje, String email, String nick){
		super(numMensaje, email, nick);
		this.postBasura=0;
		this.numBaneos=0;
	}

	public int getPostBasura() {
		return postBasura;
	}

	public void setPostBasura(int postBasura) {
		this.postBasura = postBasura;
	}

	public int getNumBaneos() {
		return numBaneos;
	}

	public void setNumBaneos(int numBaneos) {
		this.numBaneos = numBaneos;
	}
	
	public void cambiarNick() throws IOException {
		System.out.println("¿Que Nick quiere?");
		setNick(teclado.readLine());
	}
	
	public void incrementarPostBasura() {
		System.out.print(postBasura);
		this.postBasura=postBasura+1;
		System.out.println(" -> " + postBasura);
	}
	
	public void incrementarBaneos() {
		System.out.print(numBaneos);
		this.numBaneos=numBaneos+1;
		System.out.println(" -> " + numBaneos);
	}
}
