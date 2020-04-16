package animals.body;

import animals.exceptions.WeightException;

public class Dog extends Animal {
	private ColorOfFur colorOfFur;

	public Dog(int id, String breed, double weight, ColorOfFur colorOfFur) throws WeightException {
		super(id, breed, validateWeight(weight));
		this.colorOfFur = colorOfFur;
	}

	public ColorOfFur getColorOfFur() {
		return colorOfFur;
	}

	public static double validateWeight(double weight) throws WeightException {
		if (weight <= 100) {
			return weight;
		}
		throw new WeightException("Dog weight can't be more then 100");
	}

}
