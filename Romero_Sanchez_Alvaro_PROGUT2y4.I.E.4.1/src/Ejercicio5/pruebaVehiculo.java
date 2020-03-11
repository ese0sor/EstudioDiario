package Ejercicio5;

public class pruebaVehiculo {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("0000BBB", "gris plata", 3);
		Moto m1 = new Moto("2222BBB", "negro", 2);

		System.out.println("Datos Coche:" + 
				"\nMatricula: " + c1.getMatricula() +
				"\nColor: " + c1.getColorV() + 
				"\nCV: " + c1.getCv() + 
				"\nPotencia: " + c1.getPotencia() +
				"\nRuedas: " + c1.getRuedas() + 
				"\nNumero de Puertas: " + c1.getNumPuerta());
		
		System.out.println();
		
		System.out.println("Datos Moto:" + 
				"\nMatricula: " + m1.getMatricula() +
				"\nColor: " + m1.getColorV() + 
				"\nCV: " + m1.getCv() + 
				"\nPotencia: " + m1.getPotencia() +
				"\nRuedas: " + m1.getRuedas() + 
				"\nNumero de Plazas: " + 2);
		
		System.out.println("Con metodo:\n");
		
		c1.datosCoche();
		m1.datosMoto();
	}

}
