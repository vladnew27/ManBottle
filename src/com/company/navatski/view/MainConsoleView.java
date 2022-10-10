package com.company.navatski.view;

import com.company.navatski.model.environmrnt.Environment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConsoleView {

    private static final String EXIT = "EXIT";
    private static final String GOOD_BYE = "Good Bye!";
    private static final String INVALID_INPUT = "Invalid input. for help write HELP";
    private static String[] input;

    public static void show(Environment environment) {

        System.out.println(TextGenerator.getWelcomeText());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println(TextGenerator.askInputText());
            try {
                input = reader.readLine().toUpperCase().split("\\s+");
            } catch (IOException e) {
                e.printStackTrace();
            }
            // validate
            try {
               InputValidator.validate(input);


                      //todo logic if valid input

            } catch (InvalidInputException e) {
               // e.printStackTrace();
                System.out.println(INVALID_INPUT);
                System.out.println(e.getMessage());
                System.out.println(TextGenerator.askInputText());
            }

        }
        while (!input[0].equalsIgnoreCase(EXIT));

        System.out.println(GOOD_BYE);


    }

}
