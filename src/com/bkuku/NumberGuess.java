package com.bkuku;

import java.util.Scanner;

public class NumberGuess {

    private static int guess;

    public static void main(String[] args) {

        int number = (int) (Math.random()*51);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess Number between 0 and 50");
        int guess = -6;
        while(guess != number) {

            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("excellent " + number);
//                break;
            } else if (guess < number) {
                System.out.println("Number Too low");
            } else
                System.out.println("Number Too High");
        }
        }
    }

