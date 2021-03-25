package ro.ase.cts.main;
import ro.ase.cts.clase.FactoryAsistent;
import ro.ase.cts.clase.FactoryBrancardier;
import ro.ase.cts.clase.FactoryInfirmier;
import ro.ase.cts.clase.FactoryMedic;
import ro.ase.cts.clase.IFactory;
import ro.ase.cts.clase.PersonalSpital;

public class Client {

	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea Ioan");
		afisareInformatiiPersonalSpital(new FactoryMedic(), "Horia Popescu");
		afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Mihnea Ovidiu");
		afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Alin Andone");
	}
}
