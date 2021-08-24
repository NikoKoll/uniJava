
public class Human extends Mammal {
	private String surname;
	private String nationality;
	private String address;

	Human(String name, int age, char gender, String surname, String nationality, String address) {
		super(name, age, gender);
		this.surname = surname;
		this.nationality = nationality;
		this.address = address;
		
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Human: " + super.toString() +
				"\n Surename: " + surname +
				"\n Nationality: " + nationality +
				"\n Address: " + address;
	}

	@Override
	public int getLegs() {
		return 2;
	}


}
