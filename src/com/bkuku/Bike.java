package com.bkuku;

public class Bike {
    private  String productName;
    private boolean isOn;
    private int speed;

    public Bike(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }

    public void setOn(boolean isOn) {
        this.isOn =isOn;
    }
    public boolean isOn() {
        return isOn;
    }
    public void accelerate() {
        speed = speed + 1;

    }

    public void decelerate() {
        speed = speed -1;
}
}



