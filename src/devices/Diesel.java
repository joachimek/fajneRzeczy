package devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, int yearOfProduction, Double price) {
        super(model, producer, price, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
