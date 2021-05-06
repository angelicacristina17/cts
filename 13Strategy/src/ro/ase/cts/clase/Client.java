package ro.ase.cts.clase;

public class Client {
	private IPlata tipPlata;
	private String nume;
	
	public Client(String nume) {
		this.nume = nume;
		this.tipPlata=new PlataCash();
	}

	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}
	
	public void plateste(float suma) {
		System.out.println("Clientul "+nume+" are de platit "+suma+" lei");
		this.tipPlata.plateste(suma);
		
	}
	
}
