package ro.ase.cts.clase;

public class Presedinte {
	
	private String nume;
	private int varsta;
	private int mandat;
	
	public Presedinte(String nume, int varsta, int mandat) {
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}

	public Presedinte() {
		this.nume="Putin";
		this.varsta=68;
		this.mandat=4;
	}
	
	private static Presedinte instance=new Presedinte(); // de obicei e private, dar la eager initialization putem lasa instanta publica
	
	public static Presedinte getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		final StringBuilder sb=new StringBuilder("Presedinte{");
		sb.append("nume=").append(nume);
		sb.append(", varsta=").append(varsta);
		sb.append(", mandat=").append(mandat);
		sb.append("}");
		return sb.toString();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getMandat() {
		return mandat;
	}

	public void setMandat(int mandat) {
		this.mandat = mandat;
	}

	
	
}
