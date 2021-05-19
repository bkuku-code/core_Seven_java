package com.bkuku;


import java.util.Scanner;

public class NumberInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Number;

        System.out.print("Enter Number : ");

        Number = input.nextInt();

        if (Number >= 60){
            System.out.println("pass");

        }else{

            System.out.println("fail");

        }






    }


}
