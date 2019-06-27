package com.stackroute.pe1;

import java.util.Scanner;

/*
To determine whether the input string is a main.java.com.stackroute.pe1.Palindrome or not.
 */

public class Palindrome {

    public static String checkWhetherStringIsPalindromeOrNot(String inputString) {
        int sum = 0;
        try {
            Integer.parseInt(inputString);
            StringBuilder stringBuilder = new StringBuilder(inputString);
            String reverseOfAString = stringBuilder.reverse().toString();
            if (inputString.equals(reverseOfAString)) {
                for (int i = 0; i < reverseOfAString.length(); i++) {
                    if (Character.getNumericValue(inputString.charAt(i)) % 2 == 0) {
                        sum = sum + Character.getNumericValue(inputString.charAt(i));
                    }
                }
                if (sum > 25) {
                    return "String is palindrome and sum of even numbers is greater than 25";
                } else {
                    return "String is palindrome and sum of even numbers is less than 25";
                }
            } else {
                return "String is not palindrome";
            }
        }
        catch(NumberFormatException exception) {
            return "Input is not valid";
        }
    }
}
