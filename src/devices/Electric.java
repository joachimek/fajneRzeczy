package devices;

public class Electric extends Car{
    public Electric(String model, String producer, int yearOfProduction, Double price) {
        super(model, producer, price, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
