package com.company;

public class Phone {
    final public String producer;
    final public String model;
    final public Double screenSize;
    public String operatingSystem;

    public Phone(String producer, String model, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
    }
}
