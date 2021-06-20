import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int age = 10;

        System.out.print("Enter age");
        age = input.nextInt();

        if (age < 10 || age < 30) {
            System.out.println("You are welcome");
        }
        else
            System.out.println("Bye");
    }
}
