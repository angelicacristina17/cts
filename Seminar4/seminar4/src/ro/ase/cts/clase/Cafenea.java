package ro.ase.cts.clase;

public class Cafenea {

	private String nume;
	private int nrMese;
	private int nrSortimente;
	
	private static Cafenea instance=null;
	
	private Cafenea() {
		this.nume = "Aroma";
		this.nrMese = 12;
		this.nrSortimente = 20;
	}

	private Cafenea(String nume, int nrMese, int nrSortimente) {
		this.nume = nume;
		this.nrMese = nrMese;
		this.nrSortimente = nrSortimente;
	}
	
	public static synchronized Cafenea getInstance(String nume, int nrMese, int nrSortimente) {
			if(instance==null) {
				instance=new Cafenea(nume, nrMese, nrSortimente);
			}
		
		return instance;
	}

	
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrMese() {
		return nrMese;
	}

	public void setNrMese(int nrMese) {
		this.nrMese = nrMese;
	}

	public int getNrSortimente() {
		return nrSortimente;
	}

	public void setNrSortimente(int nrSortimente) {
		this.nrSortimente = nrSortimente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cafenea[ nume:");
		builder.append(nume);
		builder.append(", nrMese: ");
		builder.append(nrMese);
		builder.append(", nrSortimente: ");
		builder.append(nrSortimente);
		builder.append("]");
		return builder.toString();
	}
	
	
}
