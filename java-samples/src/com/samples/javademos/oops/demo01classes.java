package com.samples.javademos.oops;

public class demo01classes {
	public static void main(String[] args) {
		Car hondaCity = new Car();
		
		Car.someProp = "this is a static prop";
		Car.printSomething();
		
		hondaCity.setColour("white");
		hondaCity.setFuelType("Petrol");
		hondaCity.setGearType("automatic");
		hondaCity.setNoOfWheels(5);
		System.out.println("the colour of hondacity car: "+ hondaCity); // calling object means calling either default or over-ridden toString() function.
		System.out.println(Car.someProp);
		
		Car marutiSwift = new Car();
		marutiSwift.setColour("white");
		marutiSwift.setFuelType("petrol");
		marutiSwift.setGearType("automatic");
		marutiSwift.setNoOfWheels(5);
		System.out.println("marutiSwift: "+ marutiSwift);
		System.out.println(Car.someProp);
	}
}
