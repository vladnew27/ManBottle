package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Drinkable;

public class Man extends Mammal implements Drinking{

//    @Override
//    public void drink(Drinkable drinkable) {
//        System.out.println(this.getName() + " drinking from "+ drinkable.getClass().getSimpleName());
//    }

    @Override
    public String getAction() {
        return " drinking from ";
    }
}
