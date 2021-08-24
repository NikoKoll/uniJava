import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

       String[] myArray = new String[10];
       for(int i =0; i< myArray.length; i++){
           myArray[i]= "meow";
       }

        for(int i =0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }
}
