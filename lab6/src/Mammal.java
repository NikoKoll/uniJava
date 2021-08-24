
public abstract class Mammal {
	private String name;
	private int age;
	private char gender;
	
	
    Mammal(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString(){
		String ret =new String("Name: "+ name + "\n Age: " + age + "\n Gender: "+ gender);
		return ret;
	}
	
	
    public abstract int getLegs();
    
//	public abstract String speak();

	
	

}
