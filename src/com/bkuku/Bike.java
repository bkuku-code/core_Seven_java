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
    public void setAcceleration(boolean isOn) {
        this.isOn =isOn;
    }
    public void setDeccelerate(boolean isOn) {
        this.isOn =isOn;
    }
    public void Speed() {
        if(isOn && speed>= 99);
            speed = speed +5;
    }

    }

