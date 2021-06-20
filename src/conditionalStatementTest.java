import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class conditionalStatementTest {


    private conditionalStatement statement = new conditionalStatement();

    @BeforeEach
    void setUp() {
        int firstNumber = 23;
        int secondNumber = 76;

    }

    @AfterEach
    void tearDown() {
    }

        @Test
        void findMaxOfTwoNumbersTest(){
         int firstNumber = 23;
         int secondNumber = 34;

         int maxNumber = statement.getMaxNumber(firstNumber , secondNumber);

         assertEquals(34, maxNumber);

    }

        @Test
        void findMinOfTwoNumberTest(){
        int firstNumber =23;
        int secondNumber = 34;

        int minNumber = statement.getMinNumber(firstNumber, secondNumber);

        assertEquals(23,minNumber);
        }
}