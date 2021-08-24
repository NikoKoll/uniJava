
public class Cat extends Mammal {
	private String breed;

	Cat(String name, int age, char gender, String breed) {
		super(name, age, gender);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}


	@Override
	public int getLegs() {
		return 4;
	}
}
