public class ZooMain {

    public static void main(String[] args) {

        Dog myDog = new Dog("Rex", 3, "German Sheperd", 'M', 5);
        System.out.println("Dog's weight : "+myDog.getWeight());
        Human theHuman = new Human("Nikos", 19, 'M');
        System.out.println("My name is : "+theHuman.getName());

    }

}
