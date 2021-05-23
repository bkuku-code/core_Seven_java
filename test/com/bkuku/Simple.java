
import java.util.Scanner;

public class Simple {
    public static void main(String[]  args){
        Scanner input = new Scanner (System.in);

        int Num1;
        int Num2 ;

        int Sum ;
        int Product;
        int Difference;
        int qoutient;

        System.out.println("Enter first Num");
        Num1 = input.nextInt();

        System.out.println("Enter second Num");
        Num2 =input.nextInt();

        int sum = Num1 + Num2;
        int product = Num1 * Num2;
        int difference = Num1 - Num2;
        qoutient = Num1 / Num2;


        System.out.println("Sum :"  +sum);
        System.out.println("Product:" +product);
        System.out.println("Difference:" +difference);
        System.out.println("Qoutient:" +qoutient);


    }
}