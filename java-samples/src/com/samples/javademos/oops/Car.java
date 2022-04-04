package com.samples.javademos.oops;

public class Car {
  private String fuelType;
  private int noOfWheels;
  private String gearType;
  private String colour;
  
public String getFuelType() {
    return fuelType;
}
public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
}
public int getNoOfWheels() {
    return noOfWheels;
}
public void setNoOfWheels(int noOfWheels) {
    this.noOfWheels = noOfWheels;
}
public String getGearType() {
    return gearType;
}
public void setGearType(String gearType) {
    this.gearType = gearType;
}
public String getColour() {
    return colour;
}
public void setColour(String colour) {
    this.colour = colour;
}
@Override
public String toString() {
    return "Car [fuelType=" + fuelType + ", noOfWheels=" + noOfWheels + ", gearType=" + gearType + ", colour=" + colour
            + "]";
}

  
  
 
}
