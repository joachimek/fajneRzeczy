package com.company;

public class Main {

    public static void main(String[] args) {
        Human Joachim = new Human("Joachim", "Kaczmarczyk", "123456789");
        Animal dog = new Animal("dog");
        dog.feed();
        dog.takeForAWalk();

        Joachim.auto = new Car("silver", "Golf 2", "Volkswagen");

    }
}