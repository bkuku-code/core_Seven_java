package com.bkuku;
/*
get the Number of 15 students
set the number to start from 1
while the Number is less and equals to the total numbers of student
let the summation of the Number of the students equals to the inputed number and the students number
let the number be increased by 1

 */

import java.util.Scanner;

public class StudentsNumber {

    public static void main(String[] args){

        int Number =1;
        int Sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sum + Number");
        while (Number <= 15){
            Sum = Sum + Number;

            Number++;
            System.out.println("Summation: " +Sum);

        }
    }
}


