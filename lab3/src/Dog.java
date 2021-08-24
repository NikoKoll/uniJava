public class Dog {

    private String name;
    private int age;
    private String breed;
    private char gender;

    Dog(String name, int age, String breed, char gender){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getClassDescription(){
        String description = "This a dog entity";
        return description;
    }

    String bark(){
        String gav = "gav gav";
        return gav;
    }

}
