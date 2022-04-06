package com.samples.javademos.oops4;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>=1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    
    public int addToner(int tonerAmount) {
        if(tonerAmount>0 && tonerAmount<=100) {
            if(tonerLevel+tonerAmount > 100) return -1;
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        return -1;
    }
    
    public int printPages(int pages) {
        System.out.println("printing "+pages+" number of pages");
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
    
}
