package com.company.navatski.service;

import com.company.navatski.model.environmrnt.Environment;
import com.company.navatski.model.item.Item;
import com.company.navatski.model.mammal.Mammal;
import com.google.gson.Gson;

public class EnvironmentService {
    Mammal mammal;
    Item item;

    public static String doSimulation(){
        mammal.drinkFrom(item);
        return "";//todo
    }
    public static String getStatus(Environment environment) {
        return new Gson().toJson(environment);
    }
}
