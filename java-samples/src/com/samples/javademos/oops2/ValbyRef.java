package com.samples.javademos.oops2;

public class ValbyRef {
    public static void main(String[] args) {
        House bluehouse = new House("blue");
        House anotherhouse = bluehouse;
        
        System.out.println(bluehouse.getColor());
        System.out.println(anotherhouse.getColor());
        
        anotherhouse.setColor("red");
        System.out.println(bluehouse.getColor());
    }
}
