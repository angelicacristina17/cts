package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Flyweight;
import ro.ase.cts.clase.FlyweightFactory;
import ro.ase.cts.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(10, 5, 15);
		Rezervare rezervare2 = new Rezervare(42, 2, 10);
		Rezervare rezervare3 = new Rezervare(11, 7, 21);
		Rezervare rezervare4 = new Rezervare(12, 4, 14);
	
		FlyweightFactory flyweightFactory= new FlyweightFactory();
		Flyweight client1 = flyweightFactory.getFlyweight("0712345678");
		client1.printeazaRezevarea(rezervare1);
		
		flyweightFactory.getFlyweight("0712345678").printeazaRezevarea(rezervare2);
		flyweightFactory.getFlyweight("0712345680").printeazaRezevarea(rezervare3);
		flyweightFactory.getFlyweight("0712345680").printeazaRezevarea(rezervare4);
	}

}
