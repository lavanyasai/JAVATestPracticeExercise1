package com.stackroute.pe1;

import java.util.Scanner;

/*
Repeats the specified number of letters for given number of times.
 */

public class RepeatWords {
    public static String repeatSpecifiedWords(String inputString, int repeatStringInput) {
        int length = inputString.length();
        String constant = inputString.substring(0, length-repeatStringInput);
        String repeat = inputString.substring(length-repeatStringInput);
        String result = "";
        result = result + constant;
        for(int i=0; i<=repeatStringInput ;i++) {
            result = result + repeat;
        }
        return result;
    }
}
