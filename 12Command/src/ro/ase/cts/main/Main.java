package ro.ase.cts.main;

import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.*;

public class Main {
	public static void main(String[] args) {
	
		Masa masa1 = new Masa(1);
		Masa masa2= new Masa(2);
		Masa masa3= new Masa(3);
		
		Comanda comandaRezervare1=new ComandaRezervare(masa1);
		Comanda comandaOcupare1=new ComandaOcupare(masa2);
		Comanda comandaOcupare2=new ComandaOcupare(masa2);
		
		Operator operator1= new Operator();
		operator1.invoca(comandaRezervare1);
		operator1.executaComanda();
		
		operator1.invoca(comandaOcupare1);
		operator1.invoca(comandaOcupare2);
		
		operator1.executaComanda();
		operator1.executaComanda();
		
	}
}


















