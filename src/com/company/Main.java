package com.company;

public class Main {

    public static void main(String[] args) {
        Human Joachim = new Human("Joachim", "Kaczmarczyk", "123456789", 5000.00);
        Animal dog = new Animal("dog");
        //dog.feed();
        //dog.takeForAWalk();

        Joachim.getSalary();
        Joachim.setSalary(6000.00);
    }
}