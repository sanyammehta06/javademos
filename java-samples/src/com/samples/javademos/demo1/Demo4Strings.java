package com.samples.javademos.demo1;

public class Demo4Strings {
public static void main(String[] args) {
	String s1 = "hello";
	String s2 = s1+ " world";
	String s3 = "45";
	
	int myint = Integer.parseInt(s3);
	System.out.println(myint);
	
	int x =10;
	s2 =s1+x;
	System.out.println(s2);
	
	double doublenum = 120.47d;
	String myStringdouble = "Hello"+doublenum;
	System.out.println("my string double= "+doublenum);

	String s4 = "45x";
	try {
	myint = Integer.parseInt(s4);   //gives number format exception
	}catch(NumberFormatException nfe) {
		System.out.println("Number format exception occured "+nfe.getMessage());
		throw nfe;
	}
	catch(Exception ex){
		System.out.println("failed to read user input "+ex);
		System.out.println("failed to read user input "+ex.getMessage());
		throw ex;   // the app will stop at this point
	}
	System.out.println(myint);   
}
}
