import java.util.Scanner;

public class testCar {

    public static void main(String[] args) {

        Car CarA = new Car("Opel Corsa", "Mid-size Car", "Unleaded", 1229,
                "100 @ 5600 rpm", "5,4lt/100km" ,13900);
        Car CarB = new Car();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter CarB details");
        System.out.println("Model: ");
        CarB.model = input.next();
        System.out.println("category: ");
        CarB.category = input.next();
        System.out.println("RequiredFuel: ");
        CarB.setRequiredFuel(input.next());
        System.out.println("Horsepower: ");
        CarB.setHorsepower(input.next());
        System.out.println("Consumption: ");
        CarB.setConsumption(input.next());
        System.out.println("Displacemnt: ");
        CarB.setDisplacemnt(input.nextInt());
        System.out.println("Price: ");
        CarB.setPrice(input.nextDouble());

        System.out.println("CarA details:");
        System.out.println("Model: "+CarA.model);
        System.out.println("Category: "+CarA.category);
        System.out.println("Required Fuel: "+CarA.getRequiredFuel());
        System.out.println("Horsepower: "+CarA.getHorsepower());
        System.out.println("Consumption: "+CarA.getConsumption());
        System.out.println("Price: "+CarA.getPrice());
        System.out.println("Displacement: "+CarA.getDisplacemnt());
        System.out.println("\nCarB details:");
        System.out.println("Model: "+CarB.model);
        System.out.println("Category: "+CarB.category);
        System.out.println("Required Fuel: "+CarB.getRequiredFuel());
        System.out.println("Horsepower: "+CarB.getHorsepower());
        System.out.println("Consumption: "+CarB.getConsumption());
        System.out.println("Price: "+CarB.getPrice());
        System.out.println("Displacement: "+CarB.getDisplacemnt());

        if (CarA.getPrice()> CarB.getPrice()){
            System.out.println("CarA is more expensive by"+ CarA.getpriceDefference(CarA.getPrice(), CarB.getPrice()));
        }else if (CarA.getPrice()< CarB.getPrice()){
            System.out.println("CarB is more expensive by"+ CarA.getpriceDefference(CarA.getPrice(), CarB.getPrice()));
        }else {
            System.out.println("Same price");
        }

    }

}
