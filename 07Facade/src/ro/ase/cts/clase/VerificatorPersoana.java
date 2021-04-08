package ro.ase.cts.clase;

public class VerificatorPersoana {
	public static boolean isEligibile(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.isUrmarit(persoana)) {
				if(!BiroulDeCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}

}
