package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Manager;

public class Main {
	public static void main(String[] args) {
		Manager manager= new Manager();
		Client client1= new Client("Marius");
		Client client2= new Client("Darius");
		Client client3= new Client("Andrei");
		
		manager.adaugaObservator(client1);
		manager.adaugaObservator(client2);
		manager.adaugaObservator(client3);
		
		manager.anuntaMeci("fotbal");
		
		manager.stergeObservator(client3);
		
		manager.anuntaMeci("handbal");
	}
}
