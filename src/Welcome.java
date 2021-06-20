
import java.util.Scanner;
public class Welcome {

    public static void main(String[] args) {

        int number1;
        int number2;
        int sum;
        Scanner kata = new Scanner(System.in);

        System.out.println("Enter First NUmber");
        number1 = kata.nextInt();

        System.out.println("Enter  Second Number");
        number2 = kata.nextInt();

        sum = number1 + number2;

        System.out.println("Sum :" +sum);






    }
}
