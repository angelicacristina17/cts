package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.PlataCard;

public class Main {
	public static void main(String[] args) {
	Client client=new Client("Alice");
	
	client.plateste(30);
	client.setTipPlata(new PlataCard());
	client.plateste(25);
	}
}
