package com.bkuku;

/*
 Listing 5.5 writes a program that reads and calculates the sum of an unspecified number
 of integers. The input 0 signifies the end of the input.
*/


import java.util.Scanner;

public class Sentinel {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number (and stop when the number is 0): ");

            int kata = sc.nextInt();
            int sum = 0;

            while (kata != 0) {
                sum += kata;
                System.out.println("Enter Number (and stop when the number is 0): ");
                kata = sc.nextInt();
            }
            System.out.println("sum is :" + sum);


    }
}
