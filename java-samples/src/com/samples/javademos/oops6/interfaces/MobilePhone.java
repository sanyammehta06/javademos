package com.samples.javademos.oops6.interfaces;

public class MobilePhone implements iTelephone {

    @Override
    public void powerOn() {
        System.out.println("Powering on mobile phone");
        
    }

    @Override
    public void dial(int phoneNumber) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isRinging() {
        // TODO Auto-generated method stub
        return false;
    }

}
