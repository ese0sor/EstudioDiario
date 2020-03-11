/**
 * PROGRAMA DE EJEMPLO DE USO DE LA CLASE ARRAYLIST, QUE SIMULA UNA SENCILLA AGENDA DE CONTACTOS
 */
package usoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author DAM
 *
 */
public class UsoArrayList {

	/**
	 * @param args
	 */

	// Declaramos estas dos referencias como estéticas, para poder usarlas en todos
	// los métodos
	static Scanner sc;
	static ArrayList<Persona> listaPersonas;

	public static void main(String[] args) {

		// Inicializamos la lista y la lectura por teclado
		listaPersonas = new ArrayList<>();
		sc = new Scanner(System.in);
		int opcion;

		do {
			// Al inicio de cada iteración mostramos el menú, y recogemos la opción
			menu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				listarPersonas();
				break;
			case 2:
				aniadirPersona();
				break;
			case 3:
				eliminarPersona();
				break;
			case 4:
				eliminarTodas();
				break;
			case 5:
				actualizarPersona();
				break;
			default:
				System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
			}

		} while (opcion != 0);

		sc.close();

	}

	/*
	 * MÉTODO QUE IMPRIME EL MENÚ
	 */
	public static void menu() {
		System.out.println("AGENDA DE CONTACTOS");
		System.out.println("===================");
		System.out.println("1. Listar todos los contactos");
		System.out.println("2. Añadir un contacto");
		System.out.println("3. Eliminar un contacto");
		System.out.println("4. Eliminar todos los contactos");
		System.out.println("5. Actualiza un contacto");
		System.out.println("0. Salir del programa\n\n");
		System.out.print("Introduzca una opci�n: ");

	}

	/*
	 * MÉTODO QUE LISTA TODOS LOS CONTACTOS DE LA AGENDA O MUESTRA UN MENSAJE SI NO
	 * HAY NINGUNO QUE MOSTRAR
	 */
	public static void listarPersonas() {
		if (listaPersonas.isEmpty()) {
			System.out.println("La agenda no tiene contactos\n");
		} else {
			for (int i = 0; i < listaPersonas.size(); i++) {
				Persona p = listaPersonas.get(i);
				System.out.printf("%d %s %s (%s) %n", i, p.getNombre(), p.getApellidos(), p.getTelefono());
			}
			System.out.println("");
		}
	}

	/*
	 * MÉTODO QUE RECOGE LOS DATOS DEL USUARIO PARA AÑADIR UNA NUEVA PERSONA, Y LA
	 * INSERTA EN LA LISTA
	 */
	public static void aniadirPersona() {
		System.out.println("\n\nAÑADIR NUEVO CONTACTO");
		System.out.print("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		System.out.print("Introduzca su n�mero de tel�fono: ");
		String telefono = sc.nextLine();

		listaPersonas.add(new Persona(nombre, apellidos, telefono));

		System.out.println("");

	}

	/*
	 * MÉTODO QUE ELIMINA UNA PERSONA DE LA AGENDA EN FUNCIÓN DE UNA POSICIÓN
	 * RECOGIDA DEL TECLADO
	 */
	public static void eliminarPersona() {
		System.out.println("\n\nELIMINAR CONTACTO");
		System.out.print("Introduzca la posici�n del contacto: ");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaPersonas.size()) {
			System.out.println("Posici�n erronea");
		} else {
			System.out.print("�Est� usted seguro de querer eliminar el contacto? (S/N): ");
			String siono = sc.nextLine();
			if (siono.equalsIgnoreCase("S")) {
				listaPersonas.remove(posicion);
			}
		}
		System.out.println("");

	}

	/*
	 * MÉTODO QUE ELIMINA TODOS LOS CONTACTOS DE LA AGENDA PREVIA CONFIRMACIÓN DE LA
	 * OPERACIÓN
	 */
	public static void eliminarTodas() {
		System.out.println("\n\nELIMINAR CONTACTO");
		System.out.print("�Est� usted seguro de querer eliminar el contacto? (S/N): ");
		String siono = sc.nextLine();
		if (siono.equalsIgnoreCase("S")) {
			listaPersonas.clear();
		}
		System.out.println("");

	}
	
	/*
	 * MÉTODO QUE ACTUALIZA A UN CONTACTO MEDIANTE EL NUMERO DE LA POSICIÓN 
	 */
	public static void actualizarPersona() {
		System.out.println("¿Que contacto quiere actualizar?");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaPersonas.size()) {
			System.out.println("Posición erronea");
		}else {
			System.out.println("Nombre:");
			String aux = sc.nextLine();
			listaPersonas.get(posicion).setNombre(aux);
			System.out.println("Apellido:");
			aux = sc.nextLine();
			listaPersonas.get(posicion).setApellidos(aux);
			System.out.println("Telefono:");
			aux = sc.nextLine();
			listaPersonas.get(posicion).setTelefono(aux);
		}
		System.out.println("Contacto actualizado.");
	}

}
