package Ejercicio2;

public class Moderadores extends Usuario {

	private int postBasura;
	
	Moderadores(){
		
	}
	
	Moderadores(int numMensaje, String email, String nick){
		super(numMensaje, email, nick);
		this.postBasura=0;
	}

	public int getPostBasura() {
		return postBasura;
	}

	public void setPostBasura(int postBasura) {
		this.postBasura = postBasura;
	}
	
	public void incrementarPostBasura() {
		System.out.print(postBasura);
		this.postBasura=postBasura+1;
		System.out.println(" -> " + postBasura);
	}
}
