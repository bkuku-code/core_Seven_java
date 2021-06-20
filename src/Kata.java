public class Kata {

    public static int findMaximumFrom(int[] numberArrays) {
        int max = numberArrays[0];
        int index = 1;
        while (index < numberArrays.length){
            if(max < numberArrays[index]){
                max = numberArrays[index];
            }
            index++;
        }
        return max;
    }


    public static int findMinimumFrom(int[] numberArrays) {
        int min = numberArrays[0];
        int index = 1;
        while (min > numberArrays.length) {
            if (min > numberArrays[index]) {
                min = numberArrays[index];
            }
            index++;

        }

        return min;
    }

    public static double findAverageFrom(double[] numberArrays) {

        int index = 0;
        double sum = 0;

        while (index < numberArrays.length){
           sum += numberArrays[index];
           index++;
        }

        return sum / numberArrays.length;

    }
}
