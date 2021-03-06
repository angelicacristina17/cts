package pachet2;

public class Elefant extends Animal {

	public Elefant(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	private int varsta;

	public Elefant(String nume, int varsta) {
		super(nume);
		this.varsta = varsta;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	
}
