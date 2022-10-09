package com.company.navatski.view;

import com.company.navatski.model.environmrnt.Environment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConsoleView {

    private static final String EXIT = "EXIT";
    private static final String GOOD_BYE = "Good Bye!";
    private static String input;

    public static void show(Environment environment) {

        System.out.println(WelcomePageGenerator.getWelcomePage());
        System.out.println(WelcomePageGenerator.getWelcomePage());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (!input.equalsIgnoreCase(EXIT)) {

        }
        ;

        System.out.println(GOOD_BYE);


    }

}
