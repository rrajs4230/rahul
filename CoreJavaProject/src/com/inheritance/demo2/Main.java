package com.inheritance.demo2;


public class Main {

	public static void main(String[] args) {
		
		
		Car car = new Car("Tesla", "IndiaTesla", 2022, 120,4);
		
		car.accelerate();
        System.out.println("Manufacturer: " + car.getManufacturer());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year of Production: " + car.getYearproduction());
        System.out.println("Max Speed: " + car.getMaxspeed());
        System.out.println("Number of Doors: " + car.getNumDoors());
        System.out.println();
		
		
		
		Bike bike = new Bike("Harley-Davidson", "India-Harley-Davidson", 2021, 180, 2);
		
		

		bike.accelerate();
        System.out.println("Manufacturer: " + bike.getManufacturer());
        System.out.println("Model: " + bike.getModel());
        System.out.println("Year of Production: " + bike.getYearproduction());
        System.out.println("Max Speed: " + bike.getMaxspeed());
        System.out.println("Number of Gears: " + bike.getNumGears());
	}

}
