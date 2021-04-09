package com.company;

public class Car {
    private final String color;
    public Double price;
    final private String model;
    final private String producer;

    public Car(String color, String model, String producer, Double price) {
        this.color = color;
        this.model = model;
        this.producer = producer;
        this.price = price;
    }
}