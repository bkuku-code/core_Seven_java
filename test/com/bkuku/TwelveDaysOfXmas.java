package com.bkuku;

public class TwelveDaysOfXmas {
    public static void main(String[] args) {
        int day = 1;
        String dayOf12 = "";
        while(day <= 12){
            switch (day){
                case 1: dayOf12 = "first";
                break;
                case 2: dayOf12 = "second";
                break;
                case 3: dayOf12 = "third";
                break;
                case 4: dayOf12 = "fourth";
                break;
                case 5: dayOf12 = "fifth";
                break;
                case 6: dayOf12 = "sixth";
                break;
                case 7: dayOf12 = "seventh";
                break;
                case 8 : dayOf12 = "eighth";
                break;
                case 9 : dayOf12 = "ninth";
                break;
                case 10 : dayOf12 = "tenth";
                break;
                case 11: dayOf12 = "eleventh";
                break;
                case 12 : dayOf12 = "twelveth";
                break;
            }
            System.out.printf("On the %s day of Christmas my true love gave to me\n", dayOf12);


            switch (day){
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a leaping");
                case 9:
                    System.out.println("nine ladies dancing");
                case 8:
                    System.out.println("eight maids a milking");
                case 7:
                    System.out.println("Seven swans a swimming");
                case 6:
                    System.out.println("six geese a laying");
                case 5:
                    System.out.println("five gold rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("three French hens");
                case 2:
                    System.out.println("Two turtle doves ");
                case 1:
                    System.out.println("and a partridge in a pear tree");
            }

            day++;
        }
    }
}

//    On the twelfth day of Christmas my true love gave to me
//        Twelve drummers drumming, eleven pipers piping
//        Ten lords a leaping, nine ladies dancing, eight maids a milking
//        Seven swans a swimming, six geese a laying, five gold rings
//        Four calling birds, three French hens
//        Two turtle doves and a partridge in a pear tree