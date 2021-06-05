
package com.bkuku;

import java.util.Scanner;

public class CBT {

    public static void main(String[] args) {

        int Number1 = (int) (Math.random()*10);
        int Number2 = (int) (Math.random()*10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Solve "+ Number1+ "+" + Number2+ "?" );
        int answer = sc.nextInt();

        while(Number1 + Number2 != answer){
            System.out.println("Wrong answer . Try again. solve " + Number1 + "+" +Number2 + "?");
            answer = sc.nextInt();
        }
        System.out.println("correct, Weldon");
    }
}