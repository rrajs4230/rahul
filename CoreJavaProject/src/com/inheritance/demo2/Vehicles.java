package com.inheritance.demo2;

public abstract class Vehicles {

	
	String manufacturer; 
	String model; 
	int yearProduction; 
	int maxSpeed;
	
	public Vehicles(String manufacturer,String model,int yearProduction, int maxSpeed) {
		
		this.manufacturer=manufacturer;
		this.model=model;
		this.yearProduction=yearProduction;
		this.maxSpeed=maxSpeed;
	}
	
	public String getManufacturer() {
		
		return manufacturer;
	}
	
	public String getModel() {
		
		return model;
	}
	public void setModel(String model) {
		
		this.model = model;
	}
	public int getYearproduction() {
		
		return yearProduction;
	}
	
	public int getMaxspeed() {
		
		return maxSpeed;
	}
	public void setMaxspeed(int maxspeed) {
		
		this.maxSpeed = maxspeed;
	}  
	
	public abstract void accelerate();
	
}
