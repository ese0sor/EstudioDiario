package Ejercicio12;

public class main {

	public static void main(String[] args) {
			
			SueldoBruto s1 = new SueldoBruto("Antonio", 20, 8);
			SueldoBruto s2 = new SueldoBruto("David", 40, 10);
			SueldoBruto s3 = new SueldoBruto("Jaime", 45, 12);
			
			s1.getSueldobruto();
			s2.getSueldobruto();
			s3.getSueldobruto();
			System.out.println();
			s1.getprintall();
			s2.getprintall();
			s3.getprintall();

	}

}
