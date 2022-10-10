package com.company.navatski.model.mammal;

public abstract class Mammal implements Drinking {
    private String name;

    public double getStomachVolume() {
        return stomachVolume;
    }

    public void setStomachVolume(double stomachVolume) {
        this.stomachVolume = stomachVolume;
    }

    private double stomachVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
