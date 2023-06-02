package com.core.java.pack2;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the " + getYear() + " " + getMake() + " " + getModel() + " motorcycle...");
    }
}
