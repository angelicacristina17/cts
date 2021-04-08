package ro.ase.cts.main;

import ro.ase.cts.clase.CompositeAgentie;
import ro.ase.cts.clase.LeafFiliala;

public class Main {
	public static void main(String[] args) {
		CompositeAgentie agentie01 = new CompositeAgentie();
		CompositeAgentie agentie02 = new CompositeAgentie();
		CompositeAgentie agentie03 = new CompositeAgentie();

		LeafFiliala filiala01 = new LeafFiliala("Bucuresti");
		LeafFiliala filiala02 = new LeafFiliala("Constanta");
		LeafFiliala filiala03 = new LeafFiliala("Ploiesti");
		LeafFiliala filiala04 = new LeafFiliala("Pitesti");
		LeafFiliala filiala05 = new LeafFiliala("Targoviste");
		
		agentie01.addNod(filiala01);
		agentie01.addNod(filiala02);
		agentie01.addNod(agentie03);
		
		agentie02.addNod(filiala03);
		agentie02.addNod(filiala05);
		
		agentie03.addNod(filiala04);

		System.out.println("Agentia 1:");
		agentie01.afiseazaDescriere();
		
		System.out.println(" _______ ");
		System.out.println("Agentia 2:");
		agentie02.afiseazaDescriere();
		
		agentie03.deleteNod(filiala04);
		agentie01.addNod(filiala04);
		agentie01.deleteNod(agentie03);
		
		System.out.println(" _______ ");
		System.out.println("Agentia 1:");
		agentie01.afiseazaDescriere();
		
		System.out.println(" _______ ");
		System.out.println("Agentia 2:");
		agentie02.afiseazaDescriere();
		
		System.out.println(" _______ ");
		System.out.println("Agentia 3:");
		agentie03.afiseazaDescriere();
	}

}
