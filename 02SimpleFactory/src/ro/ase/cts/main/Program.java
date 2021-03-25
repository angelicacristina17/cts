package ro.ase.cts.main;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Program {
	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal(); 
		
		PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent, "Andrei"); 
		PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic, "Ioan");
		
		System.out.println(asistent);
		System.out.println(medic);
		

	}
	
}
