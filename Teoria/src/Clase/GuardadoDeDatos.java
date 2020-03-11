package Clase;

public class GuardadoDeDatos {

	
	/*
	 * Aqui tratamos la entrada y salida de datos
	 * 
	 * APLICACION ----(in)-----> FICHERO
	 * APLICACION <---(out)----- FICHERO
	 * 
	 * Dos formas de recogida de textos. BufferedReader y Scanner
	 * 
	 * Recordar abrir y cerrar los flujos abiertos cuando no se vayna a usar.
	 * 
	 * Pasos:
	 * Abre flujo
	 * Mira si es de lectura o escritura
	 * Trabaja con catch
	 * Cierra el flujo
	 * 
	 * - Flujo de salida:
	 * 
	 * Patron basico de flujo de salida:
	 * 	Abrir flujo
	 * 	Mientras hay datos que escribir
	 * 		Es
	 * 
	 * 
	 * OutputStream: clase abstracta y padre de la mayoria de los flujos de byte
	 * 	FileOutPut: flujo que permite escribir byte a byte
	 * 	BufferedOutputStream: deja recibir grupos de byte
	 * 	ByteArrayOutputStream: Permite escribir byte a byte y lo muestra en forma de Array
	 * 
	 * BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fichero.dat"));
	 * 
	 * El byte llega de 0 a 256, en caso de sobrepasar esa tasa repetira el contenido hasta completar la cantidad.
	 * 
	 * Para conectar con el archivo FileOutputStream("fichero.dat")
	 * 
	 * 
	 * 
	 * 
	 * - Flujo entrada
	 * 
	 * Abrir flujo
	 * Mientras hay datos que leer
	 * 	Leer datos del flujo
	 * 	Procesa los datos como quiere
	 * Cerrar flujo
	 */
}
