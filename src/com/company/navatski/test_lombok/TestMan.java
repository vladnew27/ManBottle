package com.company.navatski.test_lombok;

import com.company.navatski.model.mammal.Cat;
import com.company.navatski.model.mammal.Man;

public class TestMan {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 300.0);
        Man man = new Man("Charli", 1000.0, cat);
        man.setPet(cat);
        System.out.println(man.toString());
        System.out.println(man.getPet());
    }
}
