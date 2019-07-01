package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Scanner;

/*
Accepts the numbers as input from user and perform the following:
1. Sorts the numbers in non-increasing order
2. After sorting, sum of all even numbers is calculated and checked if it is greater than 15.
3. If sum is greater than 15, prints true else prints false
 */

public class SortDigitsOfANumber {

    public static String sortDigitsAndAddEvenDigits(String inputString) {
        int sumOfNumbers = 0;
        String result = "";
        char[] inputStringArray = inputString.toCharArray();
        Arrays.sort(inputStringArray);
        String order = new String(inputStringArray);
        StringBuilder stringBuilder = new StringBuilder(order);
        order = stringBuilder.reverse().toString();
        for(int i=0; i<order.length(); i++) {
            if((Character.getNumericValue(order.charAt(i))%2) == 0) {
                sumOfNumbers = sumOfNumbers + Character.getNumericValue(order.charAt(i));
            }
        }
        if(sumOfNumbers > 15) {
            result = result + "True";
        }
        else {
            result = result + "False";
        }
        return result;
    }
}
