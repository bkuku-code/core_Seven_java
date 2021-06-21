package com.bkuku;

public class AirCondition {


    private String productName;
    private boolean isOn;
    private int temperature = 16;

    public AirCondition(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }


    public void increaseTemperature() {
        if(isOn && temperature < 30){
            temperature = temperature + 1;
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public void decreaseTemperature() {
        if(isOn && temperature > 16){
            temperature = temperature - 1;
        }
    }
}

