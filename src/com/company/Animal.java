package com.company;

public class Animal {
    final private String species;
    private Double weight;
    private final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private final Double DEFAULT_DOG_WEIGHT = 7.0;
    private final Double DEFAULT_CAT_WEIGHT = 3.0;
    private final Double DEFAULT_COW_WEIGHT = 500.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                weight = DEFAULT_CAT_WEIGHT;
                break;
            case "cow":
                weight = DEFAULT_COW_WEIGHT;
                break;
            default:
                weight = DEFAULT_ANIMAL_WEIGHT;
                break;
        }
    }

    void takeForAWalk() {
        if (weight > 0) {
            weight -= 1.0;
            System.out.println("I'm losing weight");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }

    void feed() {
        if (weight > 0) {
            weight += 1.0;
            System.out.println("Was good, thx for food!");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }
}