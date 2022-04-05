package com.samples.javademos.oops3;

public class Monitor {
        private String model;
        private String manufacturer;
        private int size;
        public Monitor(String model, String manufacturer, int size) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.size = size;
        }
        public void drawPixelAt(int x, int y, String color) {
            System.out.println("Drawing pixel at "+x+", "+y+" in color "+color);
        }
        
}
