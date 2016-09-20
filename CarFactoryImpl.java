package com.fannie.day6.assignment;
// creates the classes and hides implementation details from the user  
public class CarFactoryImpl {
	
	public static void main(String[] args) {
	 Icar c1 = CarFactory.createCar(1);
		c1.drive();
		
		Icar c2 = CarFactory.createCar(2);
		c2.drive();
		
		
	}
	

}
