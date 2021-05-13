package ro.ase.cts.main;

import ro.ase.cts.clase.ManagerMemento;
import ro.ase.cts.clase.Meci;

public class Main {

	public static void main(String[] args) {
	Meci meci=new Meci("Steaua", "Dinamo", 200, 150, 30, 25);
	
	ManagerMemento managerMemento = new ManagerMemento();
	managerMemento.adaugaMemento(meci.salvareMemento());
	
	meci.setNrSpectatori(180);
	managerMemento.adaugaMemento(meci.salvareMemento());
	
	System.out.println(meci.toString());
	meci.seteazaMemento(managerMemento.cereUnMemento(0));
	
	System.out.println(meci.toString());
	meci.seteazaMemento(managerMemento.cereUltimulMemento());
	System.out.println(meci.toString());
	
	}

}
