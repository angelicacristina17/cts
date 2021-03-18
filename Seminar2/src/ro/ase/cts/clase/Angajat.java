package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantare=10;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(float sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nume=").append(nume).append(", prenume=").append(prenume)
		.append(", varsta=").append(varsta).append(", punctaj=").append(punctaj)
		.append(", nr_proiecte=").append(nr_proiecte).append(", denumiriProiecte=")
		.append(Arrays.toString(denumiriProiecte)); 
	return builder.toString();	
	}
	
	public float getSumaFinantata() {
		return sumaFinantare;
	}
	
	
//	public String toString() {
//		StringBuilder stringBuilder=new StringBuilder();
//		
//	}
}
