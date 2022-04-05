package com.samples.javademos.oops2;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail) {
        super(name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    public void move(int speed) {
        System.out.println("Dog move() called");
        moveLegs(speed);
        super.move(speed);
    }

   
}
