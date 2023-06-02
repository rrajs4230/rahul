package com.core.java;

public class Appliance {
    private String applianceName;
    private int appliancePower;

    public Appliance(String applianceName, int appliancePower) {
        this.applianceName = applianceName;
        this.appliancePower = appliancePower;
    }

	public String getApplianceName() {
		
		return applianceName;
	}

	public int getAppliancePower() {
		
		return appliancePower;
	}

}

