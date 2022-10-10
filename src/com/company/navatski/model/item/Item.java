package com.company.navatski.model.item;

public abstract class Item implements Drinkable {

    private double volume;

    public Item(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
