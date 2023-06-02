package com.inheritance.demo2;

public class Bike extends Vehicles {

	int numGears;
	
	public Bike(String manufacturer, String model, int yearProduction, int maxSpeed,int numGears) {
		super(manufacturer, model, yearProduction, maxSpeed);
		

		this.manufacturer=manufacturer;
		
		this.model=model;
		this.yearProduction=yearProduction;
		this.maxSpeed=maxSpeed;
		this.numGears=numGears;
	}

	@Override
	public void accelerate() {
	
       int currentSpeed=getMaxspeed();
		
		setMaxspeed(currentSpeed+10);
		
	}

	public int getNumGears() {
		return numGears;
	}

	

}
