package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	//static Usuario a;
	static Moderadores b;
	static Administradores c;
	static int option;
	static String email;
	
	Menu(){
		b = new Moderadores(0, "alvaro@gmail.com", "alvaro1");
		c = new Administradores(0, "romero@gmail.com", "romero1");
	}
	
	public void inicio() throws NumberFormatException, IOException {
		do {
			System.out.println("1.Incrementar Mensajes."
					+"\n2.Decrementar Mensajaes."
					+"\n3.Modificar Correo."
					+"\n4.Incrementar Papelera."
					+"\n5.Incrementar Baneos."
					+"\n6.Salir");
			option=Integer.parseInt(teclado.readLine());
			switch (option) {
			case 1:
				menuIncrementarMensajes();
				break;
			case 2:
				menuDecrementarMensajes();
				break;
			case 3:
				menuModificarEmail();
				break;
			case 4:
				menuIncrementarPapelera();
				break;
			case 5:
				c.incrementarBaneos();
				break;
			case 6:
				System.out.println("Aplicacion Cerrada.");
				break;
			default:
				System.out.println("Opcion no reconocida.");
				break;
			}
			
		} while (option!=6);
	}
	
	public void menuIncrementarMensajes() throws NumberFormatException, IOException {
		do {
			System.out.println("1.Incrementar Mensaje Mod."
					+"\n2.Incrementar Mensaje Admin."
					+"\n3.Salir.");
			option=Integer.parseInt(teclado.readLine());
			switch (option) {
			case 1:
				b.incrementarMensaje();
				break;
			case 2:
				c.incrementarMensaje();
				break;
			case 3:
				break;
			default:
				System.out.println("Opcion no reconocida.");
				break;
			}
		} while (option!=3);
	}
	
	public void menuDecrementarMensajes() throws NumberFormatException, IOException {
		do {
			System.out.println("1.Decrementar Mensaje Mod."
					+"\n2.Decrementar Mensaje Admin."
					+"\n3.Salir.");
			option=Integer.parseInt(teclado.readLine());
			switch (option) {
			case 1:
				b.decrementarMensaje();
				break;
			case 2:
				c.decrementarMensaje();
				break;
			case 3:
				break;
			default:
				System.out.println("Opcion no reconocida.");
				break;
			}
		} while (option!=3);
	}
	
	public void menuModificarEmail() throws NumberFormatException, IOException {
		do {
			System.out.println("1.Modificar Email Mod."
					+"\n2.Modificar Email Admin."
					+"\n3.Salir.");
			option=Integer.parseInt(teclado.readLine());
			switch (option) {
			case 1:
				System.out.println("Nuevo email:");
				email=teclado.readLine();
				b.setEmail(email);
				break;
			case 2:
				System.out.println("Nuevo email:");
				email=teclado.readLine();
				c.setEmail(email);
				break;
			case 3:
				break;
			default:
				System.out.println("Opcion no reconocida.");
				break;
			}
		} while (option!=3);
	}
	
	public void menuIncrementarPapelera() throws NumberFormatException, IOException {
		do {
			System.out.println("1.Incrementar Papelera Mod."
					+"\n2.Incrementar Papelera Admin."
					+"\n3.Salir.");
			option=Integer.parseInt(teclado.readLine());
			switch (option) {
			case 1:
				b.incrementarPostBasura();
				break;
			case 2:
				c.incrementarPostBasura();
				break;
			case 3:
				break;
			default:
				System.out.println("Opcion no reconocida.");
				break;
			}
		} while (option!=3);
	}
}
