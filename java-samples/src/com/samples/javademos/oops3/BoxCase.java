package com.samples.javademos.oops3;

public class BoxCase implements IFlyable {
    private String model;
    private String manufacturer;
    private String powerSupply;

    public BoxCase(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }
    public BoxCase() {
        this(null, null, null);
    }

    public void pressPowerButton() {
        System.out.println("power button pressed!!");
    }
    @Override
    public void fly() {
        System.out.println("Boxcase is flying....");
    }
}
