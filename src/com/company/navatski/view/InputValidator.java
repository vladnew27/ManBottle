package com.company.navatski.view;

public class InputValidator {
    public final static String[] commands = { "CREATE", "SIMULATE", "STATUS", "EXIT", "HELP"};
    public static boolean validate(String[] input){
        return Arrays.stream(commands).anyMatch(input::contains);
    }
}
