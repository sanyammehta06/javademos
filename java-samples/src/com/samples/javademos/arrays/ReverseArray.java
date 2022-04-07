package com.samples.javademos.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,44,55};
        System.out.println(Arrays.toString(a1));
        
        int[] a2 = reverseArray(a1);
        System.out.println("reverse array is: "+Arrays.toString(a1));

        
    }

    private static int[] reverseArray(int[] a1) {
        int i=0;
        int j = a1.length-1;
        while(i<j) {
            int temp = a1[i];
            a1[i] = a1[j];
            a1[j] = temp;
            i++; j--;
        }
        return a1;
    }
}
