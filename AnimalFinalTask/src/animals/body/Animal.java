package animals.body;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
	private int id;
	private String breed;
	private double weight;
	private List<Integer> previousId = new ArrayList<>();

	public Animal(int id, String breed, double weight) {
		setId(id);
		this.breed = breed;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public String getBreed() {
		return breed;
	}

	public double getWeight() {
		return weight;
	}

	private void setId(int id) {
		if (!previousId.contains(id)) {
			this.id = id;
			previousId.add(id);
		}
	}

}
