package com.brideglabz.arrayhandling;

import java.util.Scanner;

public class PrintTheElements {
    public static void printElement(){
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();
        int [] array1 = new int[array];
        for (int i = 0; i< array1.length; i++){
            array1[i] = i*10;
            System.out.println(array1[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("print the elements of an array");
       printElement();
    }
}
//1) Java Program to print the elements of an array
