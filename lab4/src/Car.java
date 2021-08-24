
import static java.lang.Math.abs;

public class Car {

    public String model;
    public String category;
    private String requiredFuel;
    private int displacemnt;
    private String horsepower;
    private String consumption;
    private double price;

    public Car(String model, String category, String requiredFuel, int displacemnt, String horsepower, String consumption, double price) {
        this.model = model;
        this.category = category;
        this.requiredFuel = requiredFuel;
        this.displacemnt = displacemnt;
        this.horsepower = horsepower;
        this.consumption = consumption;
        this.price = price;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRequiredFuel() {
        return requiredFuel;
    }

    public void setRequiredFuel(String requiredFuel) {
        this.requiredFuel = requiredFuel;
    }

    public int getDisplacemnt() {
        return displacemnt;
    }

    public void setDisplacemnt(int displacemnt) {
        this.displacemnt = displacemnt;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getpriceDefference(double price1, double price2) {
        return abs(price1 - price2);
    }



}
