package com.core.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		    Room livingRoom = new Room("Living Room", 200);
	        Room bedroom = new Room("Bedroom", 150);
	        Room kitchen = new Room("Kitchen", 100);

	        // create some furniture
	        Furniture sofa = new Furniture("Sofa", 50);
	        Furniture bed = new Furniture("Bed", 30);
	        Furniture table = new Furniture("Table", 20);
	        Furniture chair = new Furniture("Chair", 10);

	        // create some appliances
	        Appliance fridge = new Appliance("Fridge", 1000);
	        Appliance oven = new Appliance("Oven", 2000);
	        Appliance tv = new Appliance("TV", 500);

	        // add the rooms, furniture, and appliances to a house
	        List<Room> rooms = new ArrayList<>();
	        rooms.add(livingRoom);
	        rooms.add(bedroom);
	        rooms.add(kitchen);

	        List<Furniture> furniture = new ArrayList<>();
	        furniture.add(sofa);
	        furniture.add(bed);
	        furniture.add(table);
	        furniture.add(chair);

	        List<Appliance> appliances = new ArrayList<>();
	        appliances.add(fridge);
	        appliances.add(oven);
	        appliances.add(tv);

	        House house = new House(rooms, furniture, appliances);

	        // display the details of the house
	        System.out.println("House Details:");
	        System.out.println("--------------");
	        System.out.println("Rooms:");
	        for (Room room : house.getRooms()) {
	        	System.out.println(room.getRoomName() + " - " + room.getRoomSize() + " sq.ft.");
	        }
	        System.out.println("Furniture:");
	        for (Furniture furn : house.getFurniture()) {
	            System.out.println(furn.getFurnitureName() + " - " + furn.getFurnitureSize() + " sq.ft.");
	        }
	        System.out.println("Appliances:");
	        for (Appliance appl : house.getAppliances()) {
	            System.out.println(appl.getApplianceName() + " - " + appl.getAppliancePower() + " watts");

	}
	}
}
