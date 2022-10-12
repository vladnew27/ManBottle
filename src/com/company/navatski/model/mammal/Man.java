package com.company.navatski.model.mammal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.reflect.Type;

@NoArgsConstructor
public class Man extends Mammal implements Drinking {

    @Setter
    @Getter
    @Autowired
    @Qualifier("cat2")
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
