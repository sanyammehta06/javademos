package com.samples.javademos.oops3;

public class TestComposition {

    public static void main(String[] args) {
        BoxCase boxCase = new BoxCase("220b","Dell","244");
        Monitor monitor= new Monitor("27 inch","Acer",27);
        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.444");
        PC pc = new PC(boxCase, monitor, motherBoard);
        pc.powerUp();
    }
}
