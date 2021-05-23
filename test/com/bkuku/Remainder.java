package com.bkuku;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);

        int Num1;
        int Num2;
        int Sum;

        System.out.println("Enter first Number");
        Num1 = input.nextInt();

        System.out.println("Enter second Number");
        Num2 = input.nextInt();

        int sum = Num1 % Num2;

        System.out.println("Sum: " +sum);

    }
}
