
public class Dog extends Mammal {
	private String breed;
	
	Dog(String name, int age, char gender, String breed) {
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
	public String toString() {
		return "Dog: " + super.toString() +
				"\n Bredd: " +breed;
	}

	@Override
	public int getLegs() {
		return 4;
	}



}
