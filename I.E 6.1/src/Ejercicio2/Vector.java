package Ejercicio2;

public class Vector {

	int vector[];
	
	public void crearArrayRelleno(int huecos) {
		
		vector = new int[huecos];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int) (Math.random()*10+1);
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}
	
	public void sumatorio() {
		
		int suma=0;
		
		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}
		System.out.println("La media del array es: " + suma/(vector.length));
	}
}
