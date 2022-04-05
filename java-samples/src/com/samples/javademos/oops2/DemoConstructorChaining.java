package com.samples.javademos.oops2;

public class DemoConstructorChaining {
    public static void main(String[] args) {
        
    }
}

class Rectangle1 {
    private int x;    // x and y represent coordinates
    private int y;
    private int width;
    private int height;
    
    public Rectangle1() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle1(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;

    }
    
    public Rectangle1(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }
}
        //GOOD PRACTICE ---> CONSTRUCTOR CHAINING
class Rectangle2 {
    private int x;    // x and y represent coordinates
    private int y;
    private int width;
    private int height;
    
    public Rectangle2() {
        this(0,0,0,0);
    }
    
    public Rectangle2(int width, int height) {
        this(0,0,width,height);
    }
    
    public Rectangle2(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

   
}