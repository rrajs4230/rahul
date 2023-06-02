package com.core.java.pack2;

public abstract class Vehicle implements Drivable{
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void stop() {
        System.out.println("Stopping the vehicle...");
    }

    public abstract void drive();
}

