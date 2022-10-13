package com.company.navatski;

import com.company.navatski.model.environmrnt.Environment;
import com.company.navatski.model.environmrnt.EnvironmentSingleton;
import com.company.navatski.view.MainConsoleView;

public class Main {

    public static void main(String[] args) {
        if (args.length != 0) {
            new Emulation().doEmulation();
        }
        EnvironmentSingleton environment = EnvironmentSingleton.getInstance();
        MainConsoleView.show(environment);
    }
}
