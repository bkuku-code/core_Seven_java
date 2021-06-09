package com.bkuku;

/*
        Listing 5.5 writes a program that reads and calculates the sum of an unspecified number
        of integers. The input 0 signifies the end of the input.
 */

import java.util.Scanner;

public class DoWhile {
//    private static int kata;
//    private static int sum;

    public static void main(String[] args) {

        int kata;
        int sum = 0;
        int product = 1;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.println("Enter Integer (and stop when 0 is imputed):" );
            kata = kb.nextInt();
            sum += kata;
            product *= kata;
        } while (kata != 0);

        System.out.println("Product =  " + product);


    }
}
