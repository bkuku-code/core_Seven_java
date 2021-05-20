package com.bkuku;

/* User should to provide students grade;
   If the students get 90% and above, the result should show "A".
   If students get between 80 to 89%, the result should show "B".
   If Student gets between 70 to 79%, the result should show "C".
   If Student gets between 60 to 69%, the result should show "D".
   If Student gets 50% and below, the result should show "F"

 */

import java.util.Scanner;

public class StudentGrade2 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int Grade;
        System.out.print("Enter Number : ");

        Grade = input.nextInt();

        if (Grade >= 90) {
            System.out.println("A");
        }else if( Grade >= 80){

            System.out.println("B");
        }else if (Grade >=70){
            System.out.println("C");
        }else if (Grade>= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");

        }







    }
}


