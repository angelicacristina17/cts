package ro.ase.cts.clase;

public class Meci {
	private String numeGazde;
	private String numeOaspeti;
	private int nrBileteVandute;
	private int nrSpectatori;
	private int nrJandarmi;
	private int nrStewarzi;
	
	public Meci(String numeGazde, String numeOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi,
			int nrStewarzi) {
		super();
		this.numeGazde = numeGazde;
		this.numeOaspeti = numeOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSpectatori = nrSpectatori;
		this.nrJandarmi = nrJandarmi;
		this.nrStewarzi = nrStewarzi;
	}

	public String getNumeGazde() {
		return numeGazde;
	}

	public void setNumeGazde(String numeGazde) {
		this.numeGazde = numeGazde;
	}

	public String getNumeOaspeti() {
		return numeOaspeti;
	}

	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}

	public int getNrBileteVandute() {
		return nrBileteVandute;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public int getNrJandarmi() {
		return nrJandarmi;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	public int getNrStewarzi() {
		return nrStewarzi;
	}

	public void setNrStewarzi(int nrStewarzi) {
		this.nrStewarzi = nrStewarzi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meci [numeGazde=");
		builder.append(numeGazde);
		builder.append(", numeOaspeti=");
		builder.append(numeOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append(", nrStewarzi=");
		builder.append(nrStewarzi);
		builder.append("]");
		return builder.toString();
	}
	
	public void seteazaMemento(Memento memento) {
		this.nrSpectatori=memento.getNrSpectatori();
		this.numeGazde=memento.getNumeGazde();
		this.numeOaspeti=memento.getNumeOaspecti();
	}
	
	public Memento salvareMemento() {
		return new Memento(getNrSpectatori(), getNumeGazde(), getNumeOaspeti());
	}
}
