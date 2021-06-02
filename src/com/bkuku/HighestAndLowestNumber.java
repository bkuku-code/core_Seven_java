package com.bkuku;

import java.util.Scanner;

    public class HighestAndLowestNumber {

        public static void main(String[] args) {

            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter 10 integers: ");

            for (int i = 0; i < 10; ++i) {

                int num = sc.nextInt();

                if (max < num)
                    max = num;

                if (min > num)
                    min = num;
            }
                    System.out.println("Highest integer is " + max);

                    System.out.println("Lowest integer is " + min);
                }
            }


