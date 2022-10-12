package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Drinkable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Mammal implements Drinking {
    private String name;
    private double stomachVolume;

    public Mammal() {
        System.out.println("Mammal no-args constructor invoked");
    }

    public void drink(Drinkable drinkable) {
        System.out.println(this.getName() + drinkDef(drinkable));
    }

    public double getStomachVolume() {
        return stomachVolume;
    }

    public void setStomachVolume(double stomachVolume) {
        this.stomachVolume = stomachVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()  + " {" +
                "name='" + name + '\'' +
                ", stomachVolume=" + stomachVolume +
                '}';
    }
}
