package ro.ase.cts.main;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorLaMultiAni;
import ro.ase.cts.clase.DecoratorPasteFericit;
import ro.ase.cts.clase.NotaDePlata;

public class Main {
	public static void main(String[] args) {
		
		NotaDePlata notaInitiala = new NotaDePlata(55);
		notaInitiala.printeaza();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorLaMultiAni(notaInitiala);
		decoratorLaMultiAni.printeazaFelicitare();
		System.out.println("  __________  ");
		decoratorLaMultiAni.printeaza();
		
		System.out.println("  __________  ");
		DecoratorAbstract decoratorPasteFericit = new DecoratorPasteFericit(notaInitiala);
		decoratorPasteFericit.printeaza();
		
		System.out.println("  __________  ");
		NotaDePlata notaADoua = new NotaDePlata(150);
		DecoratorAbstract decoratorLaMultiAni2 = new DecoratorLaMultiAni(notaADoua);
		DecoratorAbstract decoratorPaste = new DecoratorPasteFericit(notaADoua);
		decoratorPaste.printeaza();
		
		System.out.println("  __________  ");	
	}

}