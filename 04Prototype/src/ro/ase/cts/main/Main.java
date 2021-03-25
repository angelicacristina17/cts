package ro.ase.cts.main;

import ro.ase.cts.clase.Reteta;

public class Main {
	public static void main (String[] args) {
		Reteta reteta1=new Reteta("Paracetamol", 100);
		Reteta reteta2=(Reteta) reteta1.copiaza();
		System.out.println(reteta1);
		System.out.println(reteta2);
		
		reteta2.setDenumireSolutie("Algocalmin");
		System.out.println(reteta2);
	}

}
