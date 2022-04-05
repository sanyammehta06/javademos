package com.samples.javademos.oops2;

public class StringHandling {
    public static void main(String[] args) {
        String s1 = new String("Hello World");
        System.out.println(s1.length());
        
        String sub = new String("Welcome");
        System.out.println(sub.substring(2));
        
        String s3 = "World";
        String s4 = "Word";
        System.out.println(s3.compareTo(s4));   // 0 = both are same, <0 = s3<s4, >0 = s3>s4
        
        String s5 = "";
        System.out.println(s5.isEmpty());
        
        StringBuffer sb =  new StringBuffer("Hello World");
        System.out.println(sb.toString());
        sb.append(" to ");
        sb.append("everyone.");
        System.out.println(sb.toString());
        sb.replace(6, 11,"Java");
        System.out.println(sb.toString());
        
        StringBuilder sb1 = new StringBuilder("Happy");
        sb1.append(" kids");
        System.out.println(sb1.toString());

    }
}
