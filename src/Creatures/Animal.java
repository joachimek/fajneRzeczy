package Creatures;

import java.io.File;
import com.company.Saleable;
import com.company.Human;

public abstract class Animal implements Saleable, Feedable {
    final private String species;
    public String name;
    public Double weight;
    public File pic;

    private final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private final Double DEFAULT_DOG_WEIGHT = 7.0;
    private final Double DEFAULT_CAT_WEIGHT = 3.0;
    private final Double DEFAULT_COW_WEIGHT = 500.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog" -> weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> weight = DEFAULT_CAT_WEIGHT;
            case "cow" -> weight = DEFAULT_COW_WEIGHT;
            default -> weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    void takeForAWalk() {
        if (weight > 0) {
            weight -= 1.0;
            System.out.println("I'm losing weight");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }


    public void feed() {
        if (weight > 0) {
            weight += 1.0;
            System.out.println("Was good, thx for food!");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }

    public String toString() {
        return "Animal:" +
                "\n\tspecies=" + species +
                "\n\tweight=" + weight;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println("nie posiadasz tego zwierzęcia");

        } else if (buyer.cash < price) {
            System.out.println("nie masz wystarczająco środków");

        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("sprzedano" + this);
        }
    }

    public abstract void feed(double foodWeight);
}