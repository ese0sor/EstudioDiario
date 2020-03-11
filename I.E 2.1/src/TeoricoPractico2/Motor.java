package TeoricoPractico2;

public class Motor {
	
	private int litroAceite;
	private int CV;
	
	Motor(int CV) {
		this.CV=CV;
		this.litroAceite=0;
	}

	public int getLitroAceite() {
		return litroAceite;
	}

	public int getCV() {
		return CV;
	}

	public void setLitroAceite(int litroAceite) {
		this.litroAceite = litroAceite;
	}
	
}
