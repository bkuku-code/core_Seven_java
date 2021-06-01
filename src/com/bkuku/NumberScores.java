package com.bkuku;

import java.util.Scanner;

public class NumberScores {

    public static void main(String[] args) {

      int count = 0;
        int score = 0;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        while(score != -1){

            count++;
            total = total + score;

            System.out.print("Enter a Number or -1 to exit :");
            score = sc.nextInt();

        }
        System.out.println("The sum is " + total);
        System.out.println("The average is " + total / count);
  }



}
