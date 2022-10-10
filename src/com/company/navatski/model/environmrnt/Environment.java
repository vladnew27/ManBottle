package com.company.navatski.model.environmrnt;

import com.company.navatski.model.item.Item;
import com.company.navatski.model.mammal.Mammal;


public abstract class Environment {

    private static Mammal mammal;
    private static Item item;

    public static Mammal getMammal() {
        return mammal;
    }

    public static void setMammal(Mammal mammal) {
        Environment.mammal = mammal;
    }

    public static Item getItem() {
        return item;
    }

    public static void setItem(Item item) {
        Environment.item = item;
    }
}
