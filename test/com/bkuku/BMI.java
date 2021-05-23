package com.bkuku;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double Weight = 45.00;
        double height = 1.67;
        double BMI;


        System.out.println("Enter Weight");
        BMI = input.nextDouble();

        System.out.println("Enter height");
            BMI = input.nextDouble();

            double bmi = Weight / (height)*2;

        System.out.println("BMI:" +bmi);


    }
}
