package devices;

import com.company.Human;
import com.company.Saleable;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements Saleable {
    final public Double screenSize;
    final public String operationSystem;

    private static final String DEFAULT_APP_SERVER_URL = "http://127.0.0.1/";
    private static final String DEFAULT_PROTOCOL = "1234";
    private static final String DEFAULT_VERSION_NAME = "1.0.0";

    public Phone(String producer, String model, Double screenSize, String operationSystem, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "Phone:" +
                "\n\tproducer=" + producer +
                "\n\tmodel=" + model +
                "\n\tscreenSize=" + screenSize +
                "\n\toperationSystem=" + operationSystem;
    }
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println("Błąd");
        } else if (buyer.cash < price) {
            System.out.println("Błąd");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Transakcja udana sprzedano"+ this + "za "+price);
        }

    }

    public void installAnApp(String appName) {}

    public void installAnApp(String appName, String appVersion) {}

    public void installAnApp(String appName, String appVersion, String appURL) {}

    public void installAnApp(List<String> appName) {}

    public void installAnApp(URL appURL) {}
}