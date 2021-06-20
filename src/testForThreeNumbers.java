import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testForThreeNumbers {

    private conditionalStatement statement = new conditionalStatement();



    @Test
    void findMaxForThreeNumbers(){
        int firstNumber = 23;
        int secondNumber = 24;
        int thirdNumber =  25;
        int maxNumber = statement.checkMaxNumber(firstNumber, secondNumber, thirdNumber);
        assertEquals(25 , maxNumber);

    }

    @Test
    void findMinForThreeNumber(){
        int firstNumber = 23;
        int secondNumber = 24;
        int thirdNumber = 25;
        int minNumber =  statement.checkMinNUmber(firstNumber, secondNumber, thirdNumber);
        assertEquals(23 , minNumber);








    }
}
