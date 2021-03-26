package com.company;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Car auto;

    public Human(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    void write() {
        System.out.println("Hi " + firstName);
    }
}
