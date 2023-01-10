package com.brideglabz.arrayhandling;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void secondLargestNumber(){
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of Elements :");
        for (int i =0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Second Largest Element in array is :" +array[array.length-2]);
        System.out.println("First Largest Element in array is :" +array[array.length-1]);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the  2nd Largest Number program");
       secondLargestNumber();
    }
}
//10) Find 2nd Largest Number in an Array
