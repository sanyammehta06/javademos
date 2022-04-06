package com.samples.javademos.oops7.abstractclass;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking");                
    }

    @Override
    public void breathe() {
        System.out.println("birds breathing!!!");        
    }
    public abstract void fly();

}
