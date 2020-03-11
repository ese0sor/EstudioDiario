package Clase;

public class Excepciones {

	/*
	 * Vale para evitar que salten errores. Hay dos caminos, el normal y el excepcional:
	 * 
	 * El camino normal es el que ocurre cuando el programa sigue su curso naturalmente, el camino excepcional es 
	 * el que el programa coge cuando entra en una excepcion y continua hacia adelante.
	 * 
	 * %Tipos de Excepcion:%
	 * 	
	 * 		* NullPointerException: No encuentra a lo que intenta acceder o trata con algo que no existe.
	 * 								Ejemplo: 1. Salirse de un Array, 2. Usar un objeto que no esta creado.								
	 * 
	 * 
	 * 		*FileNotFoundException: No encuentra el archivo o no existe.
	 * 
	 * 		*
	 * 
	 * 		*
	 * 
	 * %Try/Catch:%
	 * 
	 * 		El try/catch sirve para avisar que vamos a introducir un codigo posiblemente dañino para el programa, 
	 * 		y en caso de que explote, y cerrar el programa, imprimir por pantalla un aviso escrito del tipo de error.
	 * 
	 * 		No tiene que ser solo un nivel de try y luego otro de catch, se puede hacer un try/catch ANIDADO, que seria
	 * 		cumplir con el try y en caso de error tener diferentes tipos de catch en los que cada uno recoja un diferente 
	 * 		error.
	 * 
	 * 		El try/catch tambien tiene la parte del finally{}, este bloque hace que se cumpla lo que haya dentro 100% 
	 * 		seguro, pero luego de pasar por los catch.
	 * 
	 * Podemos hacer que un metodo que estamos creando nos mande crear un posible try/catch, podemos hacerlo declarando un
	 * metodo:
	 * public void apagar() throws BombillaException(String mensaje)
	 */
}
