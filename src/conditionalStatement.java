public class conditionalStatement{

    public static void main(String[] args) {

    }

    private int maxNumber ;
    private int minNumber;


    public int getMaxNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {

            maxNumber = firstNumber;
        } else
            maxNumber = secondNumber;
        return maxNumber;

    }


    public int getMinNumber(int firstNumber, int secondNumber) {

        if (firstNumber < secondNumber) {

            minNumber = firstNumber;
        } else
            minNumber = secondNumber;
        return minNumber;
    }


    public int checkMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < thirdNumber) {
            maxNumber = thirdNumber;
        }
        else if (firstNumber < secondNumber){
            maxNumber = secondNumber;
        }
        else
            maxNumber = thirdNumber;

        return  maxNumber;
    }


    public int checkMinNUmber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber){
            minNumber = firstNumber;
        }
        else if (secondNumber < firstNumber){
            minNumber = secondNumber;
        }
        else
            minNumber = thirdNumber;
        return minNumber;
    }
}