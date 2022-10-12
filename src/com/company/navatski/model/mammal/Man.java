package com.company.navatski.model.mammal;

import lombok.Getter;
import lombok.Setter;

public class Man extends Mammal implements Drinking {
    @Setter
    @Getter
    private Petable pet;

    public Man(String name, double stomachVolume, Petable pet) {
        super(name, stomachVolume);
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
