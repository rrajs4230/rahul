package core.java.inheritance;

public class Bicycles extends Vehicles {

	double frameSize;
	int numGears;
	
	public Bicycles(int numWheels,int maxSpeed,double frameSize, int numGears) {
		
		super(numWheels,maxSpeed);
		
		this.frameSize=frameSize;
		this.numGears=numGears;
		
	}

	
}
	
	
	

