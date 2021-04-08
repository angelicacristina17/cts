package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeAgentie implements ISediu {
	private List<ISediu> listaSedii;
	
	

	public CompositeAgentie() {
		this.listaSedii = new ArrayList<>();
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Este o agentie: ");
		for(ISediu sediu:listaSedii) {
			sediu.afiseazaDescriere();
		}
		
	}

	@Override
	public void addNod(ISediu sediu) {
		listaSedii.add(sediu);
		
	}

	@Override
	public void deleteNod(ISediu sediu) {
		listaSedii.remove(sediu);
		
	}

	@Override
	public ISediu getNode(int pozitie) {
		return listaSedii.get(pozitie);
	}

}
