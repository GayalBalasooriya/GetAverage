package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = getIntegers(5);
	    for (int i=0;i<myIntegers.length;i++) {
            System.out.println("Element "+i+" typed value was "+myIntegers[i]);
        }
        System.out.println("The average is "+getAverage(myIntegers));
    }

    public static int[] getIntegers(int num) {
        System.out.println("Enter "+num+" integer values\r");
        int[] values = new int[num];
        for(int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++) {
            sum = sum+array[i];
        }
        return (double)sum/(double)array.length;
    }
}
