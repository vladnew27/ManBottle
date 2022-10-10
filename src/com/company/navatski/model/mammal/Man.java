package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Item;

public class Man extends Mammal implements ItemHandling{
    private String name;
    private double handRadius;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public double setHandRadius(double handRadius) {
        this.handRadius = handRadius;
        return this.handRadius;
    }

    @Override
    public String takeItem(Item item) {

       new StringBuilder(name).append(" took ").append(item.getType())
        return null;
    }
}
