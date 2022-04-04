package com.samples.javademos.oops;

public class demo02Account {
    public static void main(String[] args) {
        Account myaccount = new Account("123456", 287.55, "John", "john@gmail.com", "9876543212");
        System.out.println(myaccount.getCustomerName());
        
        Account johnaccount = new Account("12567","John Doe");
        System.out.println(johnaccount);
        
        Account.CustomerAddress caddress = myaccount.new CustomerAddress(); //obj for inner class
       
    }

}
