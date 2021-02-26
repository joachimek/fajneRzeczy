package com.company;

public class Main {

    public static void main(String[] args) {
        //creates new object of the Animal class
        Animal dog = new Animal("dog", 2.0, "fafik");

        //creates new object of the Phone class
        Phone teflon = new Phone("teflon incorporated", "10", 5.6);
        //adds attributes for teflon object
        teflon.operatingSystem = "teflOS";

        //use the feed method from the object called dog
        dog.feed();

        //creates new object of the Human class
        Human me = new Human();
        //adds attributes for the me object
        me.firstName = "joachim";
        me.lastName = "kaczmarczyk";
        me.phone = "123456789";
        //assigns the dog object to me
        me.pet = dog;

        //prints the name of the pet assigned to me
        System.out.println(me.pet.name);
    }
}
