package com.company;

import java.io.File;

public class Animal {
    final private String species;
    public String name;
    private Double weight;
    public File pic;

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

    void feed() {
        if (weight > 0) {
            weight += 1.0;
            System.out.println("Was good, thx for food!");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }
}