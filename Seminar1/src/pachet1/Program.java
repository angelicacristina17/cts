package pachet1;

import pachet2.Elefant;
import pachet2.Girafa;
import pachet2.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		
		Girafa g1=new Girafa("Mona");
		Girafa g2=new Girafa("Nini");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		
		Elefant e1=new Elefant("Cici", 2);
		Elefant e2=new Elefant("Cece", 4);
		
		zoo.adaugaAnimal(e1);
		zoo.adaugaAnimal(e2);
		
		zoo.feedAllAnimals();
		
		
	}
	
	
	
}
