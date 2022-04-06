package com.samples.javademos.oops7.abstractclass;

public class testAbstraction {
    public static void main(String[] args) {
        Animal dog = new Dog("Thor");
        dog.eat();
        dog.breathe();
        
        Bird parrot = new Parrot("parrot");
        parrot.eat();
        parrot.fly();
    }
        
}
