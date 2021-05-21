package com.bkuku;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {

    Invoice myInvoice = new Invoice("101" , "Goods",15, 24.00);

    @Test
    public void testForPartNumber(){
        assertEquals("101" ,myInvoice.getPartNumber());
    }
    @Test
    public void testForPartDescription(){
        assertEquals("Goods", myInvoice.getPartDescription());
    }

    @Test
    public void testForQuantity(){
        assertEquals(15, 15, myInvoice.getQuantity());

    }
    @Test
    public void testForPrice(){
        assertEquals(24.00 , myInvoice.getPrice());
    }
        @Test
        public void testAccountInvoice(){
         myInvoice.setPrice(24.00);
         myInvoice.setQuantity(15);
         assertEquals(360.00,myInvoice.getAccountInvoice());
        }
    }




