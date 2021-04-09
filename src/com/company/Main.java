package com.company;

public class Main {

    public static void main(String[] args) {
        Human Joachim = new Human("Joachim", "Kaczmarczyk", "123456789", 5000.00);
        Animal dog = new Animal("dog");
        //dog.feed();
        //dog.takeForAWalk();

        //Joachim.getSalary();
        //Joachim.setSalary(6000.00);

        Car car1 = new Car("red","golf 2","volkswagen",2000.00);
        Joachim.setAuto(car1);
        Car car2 = new Car("red","golf 2","volkswagen",10000.00);
        Joachim.setAuto(car2);
        Car car3 = new Car("red","golf 2","volkswagen",100000.00);
        Joachim.setAuto(car3);

        System.out.println(Joachim.getAuto());
    }
}