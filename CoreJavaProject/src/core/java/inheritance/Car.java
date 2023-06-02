package core.java.inheritance;

public class Car extends Vehicles {

	String make;
	String model;
	double fuelEfficiency;
	
	public Car(int numWheels,int maxSpeed,String make,String model,double fuelEfficiency){
		
		super(numWheels,maxSpeed);
		
		this.make=make;
		this.model=model;
		this.fuelEfficiency=fuelEfficiency;
		
	}
     
	
	
	
}
