package ro.ase.cts.clase;

public class StareLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Nu putemm face aceasta modificare!");
		}else {
			masa.setStare(this);
			System.out.println("Masa cu numarul "+masa.getNumar()+" a fost eliberata!");
		}
		
	}

}
