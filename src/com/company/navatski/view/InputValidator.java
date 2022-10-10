package com.company.navatski.view;

import java.util.Arrays;

public class InputValidator {
    public final static String[] commands = { "CREATE", "SIMULATE", "STATUS", "EXIT", "HELP"};
    public static boolean validate(String[] input){
       // return Arrays.stream(commands).anyMatch(input[0]::contains);
         return Arrays.stream(commands).anyMatch(input[0]::equalsIgnoreCase);
//        return Arrays.stream(commands).anyMatch(
//
//              //  input[0]::contains
//                (x) ->   x.contains(input[0])
//
//
//        );
    }
}
