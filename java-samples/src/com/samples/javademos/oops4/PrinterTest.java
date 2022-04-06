package com.samples.javademos.oops4;

public class PrinterTest {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count "+printer.getPagesPrinted());
        
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer.getPagesPrinted());
        System.out.println("----------");
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer.getPagesPrinted());
    System.out.println("--------");
    Printer printer2 = new Printer(50, false);
    pagesPrinted = printer2.printPages(2);
    System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer2.getPagesPrinted());
    System.out.println("--------");
    pagesPrinted = printer2.printPages(4);
    System.out.println("pages printed was "+pagesPrinted+" new total print count for printer= "+printer2.getPagesPrinted());
    }
}
