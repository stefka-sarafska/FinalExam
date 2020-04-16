package animals.body;

import animals.exceptions.WeightException;

public class Cat extends Animal {

	private boolean hasFur;
	private ColorOfFur colorOfFur;

	public Cat(int id, String breed, double weight, boolean hasFur, ColorOfFur colorOfFur) throws WeightException {
		super(id, breed, validateWeight(weight));
		this.hasFur = hasFur;
		setColorOfFur(colorOfFur);
	}

	public boolean isHasFur() {
		return hasFur;
	}

	private void setColorOfFur(ColorOfFur colorOfFur) {
		if (this.hasFur == true) {
			this.colorOfFur = colorOfFur;
		} else {
			this.colorOfFur = ColorOfFur.none;
		}
	}

	public ColorOfFur getColorOfFur() {
		return colorOfFur;
	}

	public static double validateWeight(double weight) throws WeightException {
		if (weight <= 20) {
			return weight;
		}
		throw new WeightException("Cat weight can't be more then 20");
	}

	@Override
	public String toString() {
		return "Cat with id "+ super.getId() +", has color of fur " + colorOfFur + ", breed " + super.getBreed() +super.getBreed()
				+  ", weight " + super.getWeight();
	}

}
