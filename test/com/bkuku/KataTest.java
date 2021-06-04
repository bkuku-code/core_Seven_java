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
    void toShowTotalPiceResellerBuysBetweenOneToFourCopies(){
        Kata realKata =new Kata();
        assertEquals(3*1500, realKata.totalPriceResellerBuys(3));
    }
    @Test
    void toShowTotalPiceResellerBuysBetweenFiveToNineCopies(){
        Kata realKata = new Kata();
        assertEquals(6*1400, realKata.totalPriceResellerBuys(6));
    }
    @Test
    void toShowTotalPiceResellerBuysTenToTwentyNine(){
        Kata realKata = new Kata();
        assertEquals(10*1200, realKata.totalPriceResellerBuys(10));
    }
    @Test
    void toShowTotalPiceResellerBuysBetweenThirtyToFourtyNine(){
        Kata realKata = new Kata();
        assertEquals(35*1100, realKata.totalPriceResellerBuys(35));
    }
    @Test
    void toShowTotalPiceResellerBuysBetweenFiftyToNinetyNie(){
        Kata realKata = new Kata();
        assertEquals(50*1000, realKata.totalPriceResellerBuys(50));
    }
    @Test
    void toShowTotalPiceResellerBuysBetweenOneHundredToOneHundredAndNinetyNine(){
        Kata realKata = new Kata();
        assertEquals(100*900, realKata.totalPriceResellerBuys(100));
    }
    @Test
    void toShowTotalResellerProfitBetweenOneToFourCopies(){
        Kata realKata = new Kata ();
        assertEquals((4500*3)-(1500*3), realKata.totalResellerProfit(3));
    }
    @Test
    void toShowTotalResellerProfitBetweenFiveToNineCopies(){
        Kata  realKata = new Kata();
        assertEquals((8400*6)-(1400*6), realKata.totalResellerProfit(6));
    }
    @Test
    void toShowTotalResellerProfitBetweenTenToTwentyNineCopies(){
        Kata realKata = new Kata();
        assertEquals((12000*10)-(1200*10), realKata.totalResellerProfit(10));
    }
    @Test
    void toShowTotalResellerProfitBetweenThirthyToFourtyNineCopies(){
        Kata realKata = new Kata();
        assertEquals((38500*35)-(1100*35), realKata.totalResellerProfit(35));
    }
    @Test
    void toShowTotalResellerProfitBetweenFiftyToNinetyNineCopies(){
        Kata  realKata = new Kata();
        assertEquals((50000*50)-(1000*50), realKata.totalResellerProfit(50));
    }
    @Test
    void toShowTotalResellerProfitBetweenOneHundredToOneHundredAndNinetyNine() {
        Kata realKata = new Kata();
        assertEquals((90000 * 100) - (900 * 100), realKata.totalResellerProfit(100));
    }


    }



