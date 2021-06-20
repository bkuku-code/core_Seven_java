import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        Scanner kata = new Scanner(System.in);

        int number1;
        int number2;


        System.out.println("Enter First Number");
        number1 = kata.nextInt();

        System.out.println("Enter Second Number");
        number2 = kata.nextInt();

        if (number1 == number2)
            System.out.println("Equal");

        if (number1 > number2)
            System.out.println("Larger");

        if (number1 < number2)
            System.out.println("Less");




        }
        }






