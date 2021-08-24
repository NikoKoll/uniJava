import java.awt.*;

public class Lesson3 {

    public static void main(String[] args) {

        Dog myDog = new Dog("Azor", 3, "Tsopanoskilo", 'M');
        Dog secondDog = new Dog("Azor", 3, "Tsopanoskilo", 'M');

        System.out.println("My dogs name: "+myDog.getName());
        System.out.println(myDog.getClassDescription());
        System.out.println(myDog.bark());
        myDog.setName("Lassie");
        System.out.println("My dogs name: "+myDog.getName());

    }

}


