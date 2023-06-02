package com.core.java.pack2;

public class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the " + getYear() + " " + getMake() + " " + getModel() + " car...");
    }
}
