import java.util.Scanner;
import java.util.SplittableRandom;

public class Lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ergasia ,ask1, ask2, ask3, exetasi;
        double telikosBathmos;
        String Name, AM;

        System.out.println("Give Your Name: ");
        Name = input.next();
        System.out.println("Give Your AM: ");
        AM = input.next();
        System.out.println("Give Your Exam Grade [0-10]: ");
        exetasi = input.nextInt();
        System.out.println("Give Your Project Grade [0-10]: ");
        ergasia = input.nextInt();
        System.out.println("Give Your Ask1, Ask2, Ask3 Grades [0-10]: ");
        ask1 = input.nextInt();
        ask2 = input.nextInt();
        ask3 = input.nextInt();

        telikosBathmos = (double)(exetasi*80+ergasia*20+(ask1+ask2+ask3)*10)/100;

        System.out.println("Your Name and AM are: \n"+ Name+"\n"+AM);
        System.out.println("Your Final Grade is : "+ telikosBathmos);
        System.out.println("Your Exam, Project, Ask1, Ask2 and Ask3 Grades [0-10]: "+"\n"+ergasia+"\n"+ask1+ask2+"\n"+ask3+"\n"+exetasi);




    }

}
