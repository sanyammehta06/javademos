package com.samples.javademos.oops6.interfaces;

public class DeskPhone implements iTelephone {

    @Override
    public void powerOn() {
        System.out.println("No action. Always on");
        
    }

    @Override
    public void dial(int phoneNumber) {
      System.out.println("Now ringing"+phoneNumber+" on deskphone");        
    }

    @Override
    public void answer() {
        System.out.println("answering phone");        
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        System.out.println("calling ph num");
        return false;
    }

    @Override
    public boolean isRinging() {
        System.out.println("ph ringing");
        return false;
    }
    

}
