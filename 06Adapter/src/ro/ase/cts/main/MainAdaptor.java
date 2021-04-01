package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAdapter;
import ro.ase.cts.clase.BiletAdapterClase;
import ro.ase.cts.clase.IBiletOnline;

public class MainAdaptor {
	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
		bilet.rezervare();
		bilet.vanzare();
	}
	
	private static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main (String[] args) {
		Bilet bilet=new Bilet(30);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		IBiletOnline adaptor= new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(adaptor);
		
		IBiletOnline adapterClase = new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(adapterClase);
		
		
		
		
		
		
		
		
		
		
		
	}
}
