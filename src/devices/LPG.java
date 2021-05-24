package devices;

public class LPG extends Car{
    public LPG(String model, String producer, int yearOfProduction, Double price) {
        super(model, producer, price, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
