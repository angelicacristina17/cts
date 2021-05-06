package ro.ase.cts.main;

import ro.ase.cts.clase.Masa;
import ro.ase.cts.clase.StareLibera;

public class Main {
	public static void main(String[] args) {
	 Masa masa1=new Masa(1);
	 
	 masa1.elibereazaMasa();
	 masa1.revervaMasa();
	 masa1.revervaMasa();
	 System.out.println("_____________");
	 masa1.setStare(new StareLibera());
	 masa1.revervaMasa();
	 System.out.println("_____________");
	 masa1.ocupaMasa();
	 masa1.elibereazaMasa();
	 System.out.println("_____________");
	 masa1.ocupaMasa();
	 masa1.elibereazaMasa();
	}
}
