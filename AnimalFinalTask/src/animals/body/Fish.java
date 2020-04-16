package animals.body;

import animals.exceptions.WeightException;

public class Fish extends Animal {
	private String kindOfFood;
	private boolean hasNeedOfAirPump;

	public Fish(int id, String breed, double weight, String kindOfFood, boolean hasNeedOfAirPump) throws WeightException {
		super(id, breed, validateWeight(weight));
		this.kindOfFood = kindOfFood;
		this.hasNeedOfAirPump = hasNeedOfAirPump;
	}

	public String getKindOfFood() {
		return kindOfFood;
	}

	public boolean isHasNeedOfAirPump() {
		return hasNeedOfAirPump;
	}
	
	public static double validateWeight(double weight) throws WeightException {
		if (weight <= 10) {
			return weight;
		}
		throw new WeightException("Fish weight can't be more then 10");
	}

}
