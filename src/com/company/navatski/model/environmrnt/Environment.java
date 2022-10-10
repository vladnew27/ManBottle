package com.company.navatski.model.environmrnt;

import com.company.navatski.model.item.Item;
import com.company.navatski.model.mammal.Mammal;


public abstract class Environment {

    private Mammal mammal;
    private Item item;

    public Mammal getMammal() {
        return mammal;
    }

    public void setMammal(Mammal mammal) {
        this.mammal = mammal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
