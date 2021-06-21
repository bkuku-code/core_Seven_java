import java.util.Scanner;

public class Addition {

   public static void main (String... args){
   
   Scanner input = new Scanner(System.in);
   
   int num1 = 10;
   int num2 = 20;
   int num3 = 30;
   int sum = (num1 + num2 + num3);

   System.out.print("Enter int");
   num1= input.nextInt();
   
   System.out.print("Enter int");
   num2= input.nextInt();
   
   System.out.print("Enter int");
   num3= input.nextInt();

   System.out.println("Sum :" +sum);

   }

}
   