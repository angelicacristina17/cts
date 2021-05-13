package ro.ase.cts.main;

import ro.ase.cts.clase.Spectator;
import ro.ase.cts.clase.SpectatorAbstract;
import ro.ase.cts.clase.SpectatorVIP;

public class Main {
	public static void main(String[] args) {
		SpectatorAbstract spectator1= new Spectator("Razvan");
		SpectatorAbstract spectator2= new SpectatorVIP("Tudor");
		
		spectator1.intrareInStadion();
		spectator2.intrareInStadion();
	}
}
