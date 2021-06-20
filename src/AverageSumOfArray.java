
public class AverageSumOfArray {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0]=10;
        a[1]=20;
        a[3]=70;
        a[4]=40;
        a[2]=50;

        double sum = 0;

        for(int i=0;i<a.length;i++)

            sum = sum + a[i];

        System.out.println("Sum : " + sum/a.length);


    }
}


