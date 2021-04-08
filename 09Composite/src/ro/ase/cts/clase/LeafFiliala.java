package ro.ase.cts.clase;

public class LeafFiliala implements ISediu {
	private String numeFiliala;

	public LeafFiliala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Filiala "+numeFiliala);
	}

	@Override
	public void addNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat!");
		
	}

	@Override
	public void deleteNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat!");
		
	}

	@Override
	public ISediu getNode(int pozitie) throws Exception {
		throw new Exception("Nu este implementat!");
	}

}
