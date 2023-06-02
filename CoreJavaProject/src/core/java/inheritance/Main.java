package core.java.inheritance;

import com.core.java.pack2.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		 Vehicles vehicle = new Vehicles(4, 120);
		
		Car car = new Car(6, 120, "Mercedes-Benz", "Mercedes-Benz G-Class", 16);
		  
		System.out.println("---Car Specification----");
		
		System.out.println("number of wheels:"+vehicle.numWheels+"   "+"Miximum Speed:"+vehicle.maxSpeed+"mpg");
		System.out.println("Car is a " + car.make + " " + car.model + " with " + car.numWheels + " wheels, a max speed of " + car.maxSpeed + " mph, and a fuel efficiency of " + car.fuelEfficiency + " mpg.");
		
		Bicycles bicycle = new Bicycles(2, 5, 17.5,2);
		
		System.out.println("---Bicycle Specification----");
     
		 System.out.println("Bicycle has " + bicycle.numWheels + " wheels, a max speed of " + bicycle.maxSpeed + " mph, a frame size of " + bicycle.frameSize + " inches, and " + bicycle.numGears + " gears.");
		
	}

}
