package com.bkuku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike myBike = new Bike( "Honda");

         @Test
            public void testThatBikeHasProductName(){
             assertEquals("Honda" , myBike.getProductName());
    }
        @Test
        public void testThatBikeCanBeTurnedOn() {
        myBike.setOn(true);
        assertTrue(myBike.isOn());
    }
         @Test
        public void testThatBikeCanBeTurnedOff(){
        myBike.setOn(false);
        assertFalse(myBike.isOn());
    }
        @Test
         public void testForSpeedWhenAccelerating(){
             myBike.setOn(true);
//             assertEquals(myBike.getSpeed());
        }




    }









