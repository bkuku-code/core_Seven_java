import java.util.Scanner;



    public class WorldPopulation {

        public static void main (String[] args){

            Scanner input = new Scanner(System.in);

            double firstYear;
            double secondYear;

            System.out.print("Enter firstYear");
            firstYear = input.nextDouble();

            if  (firstYear == 987_786_876.00)
                    System.out.println("correct");
            if (firstYear != 987_786_876.00)
                System.out.println("Error");




            System.out.print("Enter SecondYear");
            secondYear = input.nextDouble();

            if  ( secondYear == 876_875_985.00)
                System.out.println("correct");
            if (secondYear != 876_875_985.00)
                System.out.println("Error");








        }


}
