package ro.ase.cts.clase;

public class Medic extends PersonalSpital {

	public Medic(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "\nMedic: "+super.getNume();
	}
	
}
