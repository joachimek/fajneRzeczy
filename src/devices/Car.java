package devices;

import com.company.Saleable;
import com.company.Human;
public abstract class Car extends Device implements Saleable {
    //private final String color;
    public Double price;

    public Car( String model, String producer, Double price, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }


    public String toString() {
        return "Car:" +
                "\n\tproducer=" + producer +
                "\n\tmodel=" + model +
                "\n\tvalue=" + price;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.auto != this) {
            System.out.println("nie posiadasz tego urządzenia");
        } else if (buyer.cash < price) {
            System.out.println("nie masz wystarczająco środków");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.auto = seller.auto;
            seller.auto = null;
            System.out.println("sprzedano"+ this);
        }
    }

    public abstract void refuel();
}