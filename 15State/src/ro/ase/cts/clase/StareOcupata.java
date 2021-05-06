package ro.ase.cts.clase;

public class StareOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareOcupata)) {
			System.out.println("Se ocupa masa cu numarul "+masa.getNumar());
			masa.setStare(this);
		}else {
			System.out.println("Masa nu poate fi ocupata");
		}
		
	}

}
