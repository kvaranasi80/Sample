package com.fannie.day6.assignment;
//Creates the Car depending on Volvo/ BMW
public class CarFactory {

	public static Icar createCar(int val) {
		if (val == 1) {
			return new BMW();
		}
		if (val == 2) {
			return new Volvo();
		}
		return null;

	}

	
}
