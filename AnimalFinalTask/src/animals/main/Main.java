package animals.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import animals.body.Animal;
import animals.body.Cat;
import animals.body.ColorOfFur;
import animals.body.Dog;
import animals.body.Fish;
import animals.exceptions.WeightException;

public class Main {
	public static void main(String[] args) {

		List<Animal> animals = new ArrayList<>();
		try {
			animals.addAll(createCats());
			animals.addAll(createDogs());
			animals.addAll(createFishes());

		} catch (WeightException e) {
			System.out.println(e.getMessage());
		}
		printCatsWithMaxWeightFive(animals);

	}

	private static void printCatsWithMaxWeightFive(List<Animal> animals) {
		for (Animal animal : animals) {
			if (animal != null && animal.getClass().getName().equals("animals.body.Cat") && animal.getWeight() < 5) {
				System.out.println(animal);
			}
		}
	}

	private static List<Cat> createCats() throws WeightException {
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat(1, "koko", 4, true, ColorOfFur.black));
		cats.add(new Cat(2, "siamska", 3, false, ColorOfFur.black));
		cats.add(new Cat(3, "dasd", 15, true, ColorOfFur.colorful));
		return cats;
	}

	private static List<Dog> createDogs() throws WeightException {
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog(15, "pincher", 15, ColorOfFur.black));
		dogs.add(new Dog(16, "buldog", 30, ColorOfFur.black));
		dogs.add(new Dog(8, "pitbull", 20, ColorOfFur.orange));
		return dogs;
	}

	private static List<Fish> createFishes() throws WeightException {
		List<Fish> fishes = new ArrayList<Fish>();
		fishes.add(new Fish(20, "gold", 0.4, "any", true));
		fishes.add(new Fish(29, "sharan", 2, "any", false));
		return fishes;
	}
}
