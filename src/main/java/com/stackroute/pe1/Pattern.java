package com.stackroute.pe1;

import java.util.Scanner;

/*
Prints the following pattern
1
22
333
4444
55555
.
.
.
nth iteration
 */

public class Pattern {

    public static String printPattern(int inputNumber) {
        String result = "";
        Integer.parseInt(String.valueOf(inputNumber));
        for (int i = 0; i <= inputNumber; i++) {
            for (int j = 0; j < i; j++) {
                result = result + i;
            }
        }
        return result;
    }
}
