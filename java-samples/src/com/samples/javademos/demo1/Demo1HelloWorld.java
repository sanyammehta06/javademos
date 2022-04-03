package com.samples.javademos.demo1;

public class Demo1HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world demo");
		
		int x=6, y=5;
		System.out.println("the total is "+x+y);   //implicit casting.
		
		byte xbyte=10;
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short xshort=10;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int intx = xbyte;
		System.out.println("value of intx:"+intx);   //implicit casting- happens automatically as byte value can easily fit in int container

		int inty=20;
		// byte by = inty;   err bc int value cannot fit into byte container, so we need explicit casting.
		
		byte by = (byte)inty; // int value type casted to byte. 20 lies in range of both int as well as byte. so explicit casting possible.
		System.out.println(by);  
	 
		inty = 200;
		by = (byte) inty;  //range of byte is [-128,127] only. so cannot fit a bigger number like 200
		System.out.println("will throw some invalid number"+by);
	}
}
