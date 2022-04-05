package com.samples.javademos.oops2;

public class Fish extends Animal {
    private int gills;
    private int fins;
    private int eyes;
    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    
}
