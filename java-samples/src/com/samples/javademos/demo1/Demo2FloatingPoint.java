package com.samples.javademos.demo1;

public class Demo2FloatingPoint {
	public static void main(String[] args) {
	//	System.out.println(Float.MIN_VALUE);
//		System.out.println(Float.MAX_VALUE);
	int intVal = 5;
	float floatVal  =5.25f;
	double doubleVal = 5.25d;
	
	intVal = 5/2;
	floatVal = 22f/7f;
	doubleVal = 22d/7d;
	
	System.out.println(intVal);
	System.out.println(floatVal);
	System.out.println(doubleVal);    //more precise result
}
}
