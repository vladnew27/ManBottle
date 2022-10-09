package com.company.navatski.service;

public final class DishFactory {

    private static volatile DishFactory instance;

    private DishFactory() {
    }

    public static DishFactory getInstance(String value) {
        DishFactory result = instance;
        if (result != null) {
            return result;
        }
        synchronized (DishFactory.class) {
            if (instance == null) {
                instance = new DishFactory();
            }
            return instance;
        }
    }


}
