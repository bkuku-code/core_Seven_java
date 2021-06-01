package com.bkuku;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 0;
        String reverseNum = "";
        System.out.println("Input the Number and press Enter: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num != 0){
            int digit = num % 10;
            reverseNum += digit;
            num = num / 10;
        }
                System.out.println("Reverse of input number is: " + reverseNum);
    }
}
