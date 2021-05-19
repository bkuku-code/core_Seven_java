package com.bkuku;

public class Television {
    private  String productName;
    private boolean isOn;
    private int volume;
    private int channel;

    public Television(String productName) {
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
    public void increaseVolume() {

        if(isOn && volume >= 0 && volume > 100){

            volume = volume +1;
        }
    }
    public void decreaseVolume() {
        if(isOn && volume <=1 && volume < 100) {

            volume = volume -1;
        }
    }
    public void setChannel(int channel) {
        if(isOn && channel >=0 && channel <= 25);
        this.channel =channel;
    }
}
