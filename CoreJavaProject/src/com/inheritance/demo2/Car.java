package com.inheritance.demo2;

public class Car extends Vehicles {

	int numDoors;
	
	public Car(String manufacturer, String model, int yearProduction, int maxSpeed,int  numDoors) {
		super(manufacturer, model, yearProduction, maxSpeed);
		
		this.manufacturer=manufacturer;
		
		this.model=model;
		this.yearProduction=yearProduction;
		this.maxSpeed=maxSpeed;
		this.numDoors=numDoors;
		
	}
	
	
	
	public int getNumDoors() {
		return numDoors;
	}

	


	@Override
	public void accelerate() {
		
		int currentSpeed=getMaxspeed();
		
		setMaxspeed(currentSpeed+10);
	}

	


	
}
