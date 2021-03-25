package ro.ase.cts.clase;

public class Reteta implements PrototipAbstract{
	private String denumireSolutie;
	private int cantitateSolutie;
	
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		//validari
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}

	private Reteta() {
		//nu mai facem validari
		this.cantitateSolutie=0;
		this.denumireSolutie=" ";
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutie=");
		builder.append(denumireSolutie);
		builder.append(", cantitateSolutie=");
		builder.append(cantitateSolutie);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public PrototipAbstract copiaza() {
		// TODO Auto-generated method stub
		Reteta copy=new Reteta();
		copy.cantitateSolutie=this.cantitateSolutie;
		copy.denumireSolutie=this.denumireSolutie;
		return copy;
	}

	public String getDenumireSolutie() {
		return denumireSolutie;
	}

	public void setDenumireSolutie(String denumireSolutie) {
		this.denumireSolutie = denumireSolutie;
	}

	public int getCantitateSolutie() {
		return cantitateSolutie;
	}

	public void setCantitateSolutie(int cantitateSolutie) {
		this.cantitateSolutie = cantitateSolutie;
	}
	
	
	
}
