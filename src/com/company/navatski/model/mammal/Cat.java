package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Drinkable;

public class Cat extends Mammal implements Drinking{
//    @Override
//    public void drink(Drinkable drinkable) {
//        System.out.println(this.getName() + " lapping up from "+ drinkable.getClass().getSimpleName()); // коты не пьют, а лакают:)
//    }

    @Override
    public String getAction() {
        return " lapping up from ";
    }
}
