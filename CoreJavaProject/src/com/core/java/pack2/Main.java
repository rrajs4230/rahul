package com.core.java.pack2;

public class Main {

	public static void main(String[] args) {

		Vehicle car = new Car("Honda", "Civic", 2022);
        Vehicle truck = new Truck("Ford", "F-150", 2022);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2021);

        car.start();
        car.drive();
        car.stop();

        truck.start();
        truck.drive();
        truck.stop();

        motorcycle.start();
        motorcycle.drive();
        motorcycle.stop();

	}

}
