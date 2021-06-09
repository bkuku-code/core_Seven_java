package com.bkuku;

public class Pyramid {
    public static void main(String[] args) {

        int rows = 5;
        int column = 0;

        for(int i = 1; i<= rows ; ++i, column = 0){
            for(int space = 1; space <= rows -i; ++space){
                System.out.print(" ");
            }
                    while( column != 2 * i -1){
                        System.out.print(""+column);
                        ++column;
                    }
            System.out.println();
        }

    }
}
