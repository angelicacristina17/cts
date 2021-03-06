package pachet2;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{

	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}

	public Zoo() {
		zookeeper = new Zookeeper("Ionel");
		animalList = new ArrayList<>();
	}
	
	public void feedAllAnimals() {
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
	
	public void adaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	
}
