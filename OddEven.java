  import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter an integer: ");
        x = input.nextInt();

        System.out.printf("%d is %s\n", x, (x % 2 == 0 ? "even": "odd"));
    }
}