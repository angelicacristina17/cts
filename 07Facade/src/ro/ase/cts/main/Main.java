package ro.ase.cts.main;

import ro.ase.cts.clase.Persoana;
import ro.ase.cts.clase.VerificatorPersoana;

public class Main {
		public static void main(String[] args) {
			Persoana persoana = new Persoana("Popescu Daniel", "1520321101577");
			if(VerificatorPersoana.isEligibile(persoana)) {
				System.out.println("Persoana este eligibila pentru credit.");
			}else {
				System.out.println("Persoana nu este eligibila pentru credit.");
			}
		}
}
