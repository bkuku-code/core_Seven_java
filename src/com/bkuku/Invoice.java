package com.bkuku;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;



    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;


    }

    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartDescription() {

        return partDescription;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double getAccountInvoice(){
        return  quantity * price;

    }
}



