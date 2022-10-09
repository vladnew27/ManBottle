package com.company.navatski.model.environmrnt;

import com.company.navatski.model.Action;
import com.company.navatski.model.Item;
import com.company.navatski.model.man.Man;

import java.util.Map;

public final class EnvironmentSingleton extends Environment {
    private static volatile EnvironmentSingleton instance;

    private EnvironmentSingleton() {
    }

    public static EnvironmentSingleton getInstance() {
        EnvironmentSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (EnvironmentSingleton.class) {
            if (instance == null) {
                instance = new EnvironmentSingleton();
            }
            return instance;
        }
    }


}
