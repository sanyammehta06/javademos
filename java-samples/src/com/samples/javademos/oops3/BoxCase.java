package com.samples.javademos.oops3;

public class BoxCase {
    private String model;
    private String manufacturer;
    private String powerSupply;

    public BoxCase(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("power button pressed!!");
    }

}
