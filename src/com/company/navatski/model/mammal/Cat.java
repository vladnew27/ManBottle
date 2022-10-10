package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Drinkable;

public class Cat extends Mammal implements Drinking{

    @Override
    public void drink(Drinkable drinkable) {
        System.out.println(this.getName() + " lapping up from "+ drinkable.getClass().getName()); // коты не пьют, а лакают:)
    }
}
