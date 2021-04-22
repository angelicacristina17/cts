package ro.ase.cts.clase;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private int ora;
	
	public Rezervare(int nrMasa, int nrPersoane, int ora) {
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public int getNrPersoane() {
		return nrPersoane;
	}

	public void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}

	public int getOra() {
		return ora;
	}

	public void setOra(int ora) {
		this.ora = ora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
