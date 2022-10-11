package com.company.navatski.model.item;

public class Bottle extends Item implements Drinkable{

    public Bottle( ) {

        System.out.println("Bottle no-args constructor invoked");
    }
    public Bottle(double volume) {
        super(volume);
    }
}
