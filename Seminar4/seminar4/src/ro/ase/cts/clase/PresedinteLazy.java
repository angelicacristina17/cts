package ro.ase.cts.clase;

public class PresedinteLazy {
	private static String nume;
	private static int varsta;
	private static int mandat;
	
	private static PresedinteLazy instance=null;
	
	//lazy amana apelul constructorului
	
	public PresedinteLazy() {
		this.nume="Presedinte";
		this.varsta=40;
		this.mandat=2;
	}
	public PresedinteLazy(String nume, int varsta, int mandat) {
	
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	public static PresedinteLazy getInstance() {
		
		if(instance ==null) {
			instance=new PresedinteLazy(nume, varsta, mandat);
		}
		return instance;
		
	}
	
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
