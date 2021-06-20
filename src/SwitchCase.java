import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int number;
        Scanner kata = new Scanner(System.in);

        System.out.println("Enter Number Between 1 to 10");
        number = kata.nextInt();

        switch(number){

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");

            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;

            case 10:
                System.out.println("Ten");
                break;

            default:
                System.out.println("Default case");





        }
    }
}
