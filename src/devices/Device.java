package devices;

public class Device {
    public String model;
    public String producer;
    public int yearOfProduction;

    /*public Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }*/

    public String toString() {
        return "Animal:" +
                "\n\tmodel=" + model +
                "\n\tproducer=" + producer +
                "\n\tyearOfProduction=" + yearOfProduction;
    }

    public void turnOn() {
        System.out.println("bleep blon i've been turned on");
    }
}
