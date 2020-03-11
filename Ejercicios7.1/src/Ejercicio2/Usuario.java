package Ejercicio2;

public class Usuario {

	private int numMensaje;
	private String email;
	private String nick;
	
	
	Usuario(){
		
	}
	
	Usuario(int numMensaje, String email, String nick){
		this.numMensaje=0;
		this.email=email;
		this.nick=nick;
	}

	public int getNumMensaje() {
		return numMensaje;
	}

	public void setNumMensaje(int numMensaje) {
		this.numMensaje = numMensaje;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public void incrementarMensaje() {
		System.out.print(numMensaje);
		this.numMensaje=numMensaje+1;
		System.out.println(" -> " + numMensaje);
	}
	
	public void decrementarMensaje() {
		if (numMensaje<=0) {
			System.out.println("No se pueden restar mensajes.");
		}else {
			System.out.print(numMensaje);
			this.numMensaje=numMensaje-1;
			System.out.println(" -> " + numMensaje);
		}
	}
}
