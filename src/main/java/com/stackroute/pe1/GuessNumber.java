package com.stackroute.pe1;

import java.util.Scanner;

/*
To determine whether the guessed number matches with the original number or not.
 */

public class GuessNumber {
    public static String checkWhetherTheNumberGuessedIsCorrectOrNot(int[] inputNumber) {
        int originalNumber = 30;
        int i=0;
        while(true) {
            if(i < inputNumber.length) {
                if (originalNumber > inputNumber[i]) {
                } else if (originalNumber < inputNumber[i]) {
                } else {
                    return "Number guessed matches the original number";
                }
                i++;
            }
            else {
                return "Number guessed is not correct";
            }
        }
    }
}
