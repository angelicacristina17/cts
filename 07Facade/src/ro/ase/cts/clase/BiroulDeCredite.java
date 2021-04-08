package ro.ase.cts.clase;

class BiroulDeCredite {

	public static boolean areCredite(Persoana persoana) {
		return (Integer.parseInt(""+persoana.getCnp().charAt(11))%2)==0;	
	}

	
}
