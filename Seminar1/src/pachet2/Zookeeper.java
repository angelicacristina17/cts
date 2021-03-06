package pachet2;

public class Zookeeper {
	
	private String nume;

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void feed(Animal animal) {
		System.out.println(nume+" a hranit animalul "+animal.getNume());
	}

}
