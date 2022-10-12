package com.company.navatski.model.mammal;

public class Man extends Mammal implements Drinking {

    private Petable pet;

    public Petable getPet() {
        return pet;
    }

    public void setPet(Petable pet) {
        this.pet = pet;
    }

    @Override
    public String getAction() {
        return " drinking from ";
    }

    @Override
    public String toString() {
        return super.toString() +
                " pet=" + pet +
                '}';
    }
}
