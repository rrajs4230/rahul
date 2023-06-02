package com.core.java.pack2;


public abstract class Bike{ 
		Bike(){
			
		System.out.println("bike is created");
		
		} 
		
		abstract void run(); 
		
		void changeGear(){
			
		System.out.println("gear changed");
		}
		
		void maxspeed()
		{
			
			System.out.println("100km/h");
		}
		
  } 
		//Creating a Child class which inherits Abstract class 
		class Honda extends Bike{ 
		void run(){
			
			
		System.out.println("running safely..");
		} 
		
		void applyBrake()
		{
			
			System.out.println("apply break");
		}
		
		
	 } 
		//Creating a Test class which calls abstract and nonabstract methods 
		class TestAbstraction2{ 
			
		public static void main(String args[]){ 
			
			
		Bike obj = new Honda(); 
		
		obj.run(); 
		
		obj.changeGear(); 
		obj.maxspeed();
		
		Honda hondaObj = new Honda();
		
		hondaObj.changeGear();
		hondaObj.run();
		
		hondaObj.applyBrake();
		
		hondaObj.maxspeed();
	
		Honda hondaObj2 = (Honda) obj;
		
		hondaObj2.applyBrake();
		hondaObj2.run();
		hondaObj2.changeGear();
		hondaObj2.maxspeed();
		System.out.println(obj==hondaObj2);
		
   } 
		
		
		
}
		
/*In the given line of code Bike obj = new Honda();, we are creating an instance of the Honda class and assigning it to a reference variable of the Bike type. At compile-time, the compiler only knows that obj is of type Bike, which means that it only knows about the methods that are declared in the Bike class. Therefore, when we call the run() method on obj, the compiler checks if there is a declaration of the run() method in the Bike class.

However, since Honda is a subclass of Bike, it overrides the run() method declared in the Bike class. This means that at runtime, when the run() method is called on obj, the JVM will dynamically dispatch the method call to the implementation of the run() method in the Honda class, because the actual type of the object that obj refers to is Honda.

Similarly, when the changeGear() method is called on obj, the method is not overridden in the Honda class, so the implementation of the changeGear() method in the Bike class is executed.

This is the beauty of dynamic dispatch in Java, as it allows us to write code that can work with objects of different classes that share the same interface or inheritance hierarchy. We can write code that is polymorphic, meaning it can behave differently based on the actual type of the objects it is working with.*/
