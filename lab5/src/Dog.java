public class Dog extends Mammal {

    private double weight;
    private String breed;

    public Dog(String name, int age,String breed, char gender, double weight) {
        super(name, age, gender);
        this.weight = weight;
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

