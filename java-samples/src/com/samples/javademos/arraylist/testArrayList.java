package com.samples.javademos.arraylist;

import java.util.ArrayList;
import java.util.List;

public class testArrayList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("hello");
        strList.add("world");
        strList.add("simplilearn");
        strList.add("java");
        strList.add("phase1");
        System.out.println(strList);
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(null);
        System.out.println("list1: "+list1);
        list1.remove(0);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.add(3,120);
        System.out.println(list1);
        list1.set(2, 200);
        System.out.println(list1);


    }
}
