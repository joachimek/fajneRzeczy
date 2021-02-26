package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "dog";
        dog.name = "fafik";
        dog.weight = 5.0;

        Phone teflon = new Phone();
        teflon.screenSize = 5.6;
        teflon.producer = "teflon incorporated";
        teflon.model = "10";
        teflon.operatingSystem = "teflOS";

        dog.feed();
    }
}
