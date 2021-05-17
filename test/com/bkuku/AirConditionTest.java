package com.bkuku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionTest {

    AirCondition myAircondition = new AirCondition("Toshiba");

    @Test
    public void testThatProductNameIsSetOnCreation(){
        assertEquals("Toshiba", myAircondition.getProductName());
    }

    @Test
    public void testThatAirConditionCanBeTurnedOn(){
        myAircondition.setOn(true);
        assertTrue(myAircondition.isOn());
    }

        @Test
        public void testThatAirConditionCanBeTurnedOff(){
            myAircondition.setOn(false);
            assertFalse(myAircondition.isOn());

        }

        @Test
        public void testThatWhenAirConditionIsOffTemperatureDoesNotIncrease(){
            myAircondition.setOn(false);
            myAircondition.increaseTemperature();
            assertEquals(16, myAircondition.getTemperature());
        }

        @Test
        public void testThatWhenAirConditionIsOnTemperatureIncrease(){
            myAircondition.setOn(true);
            myAircondition.increaseTemperature();
            assertEquals(17, myAircondition.getTemperature());
        }

        @Test
        public void testThatTemperatureCannotExceed30(){
            myAircondition.setOn(true);
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();
            myAircondition.increaseTemperature();

            assertEquals(30, myAircondition.getTemperature());
        }

    @Test
    public void testThatWhenAirConditionIsOffTemperatureDoesNotDecrease(){
        myAircondition.setOn(false);
        myAircondition.decreaseTemperature();
        assertEquals(16, myAircondition.getTemperature());
    }

    @Test
    public void testThatWhenAirConditionIsOnTemperatureDoesNotDecreaseBelow16(){
        myAircondition.setOn(true);
        myAircondition.decreaseTemperature();
        assertEquals(16, myAircondition.getTemperature());
    }

    @Test
    public void testThatWhenAirConditionIsOnTemperatureDecrease(){
        myAircondition.setOn(true);
        myAircondition.increaseTemperature();
        myAircondition.increaseTemperature();
        myAircondition.decreaseTemperature();
        assertEquals(17, myAircondition.getTemperature());
    }



}
