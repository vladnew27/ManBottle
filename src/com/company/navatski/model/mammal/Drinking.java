package com.company.navatski.model.mammal;

import com.company.navatski.model.item.Drinkable;

public interface Drinking {
    default String drinkDef(Drinkable drinkable){
        return getAction() + drinkable.getClass().getSimpleName();
    };
    public String getAction();
}
