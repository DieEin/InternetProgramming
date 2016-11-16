package bg.elsys.ip.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalService {
	private static AnimalService instance;

	public static AnimalService getInstance() {
		if (instance == null) {
			instance = new AnimalService();
		}
		return instance;
	}
	
	private List<Animal> animalList = new ArrayList<>();
	
	public AnimalService() {
		animalList.add(new Animal(5, "doge", "dog"));
		animalList.add(new Animal(3, "cate", "cat"));
		animalList.add(new Animal(150, "johny", "turtle"));
	}
	
	public List<Animal> getAnimals() {
		return Collections.unmodifiableList(animalList);
	}

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
}
