package ro.ase.cts.clase;

public class ComandaRezervare extends Comanda {

	public ComandaRezervare(Masa masa) {
		super(masa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.masa.rezervaMasa();	
	}

}
