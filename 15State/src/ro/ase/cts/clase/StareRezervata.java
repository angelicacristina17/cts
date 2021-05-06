package ro.ase.cts.clase;

public class StareRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera){
			System.out.println("Se rezerva masa cu numarul "+masa.getNumar());
			masa.setStare(this);
		}else {
			System.out.println("Nu putem rezerva masa!");
		}
		
	}

}
