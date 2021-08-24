public class Cat extends Mammal {

    private String breed;

    public Cat(String name, int age, String breed, char gender) {
        super(name, age, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}