package com.bkuku;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television myTelevision = new Television("Toshiba");

    @Test
    public void testThatProductNameIsSetFromManufacture(){

        assertEquals("Toshiba" , myTelevision.getProductName());
    }

    @Test
    public void testThatMyTelevisionCanBeSwitchedOn(){
        myTelevision.setOn(true);
        assertTrue(myTelevision.isOn());
    }
        @Test
        public void testThatMyTelevisionCanBeSwitchedoff(){
        myTelevision.setOn(false);
        assertFalse(myTelevision.isOn());
        }

        @Test
        public void testThatMyTelevisionVolumeCanBeIncreased(){
        myTelevision.increaseVolume();

    }
        @Test
        public void testThatMyTelevisionVolumeCanBeDecreased(){
        myTelevision.decreaseVolume();
    }



            @Test
            public void testThatMyTelevisionCanChangeChannelWhenSwitchedOn() {
                myTelevision.setOn(true);
                myTelevision.setChannel(9);


            }
        }






