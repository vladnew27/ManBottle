package com.company.navatski.model.item;

public abstract class Item implements Drinkable {

    private double volume;
    public Item( ) {

        System.out.println("Item no-args constructor invoked");
    }
    public Item(double volume) {
        this.volume = volume;
        System.out.println("Item constructor invoked");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "volume=" + volume +
                '}';
    }
}
