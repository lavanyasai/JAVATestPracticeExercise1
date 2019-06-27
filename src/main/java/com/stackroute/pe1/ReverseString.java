package com.stackroute.pe1;

import java.util.Scanner;

/*
Reverse of a string.
 */

public class ReverseString {
    public static String reverseString(String inputString) {
        String reverse = "";
        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            reverse = reverse.concat(String.valueOf(inputString.charAt(i)));
        }
        return reverse;
    }
}
