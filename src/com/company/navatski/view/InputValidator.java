package com.company.navatski.view;

import com.company.navatski.model.environmrnt.EnvironmentSingleton;

import java.util.Arrays;

public class InputValidator {
    public final static String[] commands = {"CREATE", "SIMULATE", "STATUS", "EXIT", "HELP"};
    public final static String[] commands1 = {"STATUS", "EXIT", "HELP"};

    /*
    "1.1. CREATE MAMMAL - CREATE MAMMAL <type(MAN/CAT)> <name> <stomachVolume>, example CREATE MAMMAL CAT Barsik 300\n" +
            "1.2. CREATE ITEM  - CREATE ITEM <type(BOTTLE/BOWL/GLASS)> <Volume>, example CREATE ITEM BOTTLE  1000 \n" +
            "2. SIMULATE - 3 pattern: SIMULATE <created mammal> <created items>, example SIMULATE MAN BOTTLE \n" +
            "3. STATUS - 1
            "4. EXIT - 1
            "5. HELP - 1
     */
    public static boolean validate(final String[] input) throws InvalidInputException {
        // return Arrays.stream(commands).anyMatch(input[0]::contains);
        if (!Arrays.stream(commands).anyMatch(input[0]::equalsIgnoreCase)) {
            throw new InvalidInputException("invalid 1st argument");
        }

        if (Arrays.stream(commands1).anyMatch(input[0]::equalsIgnoreCase)) {
            if (input.length == 1) {
                return true;
            } else {
                throw new InvalidInputException("commands STATUS, EXIT, HELP can not have arguments");
            }
        }
        switch (input[0].toUpperCase()) {
            case "CREATE":
                validateCreate(input);
                break;
            case "SIMULATE":
                validateSimulate(input);
                break;
            default:
                throw new InvalidInputException("invalid 1st argument");
        }
        return true;
    }

    public static boolean validateCreate(final String[] input) throws InvalidInputException {
// "1.1. CREATE MAMMAL - 5 args CREATE MAMMAL <type(MAN/CAT)> <name> <stomachVolume>, example CREATE MAMMAL CAT Barsik 300\n" +
//  "1.2. CREATE ITEM  - 4 CREATE ITEM <type(BOTTLE/BOWL/GLASS)> <Volume>, example CREATE ITEM BOTTLE  1000 \n" +
        switch (input[1].toUpperCase()) {
            case "MAMMAL":
                validateCreateMammal(input);
                break;
            case "ITEM":
                validateCreateItem(input);
                break;
            default:
                throw new InvalidInputException("invalid 2nd argument, after command CREATE must go MAMMAL or ITEM");
        }
   return true;
    }



    private static boolean validateCreateMammal(String[] input) {
        //todo
        return true;
    }

    private static boolean validateCreateItem(String[] input) {
        //todo
        return true;
    }


    public static boolean validateSimulate(final String[] input) throws InvalidInputException {
        if (input.length != 3) {
            throw new InvalidInputException("command SIMULATE must have 3 args");
        }
        checkMammal(input);
        checkItem(input);
        return true;
    }

    public static boolean checkMammal(final String[] input) throws InvalidInputException {
        if (!EnvironmentSingleton.getInstance().getMammal().getClass().getName().equalsIgnoreCase(input[1])) {
            throw new InvalidInputException(input[1] + " - no such mammal in the environment");
        }
        return true;
    }

    public static boolean checkItem(final String[] input) throws InvalidInputException {
        if (!EnvironmentSingleton.getInstance().getItem().getClass().getName().equalsIgnoreCase(input[2])) {
            throw new InvalidInputException(input[2] + " - no such Item in the environment");
        }
        return true;
    }


}
