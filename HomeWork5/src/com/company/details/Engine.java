package com.company.details;

public class Engine {
    private int power;
    String maker;

    public Engine(int power, String maker) {
        this.power = power;
        this.maker = maker;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
