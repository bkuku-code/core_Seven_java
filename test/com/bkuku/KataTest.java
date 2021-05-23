package com.bkuku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void displayGrade() {
        Kata realKata = new Kata();
        assertEquals("A", realKata.DisplayGrade(90));
    }

    @Test
    void toDisplayGradeForB() {
        Kata realKata = new Kata();
        assertEquals("B", realKata.DisplayGrade(80));
    }

    @Test
    void toDisplayGradeForC() {
        Kata realKata = new Kata();
        assertEquals("C", realKata.DisplayGrade(70));
    }

    @Test
    void toDisplayGradeForD() {
        Kata realKata = new Kata();
        assertEquals("D", realKata.DisplayGrade(60));
    }

    @Test
    void toDisplayGradeForF() {
        Kata realKata = new Kata();
        assertEquals("F", realKata.DisplayGrade(50));

    }
    @Test
    void toShowTotalValueForPurchaseBetweenOneToFourCopies(){
        Kata realKata =new Kata();
        assertEquals(3*1500, realKata.totalPriceResellerBuys(3));
    }
    @Test
    void toShowTotalValuePurchaseBetweenFiveToNineCopies(){
        Kata realKata = new Kata();
        assertEquals(6*1400, realKata.totalPriceResellerBuys(6));
    }
    @Test
    void toShowTotalValuePurchaseBetweenTenToTwentyNine(){
        Kata realKata = new Kata();
        assertEquals(10*1200, realKata.totalPriceResellerBuys(10));
    }
    @Test
    void toShowTotalValuePurchaseBetweenThirtyToFourtyNine(){
        Kata realKata = new Kata();
        assertEquals(35*1100, realKata.totalPriceResellerBuys(35));
    }
    @Test
    void toShowTotalValuePurchaseBetweenFiftyToNinetyNie(){
        Kata realKata = new Kata();
        assertEquals(50*1000, realKata.totalPriceResellerBuys(50));
    }
    @Test
    void toShowTotalValuePurchaseBetweenOneHundredToOneHundredAndNinetyNine(){
        Kata realKata = new Kata();
        assertEquals(100*900, realKata.totalPriceResellerBuys(100));
    }
    @Test
    void toShowProfitBetweenOneToFourCopies(){
        Kata realKata = new Kata ();
        assertEquals((4500*3)-(1500*3), realKata.totalResellerProfit(3));
    }
    @Test
    void toShowProfitBetweenFiveToNineCopies(){
        Kata  realKata = new Kata();
        assertEquals((8400*6)-(1400*6), realKata.totalResellerProfit(6));
    }
    @Test
    void toShowProfitBetweenTenToTwentyNineCopies(){
        Kata realKata = new Kata();
        assertEquals((12000*10)-(1200*10), realKata.totalResellerProfit(10));
    }
    @Test
    void toShowProfitBetweenThirthyToFourtyNineCopies(){
        Kata realKata = new Kata();
        assertEquals((38500*35)-(1100*35), realKata.totalResellerProfit(35));
    }
    @Test
    void toShowProfitBetweenFiftyToNinetyNineCopies(){
        Kata  realKata = new Kata();
        assertEquals((50000*50)-(1000*50), realKata.totalResellerProfit(50));
    }
    @Test
    void toShowProfitBetweenOneHundredToOneHundredAndNinetyNine() {
        Kata realKata = new Kata();
        assertEquals((90000 * 100) - (900 * 100), realKata.totalResellerProfit(100));

    }


}
