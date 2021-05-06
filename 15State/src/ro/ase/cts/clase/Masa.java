package ro.ase.cts.clase;

public class Masa {
	private Stare stare;
	private int numar;
	
	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stare=new StareLibera();
	}
	
	public Stare getStare() {
		return stare;
	}
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	
	public void revervaMasa() {
		StareRezervata rezervata = new StareRezervata();
		rezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata ocupata=new StareOcupata();
		ocupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera libera=new StareLibera();
		libera.modificaStare(this);
	}
	
}
