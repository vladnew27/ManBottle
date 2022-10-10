package com.company.navatski;

import com.company.navatski.model.environmrnt.Environment;
import com.company.navatski.model.environmrnt.EnvironmentSingleton;
import com.company.navatski.view.MainConsoleView;

public class Main {

    public static void main(String[] args) {
        EnvironmentSingleton environment =  EnvironmentSingleton.getInstance();
        MainConsoleView.show(environment);
    }
}
