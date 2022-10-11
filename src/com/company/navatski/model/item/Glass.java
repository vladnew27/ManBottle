package com.company.navatski.model.item;

public class Glass extends Item implements Drinkable{

    public Glass(double volume) {
        super(volume);
        System.out.println("Glass constructor invoked");
    }
}
