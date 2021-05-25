package com.bkuku;

 import java.util.Scanner;
public class Kata {


    private String grade;
    private int totalPrice;
    private int costPrice;
    private int sellingPrice;
    private int resellerPrice;
    private int price;
    private int totalResellerProfit;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Num1 = input.nextInt();

        int Number1 = Num1 / 100;
        int Number2 = (Num1 / 10) % 10;
        int Number3 = (Num1 % 10);

        if (Number1 == Number3) {
            System.out.println("Number is Pallidium");
        } else {
            System.out.println("Number not Pallidium");
        }
    }
    public String DisplayGrade(int score) {

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public int totalPriceResellerBuys(int copies) {
        if (copies >= 1 && copies <= 4) {
            price = 1500;
            totalPrice = price * copies;
        } else if (copies >= 5 && copies <= 9) {
            price = 1400;
            totalPrice = price * copies;
        } else if (copies >= 10 && copies <= 29) {
            price = 1200;
            totalPrice = price * copies;
        } else if (copies >= 30 && copies <= 49) {
            price = 1100;
            totalPrice= price * copies;
        } else if (copies >= 50 && copies <= 99) {
            price = 1000;
            totalPrice = price * copies;
        } else if (copies >= 100 && copies <= 199) {
            price = 900;
            totalPrice = price*copies;
        }
            return totalPrice;
        }

         public int totalResellerProfit(int copies) {

         if(copies >= 1 && copies <= 4){
             costPrice = 1500;
             sellingPrice = 4500;
             totalResellerProfit = (sellingPrice * copies) - (costPrice * copies);
         }else if(copies >=5 && copies <= 9){
             costPrice = 1400;
             sellingPrice = 8400;
             totalResellerProfit = (sellingPrice * copies) - (costPrice * copies);
         }else if(copies >=10 && copies <= 29){
             costPrice = 1200;
             sellingPrice = 12000;
             totalResellerProfit = (sellingPrice * copies) - (costPrice * copies);
         }else if (copies >= 30 && copies <= 49){
             costPrice = 1100;
             sellingPrice = 38500;
             totalResellerProfit = (sellingPrice * copies) - (costPrice * copies);
         }else if (copies >=50 && copies <=99 ){
             costPrice = 1000;
             sellingPrice = 50000;
             totalResellerProfit = (sellingPrice * copies) - (costPrice * copies);
         }else if (copies >= 100 && copies <=  199) {
             costPrice = 900;
             sellingPrice = 90000;
             totalResellerProfit = (sellingPrice * copies) - (costPrice * copies);
         }

             return totalResellerProfit;

         }
         public class Factor{

             private static int number;

             public static void main(String[] args){
                Scanner scanner = new Scanner (System.in);

                int counter =0;
                int factor = 1;
                System.out.println("Enter Number");
                while (factor <= number){
                    if(number % factor ==0){

                        counter++;
                        factor++;
                    }

                }
            }
         }

    }






