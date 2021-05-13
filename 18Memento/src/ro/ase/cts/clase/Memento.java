package ro.ase.cts.clase;

public class Memento {
	private int nrSpectatori;
	private String numeGazde;
	private String numeOaspecti;
	
	
	public Memento(int nrSpectatori, String numeGazde, String numeOaspecti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeGazde = numeGazde;
		this.numeOaspecti = numeOaspecti;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public String getNumeGazde() {
		return numeGazde;
	}
	public void setNumeGazde(String numeGazde) {
		this.numeGazde = numeGazde;
	}
	public String getNumeOaspecti() {
		return numeOaspecti;
	}
	public void setNumeOaspecti(String numeOaspecti) {
		this.numeOaspecti = numeOaspecti;
	}

}
