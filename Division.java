      import java.util.Scanner;
 
 public class Division{

   public static void main(String[] args){

   Scanner input = new Scanner(System.in); 

   int num1 = 25;
   int num2 = 5;
   int division = (num1 / num2);

   System.out.print("Enter int");
   num1 = input.nextInt();

   System.out.print("Enter int");
   num2 = input.nextInt();

   System.out.println("Division:" +division);

}

}