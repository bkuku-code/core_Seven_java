import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    void testThatFindMaximumNumber(){
        int[] numberArrays = {5, 76, 89,34, -2, 54, 65};
        assertEquals(89, Kata.findMaximumFrom(numberArrays));
    }
    @Test
    void testThatFindMinimumNumber(){
        int[] numberArrays = {5, 76, 89, 34, -2,54,65};
        assertEquals(5 , Kata.findMinimumFrom(numberArrays));
    }

    @Test
    void testThatFindAverageNumber(){
        double[] numberArrays = {5,76, 89, -2, 54, 65};
        assertEquals(47.833333333333336, Kata.findAverageFrom(numberArrays));

    }

}
