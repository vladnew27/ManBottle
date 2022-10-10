package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Drinkable;
import com.company.navatski.model.item.Item;

public class Man extends Mammal implements Drinking{




    @Override
    public void drink(Drinkable drinkable) {
        System.out.println(this.getName() + " drinking from "+ drinkable.getClass().getName());
    }
}