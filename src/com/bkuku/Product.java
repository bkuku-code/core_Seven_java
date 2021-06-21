   import java.util.Scanner;

public class Product {

 public static void main(String... args) {
 
 Scanner input = new Scanner(System.in);
 
  int num1 = 2;
  int num2 = 3; 
  int num3 = 4;
  int product = (num1 * num2 * num3);

  System.out.print("Enter int");
  num1 = input.nextInt();

  System.out.print("Enter int");
  num2 = input.nextInt();

  System.out.print("Enter int");
    num3 = input.nextInt();

  System.out.println("Product :" +product);
 
 }

}