package Ejercicio5;

public class Empleado {

	private long nif;
	private int horasExtra, nHijos;
	private double sueldoBase, pagoHora, irpf, resultado;
	private boolean casado;
	
	Empleado(long nif, double sueldoBase, double pagoHora, int horasExtra, double irpf, boolean casado, int nHijos) {
		this.nif=nif;
		this.sueldoBase=sueldoBase;
		this.pagoHora=pagoHora;
		this.horasExtra=horasExtra;
		this.irpf=irpf;
		this.casado=casado;
		this.nHijos=nHijos;
	}
	
	
	public long getNif() {
		return nif;
	}
	public void setNif(long nif) {
		this.nif = nif;
	}
	public int getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	public int getnHijos() {
		return nHijos;
	}
	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getPagoHora() {
		return pagoHora;
	}
	public void setPagoHora(double pagoHora) {
		this.pagoHora = pagoHora;
	}
	public double getIrpf() {
		return irpf;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public double calculoHorasExtra() {
		return horasExtra * pagoHora;
	}
	
	public double calculoSueldoBruto() {
		return this.calculoHorasExtra() + this.sueldoBase;
	}
	
	public double calculoRetenciones() {
		double cont=0;
		if (casado==true) {
			cont=cont + 2;
		}
		if (nHijos>0) {
			cont=cont+nHijos;
		}
		return ((irpf-cont)/100 * calculoSueldoBruto());
	}
	
	public void print() {
		System.out.println("********************************" + 
						 "\n      INFORMACION EMPLEADO      " + 
						 "\nNIF: " + this.nif +
						 "\nNumero de Hijos: " + this.nHijos +
						 "\nCasado: " + this.casado +
						 "\n********************************");
	}
	
	public void printAll() {
		System.out.println("********************************" + 
						   "\n      INFORMACION EMPLEADO      " + 
						   "\nNIF: " + this.nif +
						   "\nNumero de Hijos: " + this.nHijos +
						   "\nCasado: " + this.casado +
						   "\nSueldo Base: " + this.sueldoBase +
						   "\nCompl. Horas Extras: " + this.pagoHora +
						   "\nSUeldo Bruto: " + calculoSueldoBruto() + 
						   "\nRetención IRPF: " + calculoRetenciones() + 
						   "\nSueldo Neto: " + (calculoSueldoBruto() - calculoRetenciones()) +
				 		   "\n********************************");
	}
}
