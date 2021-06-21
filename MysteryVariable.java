     import java.util.Scanner;

public class MysteryVariable{

  public static void main(String[] args){
	Scanner input = new Scanner (System.in);
        
	int mysteryNumber = 30;
	int stopProgram = 0;
	System.out.println("first Guess");
	int firstNumber = input.nextInt();
	
	if(firstNumber < mysteryNumber)
	System.out.println("The number is Low");

	if(firstNumber > mysteryNumber)
	System.out.println("The number is high");

	if(firstNumber == mysteryNumber)
	stopProgram = 1;
	
	if(stopProgram == 0){
		System.out.println("Guess again");
		firstNumber = input.nextInt();
	}

	if(firstNumber > mysteryNumber)
	System.out.println("The number is high");


	if(firstNumber < mysteryNumber)
	System.out.println("Your guess low as well");
	
	if(firstNumber == mysteryNumber)
	stopProgram = 1;
	
	if(stopProgram == 0){
		System.out.println("Guess again");
		firstNumber = input.nextInt();
	}

	

	if(firstNumber < mysteryNumber)
	System.out.println("Sorry, a wrong guess again");


	if(firstNumber > mysteryNumber)
	System.out.println("Sorry, a wrong guess again");
	
	if(stopProgram == 1) System.out.println("Congratulations, You guessed right");
	
}
 
}

