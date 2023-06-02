package com.core.java;

import java.util.List;

public class House {
    private List<Room> rooms;
    private List<Furniture> furniture;
    private List<Appliance> appliances;

    public House(List<Room> rooms, List<Furniture> furniture, List<Appliance> appliances) {
        this.rooms = rooms;
        this.furniture = furniture;
        this.appliances = appliances;
    }
                                                      
    
    /* List<Room> rooms = new ArrayList<>();
    rooms.add(livingRoom);
    rooms.add(bedroom);
    rooms.add(kitchen);*/
    
    
    
    public List<Room> getRooms() {
		
		return rooms;
	}

	public List<Furniture> getFurniture() {
		
		return furniture;
	}

	public  List<Appliance>getAppliances() {
		
		return appliances;
	}

    
}
