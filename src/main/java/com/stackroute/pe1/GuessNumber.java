package com.stackroute.pe1;

import java.util.Scanner;

/*
To determine whether the guessed number matches with the original number or not.
 */

public class GuessNumber {
    public static String checkWhetherTheNumberGuessedIsCorrectOrNot(int[] inputNumber) {
        Scanner scanner = new Scanner(System.in);;
        int originalNumber = 30;
        int i=0;
        int number;
        while(true) {
            number = inputNumber[i];
            if(i < inputNumber.length) {
                if (originalNumber > inputNumber[i]) {
                    System.out.println("Number guessed is less than original number");
                } else if (originalNumber < inputNumber[i]) {
                    System.out.println("Number guessed is more than original number");
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
